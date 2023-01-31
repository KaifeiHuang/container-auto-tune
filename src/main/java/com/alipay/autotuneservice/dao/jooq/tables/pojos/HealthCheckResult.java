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
public class HealthCheckResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       id;
    private Integer       appId;
    private String        accessToken;
    private String        createdBy;
    private LocalDateTime createdTime;
    private LocalDateTime updateTime;
    private String        createMode;
    private String        status;
    private String        probleam;
    private String        report;
    private String        reportDetail;

    public HealthCheckResult() {}

    public HealthCheckResult(HealthCheckResult value) {
        this.id = value.id;
        this.appId = value.appId;
        this.accessToken = value.accessToken;
        this.createdBy = value.createdBy;
        this.createdTime = value.createdTime;
        this.updateTime = value.updateTime;
        this.createMode = value.createMode;
        this.status = value.status;
        this.probleam = value.probleam;
        this.report = value.report;
        this.reportDetail = value.reportDetail;
    }

    public HealthCheckResult(
        Integer       id,
        Integer       appId,
        String        accessToken,
        String        createdBy,
        LocalDateTime createdTime,
        LocalDateTime updateTime,
        String        createMode,
        String        status,
        String        probleam,
        String        report,
        String        reportDetail
    ) {
        this.id = id;
        this.appId = appId;
        this.accessToken = accessToken;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updateTime = updateTime;
        this.createMode = createMode;
        this.status = status;
        this.probleam = probleam;
        this.report = report;
        this.reportDetail = reportDetail;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.ID</code>. 主键ID
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.ID</code>. 主键ID
     */
    public HealthCheckResult setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.APP_ID</code>. 关联的集群id
     */
    public Integer getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.APP_ID</code>. 关联的集群id
     */
    public HealthCheckResult setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.ACCESS_TOKEN</code>. 关联的token
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.ACCESS_TOKEN</code>. 关联的token
     */
    public HealthCheckResult setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.CREATED_BY</code>. 创建人
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.CREATED_BY</code>. 创建人
     */
    public HealthCheckResult setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.CREATED_TIME</code>. 创建时间
     */
    public LocalDateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.CREATED_TIME</code>. 创建时间
     */
    public HealthCheckResult setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.UPDATE_TIME</code>. 检查完成后更新时间
     */
    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.UPDATE_TIME</code>. 检查完成后更新时间
     */
    public HealthCheckResult setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.CREATE_MODE</code>. online 在线 offline 离线任务
     */
    public String getCreateMode() {
        return this.createMode;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.CREATE_MODE</code>. online 在线 offline 离线任务
     */
    public HealthCheckResult setCreateMode(String createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.STATUS</code>. 检测状态
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.STATUS</code>. 检测状态
     */
    public HealthCheckResult setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.PROBLEAM</code>. 检查简要结果
     */
    public String getProbleam() {
        return this.probleam;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.PROBLEAM</code>. 检查简要结果
     */
    public HealthCheckResult setProbleam(String probleam) {
        this.probleam = probleam;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.REPORT</code>. 结果报告
     */
    public String getReport() {
        return this.report;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.REPORT</code>. 结果报告
     */
    public HealthCheckResult setReport(String report) {
        this.report = report;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.REPORT_DETAIL</code>. 结果报告详情
     */
    public String getReportDetail() {
        return this.reportDetail;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT.REPORT_DETAIL</code>. 结果报告详情
     */
    public HealthCheckResult setReportDetail(String reportDetail) {
        this.reportDetail = reportDetail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HealthCheckResult (");

        sb.append(id);
        sb.append(", ").append(appId);
        sb.append(", ").append(accessToken);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(createMode);
        sb.append(", ").append(status);
        sb.append(", ").append(probleam);
        sb.append(", ").append(report);
        sb.append(", ").append(reportDetail);

        sb.append(")");
        return sb.toString();
    }
}