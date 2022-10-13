/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TuningParamTaskInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          infoId;
    private Integer       appId;
    private String        app;
    private String        optimizationType;
    private String        problemType;
    private String        paramDistribution;
    private String        problemId;
    private String        dt;
    private LocalDateTime writeTime;

    public TuningParamTaskInfo() {}

    public TuningParamTaskInfo(TuningParamTaskInfo value) {
        this.infoId = value.infoId;
        this.appId = value.appId;
        this.app = value.app;
        this.optimizationType = value.optimizationType;
        this.problemType = value.problemType;
        this.paramDistribution = value.paramDistribution;
        this.problemId = value.problemId;
        this.dt = value.dt;
        this.writeTime = value.writeTime;
    }

    public TuningParamTaskInfo(
        Long          infoId,
        Integer       appId,
        String        app,
        String        optimizationType,
        String        problemType,
        String        paramDistribution,
        String        problemId,
        String        dt,
        LocalDateTime writeTime
    ) {
        this.infoId = infoId;
        this.appId = appId;
        this.app = app;
        this.optimizationType = optimizationType;
        this.problemType = problemType;
        this.paramDistribution = paramDistribution;
        this.problemId = problemId;
        this.dt = dt;
        this.writeTime = writeTime;
    }

    /**
     * Getter for <code>tmaestro-lite.tuning_param_task_info.info_id</code>.
     */
    public Long getInfoId() {
        return this.infoId;
    }

    /**
     * Setter for <code>tmaestro-lite.tuning_param_task_info.info_id</code>.
     */
    public TuningParamTaskInfo setInfoId(Long infoId) {
        this.infoId = infoId;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tuning_param_task_info.app_id</code>.
     */
    public Integer getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>tmaestro-lite.tuning_param_task_info.app_id</code>.
     */
    public TuningParamTaskInfo setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tuning_param_task_info.app</code>.
     */
    public String getApp() {
        return this.app;
    }

    /**
     * Setter for <code>tmaestro-lite.tuning_param_task_info.app</code>.
     */
    public TuningParamTaskInfo setApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tuning_param_task_info.optimization_type</code>.
     */
    public String getOptimizationType() {
        return this.optimizationType;
    }

    /**
     * Setter for <code>tmaestro-lite.tuning_param_task_info.optimization_type</code>.
     */
    public TuningParamTaskInfo setOptimizationType(String optimizationType) {
        this.optimizationType = optimizationType;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tuning_param_task_info.problem_type</code>.
     */
    public String getProblemType() {
        return this.problemType;
    }

    /**
     * Setter for <code>tmaestro-lite.tuning_param_task_info.problem_type</code>.
     */
    public TuningParamTaskInfo setProblemType(String problemType) {
        this.problemType = problemType;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tuning_param_task_info.param_distribution</code>.
     */
    public String getParamDistribution() {
        return this.paramDistribution;
    }

    /**
     * Setter for <code>tmaestro-lite.tuning_param_task_info.param_distribution</code>.
     */
    public TuningParamTaskInfo setParamDistribution(String paramDistribution) {
        this.paramDistribution = paramDistribution;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tuning_param_task_info.problem_id</code>.
     */
    public String getProblemId() {
        return this.problemId;
    }

    /**
     * Setter for <code>tmaestro-lite.tuning_param_task_info.problem_id</code>.
     */
    public TuningParamTaskInfo setProblemId(String problemId) {
        this.problemId = problemId;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tuning_param_task_info.dt</code>.
     */
    public String getDt() {
        return this.dt;
    }

    /**
     * Setter for <code>tmaestro-lite.tuning_param_task_info.dt</code>.
     */
    public TuningParamTaskInfo setDt(String dt) {
        this.dt = dt;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tuning_param_task_info.write_time</code>.
     */
    public LocalDateTime getWriteTime() {
        return this.writeTime;
    }

    /**
     * Setter for <code>tmaestro-lite.tuning_param_task_info.write_time</code>.
     */
    public TuningParamTaskInfo setWriteTime(LocalDateTime writeTime) {
        this.writeTime = writeTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TuningParamTaskInfo (");

        sb.append(infoId);
        sb.append(", ").append(appId);
        sb.append(", ").append(app);
        sb.append(", ").append(optimizationType);
        sb.append(", ").append(problemType);
        sb.append(", ").append(paramDistribution);
        sb.append(", ").append(problemId);
        sb.append(", ").append(dt);
        sb.append(", ").append(writeTime);

        sb.append(")");
        return sb.toString();
    }
}