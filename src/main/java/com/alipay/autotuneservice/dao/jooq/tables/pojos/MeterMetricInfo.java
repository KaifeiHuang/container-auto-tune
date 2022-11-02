/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MeterMetricInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String metricName;
    private Long   appId;
    private String appName;
    private Long   gmtCreated;
    private String data;
    private Long   dt;
    private String metricVendor;

    public MeterMetricInfo() {}

    public MeterMetricInfo(MeterMetricInfo value) {
        this.metricName = value.metricName;
        this.appId = value.appId;
        this.appName = value.appName;
        this.gmtCreated = value.gmtCreated;
        this.data = value.data;
        this.dt = value.dt;
        this.metricVendor = value.metricVendor;
    }

    public MeterMetricInfo(
        String metricName,
        Long   appId,
        String appName,
        Long   gmtCreated,
        String data,
        Long   dt,
        String metricVendor
    ) {
        this.metricName = metricName;
        this.appId = appId;
        this.appName = appName;
        this.gmtCreated = gmtCreated;
        this.data = data;
        this.dt = dt;
        this.metricVendor = metricVendor;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.METER_METRIC_INFO.METRIC_NAME</code>. pod name
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.METER_METRIC_INFO.METRIC_NAME</code>. pod name
     */
    public MeterMetricInfo setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.METER_METRIC_INFO.APP_ID</code>. app id
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.METER_METRIC_INFO.APP_ID</code>. app id
     */
    public MeterMetricInfo setAppId(Long appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.METER_METRIC_INFO.APP_NAME</code>. app name
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.METER_METRIC_INFO.APP_NAME</code>. app name
     */
    public MeterMetricInfo setAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.METER_METRIC_INFO.GMT_CREATED</code>. 创建时间
     */
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.METER_METRIC_INFO.GMT_CREATED</code>. 创建时间
     */
    public MeterMetricInfo setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.METER_METRIC_INFO.DATA</code>. data
     */
    public String getData() {
        return this.data;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.METER_METRIC_INFO.DATA</code>. data
     */
    public MeterMetricInfo setData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.METER_METRIC_INFO.DT</code>. 天分区
     */
    public Long getDt() {
        return this.dt;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.METER_METRIC_INFO.DT</code>. 天分区
     */
    public MeterMetricInfo setDt(Long dt) {
        this.dt = dt;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.METER_METRIC_INFO.METRIC_VENDOR</code>. jvm state
     */
    public String getMetricVendor() {
        return this.metricVendor;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.METER_METRIC_INFO.METRIC_VENDOR</code>. jvm state
     */
    public MeterMetricInfo setMetricVendor(String metricVendor) {
        this.metricVendor = metricVendor;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MeterMetricInfo (");

        sb.append(metricName);
        sb.append(", ").append(appId);
        sb.append(", ").append(appName);
        sb.append(", ").append(gmtCreated);
        sb.append(", ").append(data);
        sb.append(", ").append(dt);
        sb.append(", ").append(metricVendor);

        sb.append(")");
        return sb.toString();
    }
}