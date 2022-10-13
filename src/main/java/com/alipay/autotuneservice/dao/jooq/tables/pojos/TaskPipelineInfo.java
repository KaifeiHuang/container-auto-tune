/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 任务管理表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskPipelineInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       id;
    private String        accessToken;
    private String        executeClusterId;
    private String        executeNodeId;
    private String        reportType;
    private String        executeType;
    private String        executeParam;
    private LocalDateTime executeFutureTime;
    private LocalDateTime executeTime;
    private Integer       ruleIds;
    private Integer       reportId;
    private String        createdBy;
    private LocalDateTime createdTime;
    private String        status;

    public TaskPipelineInfo() {}

    public TaskPipelineInfo(TaskPipelineInfo value) {
        this.id = value.id;
        this.accessToken = value.accessToken;
        this.executeClusterId = value.executeClusterId;
        this.executeNodeId = value.executeNodeId;
        this.reportType = value.reportType;
        this.executeType = value.executeType;
        this.executeParam = value.executeParam;
        this.executeFutureTime = value.executeFutureTime;
        this.executeTime = value.executeTime;
        this.ruleIds = value.ruleIds;
        this.reportId = value.reportId;
        this.createdBy = value.createdBy;
        this.createdTime = value.createdTime;
        this.status = value.status;
    }

    public TaskPipelineInfo(
        Integer       id,
        String        accessToken,
        String        executeClusterId,
        String        executeNodeId,
        String        reportType,
        String        executeType,
        String        executeParam,
        LocalDateTime executeFutureTime,
        LocalDateTime executeTime,
        Integer       ruleIds,
        Integer       reportId,
        String        createdBy,
        LocalDateTime createdTime,
        String        status
    ) {
        this.id = id;
        this.accessToken = accessToken;
        this.executeClusterId = executeClusterId;
        this.executeNodeId = executeNodeId;
        this.reportType = reportType;
        this.executeType = executeType;
        this.executeParam = executeParam;
        this.executeFutureTime = executeFutureTime;
        this.executeTime = executeTime;
        this.ruleIds = ruleIds;
        this.reportId = reportId;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.status = status;
    }

    /**
     * Getter for <code>tmaestro-lite.task_pipeline_info.ID</code>. 主键ID
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>tmaestro-lite.task_pipeline_info.ID</code>. 主键ID
     */
    public TaskPipelineInfo setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.task_pipeline_info.ACCESS_TOKEN</code>. 关联的token
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * Setter for <code>tmaestro-lite.task_pipeline_info.ACCESS_TOKEN</code>. 关联的token
     */
    public TaskPipelineInfo setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.task_pipeline_info.EXECUTE_CLUSTER_ID</code>. 执行集群ID
     */
    public String getExecuteClusterId() {
        return this.executeClusterId;
    }

    /**
     * Setter for <code>tmaestro-lite.task_pipeline_info.EXECUTE_CLUSTER_ID</code>. 执行集群ID
     */
    public TaskPipelineInfo setExecuteClusterId(String executeClusterId) {
        this.executeClusterId = executeClusterId;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.task_pipeline_info.EXECUTE_NODE_ID</code>. 执行单机ID
     */
    public String getExecuteNodeId() {
        return this.executeNodeId;
    }

    /**
     * Setter for <code>tmaestro-lite.task_pipeline_info.EXECUTE_NODE_ID</code>. 执行单机ID
     */
    public TaskPipelineInfo setExecuteNodeId(String executeNodeId) {
        this.executeNodeId = executeNodeId;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.task_pipeline_info.REPORT_TYPE</code>. 报告类型;报告类型：线程、内存、GC、ALL、TUNE
     */
    public String getReportType() {
        return this.reportType;
    }

    /**
     * Setter for <code>tmaestro-lite.task_pipeline_info.REPORT_TYPE</code>. 报告类型;报告类型：线程、内存、GC、ALL、TUNE
     */
    public TaskPipelineInfo setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.task_pipeline_info.EXECUTE_TYPE</code>. 执行类型;执行类型：人工、定时、阈值、upload
     */
    public String getExecuteType() {
        return this.executeType;
    }

    /**
     * Setter for <code>tmaestro-lite.task_pipeline_info.EXECUTE_TYPE</code>. 执行类型;执行类型：人工、定时、阈值、upload
     */
    public TaskPipelineInfo setExecuteType(String executeType) {
        this.executeType = executeType;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.task_pipeline_info.EXECUTE_PARAM</code>. 执行参数
     */
    public String getExecuteParam() {
        return this.executeParam;
    }

    /**
     * Setter for <code>tmaestro-lite.task_pipeline_info.EXECUTE_PARAM</code>. 执行参数
     */
    public TaskPipelineInfo setExecuteParam(String executeParam) {
        this.executeParam = executeParam;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.task_pipeline_info.EXECUTE_FUTURE_TIME</code>. 期望执行时间
     */
    public LocalDateTime getExecuteFutureTime() {
        return this.executeFutureTime;
    }

    /**
     * Setter for <code>tmaestro-lite.task_pipeline_info.EXECUTE_FUTURE_TIME</code>. 期望执行时间
     */
    public TaskPipelineInfo setExecuteFutureTime(LocalDateTime executeFutureTime) {
        this.executeFutureTime = executeFutureTime;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.task_pipeline_info.EXECUTE_TIME</code>. 实际执行时间
     */
    public LocalDateTime getExecuteTime() {
        return this.executeTime;
    }

    /**
     * Setter for <code>tmaestro-lite.task_pipeline_info.EXECUTE_TIME</code>. 实际执行时间
     */
    public TaskPipelineInfo setExecuteTime(LocalDateTime executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.task_pipeline_info.RULE_IDS</code>. 关联的规则id;[]
     */
    public Integer getRuleIds() {
        return this.ruleIds;
    }

    /**
     * Setter for <code>tmaestro-lite.task_pipeline_info.RULE_IDS</code>. 关联的规则id;[]
     */
    public TaskPipelineInfo setRuleIds(Integer ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.task_pipeline_info.REPORT_ID</code>. 关联的报告id
     */
    public Integer getReportId() {
        return this.reportId;
    }

    /**
     * Setter for <code>tmaestro-lite.task_pipeline_info.REPORT_ID</code>. 关联的报告id
     */
    public TaskPipelineInfo setReportId(Integer reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.task_pipeline_info.CREATED_BY</code>. 创建人
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>tmaestro-lite.task_pipeline_info.CREATED_BY</code>. 创建人
     */
    public TaskPipelineInfo setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.task_pipeline_info.CREATED_TIME</code>. 创建时间
     */
    public LocalDateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Setter for <code>tmaestro-lite.task_pipeline_info.CREATED_TIME</code>. 创建时间
     */
    public TaskPipelineInfo setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.task_pipeline_info.STATUS</code>. 状态;准备--&gt;运行(采集日志、分析日志)---&gt;结束
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>tmaestro-lite.task_pipeline_info.STATUS</code>. 状态;准备--&gt;运行(采集日志、分析日志)---&gt;结束
     */
    public TaskPipelineInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TaskPipelineInfo (");

        sb.append(id);
        sb.append(", ").append(accessToken);
        sb.append(", ").append(executeClusterId);
        sb.append(", ").append(executeNodeId);
        sb.append(", ").append(reportType);
        sb.append(", ").append(executeType);
        sb.append(", ").append(executeParam);
        sb.append(", ").append(executeFutureTime);
        sb.append(", ").append(executeTime);
        sb.append(", ").append(ruleIds);
        sb.append(", ").append(reportId);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdTime);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
