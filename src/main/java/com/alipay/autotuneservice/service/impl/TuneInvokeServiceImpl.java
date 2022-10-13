/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.alipay.autotuneservice.service.impl;

import com.alipay.autotuneservice.dao.JvmMarketInfo;
import com.alipay.autotuneservice.dao.TunePlanRepository;
import com.alipay.autotuneservice.dao.TuningParamTaskData;
import com.alipay.autotuneservice.dao.jooq.tables.records.AppInfoRecord;
import com.alipay.autotuneservice.dao.jooq.tables.records.TuningParamTaskDataRecord;
import com.alipay.autotuneservice.model.pipeline.TuneContext;
import com.alipay.autotuneservice.model.pipeline.TunePipeline;
import com.alipay.autotuneservice.model.tune.TunePlan;
import com.alipay.autotuneservice.model.tune.TuneTaskStatus;
import com.alipay.autotuneservice.service.AppInfoService;
import com.alipay.autotuneservice.service.TuneInvokeService;
import com.alipay.autotuneservice.service.notification.EmailModelService;
import com.alipay.autotuneservice.service.pipeline.TunePipelineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * 调参主流程执行入口
 *
 * @author chenqu
 * @version : TuneInvokeService.java, v 0.1 2022年04月18日 15:06 chenqu Exp $
 */
@Slf4j
@Service
public class TuneInvokeServiceImpl implements TuneInvokeService {

    @Autowired
    private TunePlanRepository  tunePlanInfo;
    @Autowired
    private TunePipelineService tunePipelineService;
    @Autowired
    private TuningParamTaskData tuningParamTaskData;
    @Autowired
    private AppInfoService      appInfoService;
    @Autowired
    private EmailModelService emailModelService;
    @Autowired
    private JvmMarketInfo jvmMarketInfo;

    @Override
    public Integer submitTunePlan(Integer tunePlanId) {
        try {
            TunePlan tunePlan = tunePlanInfo.findRunningTunePlanById(tunePlanId);
            if (tunePlan == null) {
                throw new RuntimeException("submitTunePlan is error,not found running plan");
            }
            //下发任务
            //创建pipeline
            TuneContext tuneContext = new TuneContext(tunePlan.getAccessToken(), tunePlan.getAppId());
            tuneContext.setTunePlanId(tunePlanId);
            tuneContext.setHealthCheckId(tunePlan.getHealthCheckId());
            TunePipeline tunePipeline = tunePipelineService.createPipeline(tuneContext);
            //创建算法交互设计
            initTaskData(tunePipeline.getId(), tuneContext.getAppId());
            emailModelService.tuneSubmitEmail(tunePipeline.getId(), tuneContext.getAppId());
            return tunePipeline.getId();
        } catch (Exception e) {
            log.error(String.format("submitTunePlan is error-->[%s]", e.getMessage()), e);
            return 0;
        }
    }

    @Override
    public Integer submitJvm(Integer tunePlanId, String jvmParam, Double grayRatio ) {
        try {
            TunePlan tunePlan = tunePlanInfo.findRunningTunePlanById(tunePlanId);
            if (tunePlan == null) {
                throw new RuntimeException("submitTunePlan is error,not found running plan");
            }
            //下发任务
            //创建pipeline
            String temp  = jvmParam.replaceAll("nbsp;"," ").replaceAll("&amp;","");
            TuneContext tuneContext = new TuneContext(tunePlan.getAccessToken(), tunePlan.getAppId(), temp, grayRatio);
            tuneContext.setTunePlanId(tunePlanId);
            TunePipeline tunePipeline = tunePipelineService.createPipeline(tuneContext);
            jvmMarketInfo.getOrInsertJvmByCMD(temp, tunePipeline.getAppId(), tunePipeline.getPipelineId());
            emailModelService.tuneSubmitEmail(tunePipeline.getId(), tuneContext.getAppId());
            return tunePipeline.getId();
        } catch (Exception e) {
            log.error(String.format("submitTunePlan is error-->[%s]", e.getMessage()), e);
            return 0;
        }
    }

    private void initTaskData(Integer pipelineId, Integer appId) {
        TuningParamTaskDataRecord record = new TuningParamTaskDataRecord();
        record.setPipelineId(pipelineId);
        record.setAppId(appId);
        AppInfoRecord appInfoRecord = appInfoService.selectById(appId);
        record.setAppName(appInfoRecord.getAppName());
        record.setStartTime(LocalDateTime.now());
        //初始置位RUNNING
        record.setTaskStatus(TuneTaskStatus.INIT.name());
        record.setBeforeParams(appInfoRecord.getAppDefaultJvm());
        record.setTrialStartTime(LocalDateTime.now());
        tuningParamTaskData.init(record);
    }
}