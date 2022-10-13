/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.alipay.autotuneservice.model.tune.params;

import com.alipay.autotuneservice.controller.model.configVO.TuneConfig;
import com.alipay.autotuneservice.controller.model.tuneparam.TuneParamAttributeEnum;
import com.alipay.autotuneservice.controller.model.tuneparam.TuneParamItem;
import com.alipay.autotuneservice.controller.model.tuneparam.TuneParamVO;
import com.google.common.collect.Lists;
import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author huangkaifei
 * @version : DecisionedTuneParam.java, v 0.1 2022年05月20日 11:36 PM huangkaifei Exp $
 */
@Data
public class DecisionedTuneParam {

    /**
     * 决定调优的调优参数
     */
    private String decisionedTuneParams = "";

    /**
     * 决定调优的调优分组
     */
    private List<TuneConfig> decisionedTuneGroups = Lists.newArrayList();

    public void setDecisionedTuneParams(List<TuneParamVO> tuneParamVOList) {
        if (CollectionUtils.isEmpty(tuneParamVOList)) {
            return;
        }
        this.decisionedTuneParams = tuneParamVOList.stream().map(TuneParamVO::getTuneParam)
                .filter(StringUtils::isNotBlank)
                .distinct()
                .collect(Collectors.joining(" "));
    }

    public void setDecisionedTuneParamItems(List<TuneParamItem> list) {
        if (CollectionUtils.isEmpty(list)) {
            return;
        }
        List<TuneParamItem> collect = list.stream().map(item -> {
            // 设置参数顺序
            item.setParamOrder(JVMParamEnum.getParamOrder(item.getCurrentTuneParam()));
            return item;
        })
                .sorted((o1, o2) -> o1.getParamOrder() > o2.getParamOrder() ? 1 : -1).collect(Collectors.toList());
        this.decisionedTuneParams = list.stream().map(item -> {
            // 设置参数顺序
            String param = StringUtils.isNotBlank(item.getCurrentTuneParam()) ? item.getCurrentTuneParam() : item.getOriginTuneParam();
            item.setParamOrder(JVMParamEnum.getParamOrder(param));
            return item;
        })
                .sorted((o1, o2) -> o1.getParamOrder() > o2.getParamOrder() ? 1 : -1)
                .map(item -> {
                    if (item.getAttributeEnum() == TuneParamAttributeEnum.DELETE) {
                        return null;
                    }
                    // 参数类型是REPLACE, NEW,SAME使用currentValue
                    if (StringUtils.isNotBlank(item.getCurrentTuneParam())) {
                        return item.getCurrentTuneParam();
                    }
                    return null;
                })
                .filter(StringUtils::isNotBlank)
                .distinct()
                .collect(Collectors.joining(" "));
    }
}