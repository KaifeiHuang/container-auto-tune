/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 基线管理表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BaseLine implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       id;
    private Integer       appId;
    private Integer       pipelineId;
    private Integer       jvmMarketId;
    private LocalDateTime createdTime;
    private Integer       version;

    public BaseLine() {}

    public BaseLine(BaseLine value) {
        this.id = value.id;
        this.appId = value.appId;
        this.pipelineId = value.pipelineId;
        this.jvmMarketId = value.jvmMarketId;
        this.createdTime = value.createdTime;
        this.version = value.version;
    }

    public BaseLine(
        Integer       id,
        Integer       appId,
        Integer       pipelineId,
        Integer       jvmMarketId,
        LocalDateTime createdTime,
        Integer       version
    ) {
        this.id = id;
        this.appId = appId;
        this.pipelineId = pipelineId;
        this.jvmMarketId = jvmMarketId;
        this.createdTime = createdTime;
        this.version = version;
    }

    /**
     * Getter for <code>tmaestro-lite.base_line.ID</code>. 主键ID
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>tmaestro-lite.base_line.ID</code>. 主键ID
     */
    public BaseLine setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.base_line.APP_ID</code>. 关联的应用id
     */
    public Integer getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>tmaestro-lite.base_line.APP_ID</code>. 关联的应用id
     */
    public BaseLine setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.base_line.PIPELINE_ID</code>. 关联的集群id
     */
    public Integer getPipelineId() {
        return this.pipelineId;
    }

    /**
     * Setter for <code>tmaestro-lite.base_line.PIPELINE_ID</code>. 关联的集群id
     */
    public BaseLine setPipelineId(Integer pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.base_line.JVM_MARKET_ID</code>.
     */
    public Integer getJvmMarketId() {
        return this.jvmMarketId;
    }

    /**
     * Setter for <code>tmaestro-lite.base_line.JVM_MARKET_ID</code>.
     */
    public BaseLine setJvmMarketId(Integer jvmMarketId) {
        this.jvmMarketId = jvmMarketId;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.base_line.CREATED_TIME</code>.
     */
    public LocalDateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Setter for <code>tmaestro-lite.base_line.CREATED_TIME</code>.
     */
    public BaseLine setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.base_line.VERSION</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Setter for <code>tmaestro-lite.base_line.VERSION</code>.
     */
    public BaseLine setVersion(Integer version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BaseLine (");

        sb.append(id);
        sb.append(", ").append(appId);
        sb.append(", ").append(pipelineId);
        sb.append(", ").append(jvmMarketId);
        sb.append(", ").append(createdTime);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}
