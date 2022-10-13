/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 应用日志
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Integer       appId;
    private String        logType;
    private String        s3Key;
    private String        hostName;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
    private String        fileName;

    public AppLog() {}

    public AppLog(AppLog value) {
        this.id = value.id;
        this.appId = value.appId;
        this.logType = value.logType;
        this.s3Key = value.s3Key;
        this.hostName = value.hostName;
        this.createdTime = value.createdTime;
        this.updatedTime = value.updatedTime;
        this.fileName = value.fileName;
    }

    public AppLog(
        Long          id,
        Integer       appId,
        String        logType,
        String        s3Key,
        String        hostName,
        LocalDateTime createdTime,
        LocalDateTime updatedTime,
        String        fileName
    ) {
        this.id = id;
        this.appId = appId;
        this.logType = logType;
        this.s3Key = s3Key;
        this.hostName = hostName;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.fileName = fileName;
    }

    /**
     * Getter for <code>tmaestro-lite.app_log.ID</code>. 主键
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>tmaestro-lite.app_log.ID</code>. 主键
     */
    public AppLog setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.app_log.APP_ID</code>. 应用id
     */
    public Integer getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>tmaestro-lite.app_log.APP_ID</code>. 应用id
     */
    public AppLog setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.app_log.LOG_TYPE</code>. 日志类型
     */
    public String getLogType() {
        return this.logType;
    }

    /**
     * Setter for <code>tmaestro-lite.app_log.LOG_TYPE</code>. 日志类型
     */
    public AppLog setLogType(String logType) {
        this.logType = logType;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.app_log.S3_KEY</code>. s3文件key
     */
    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * Setter for <code>tmaestro-lite.app_log.S3_KEY</code>. s3文件key
     */
    public AppLog setS3Key(String s3Key) {
        this.s3Key = s3Key;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.app_log.HOST_NAME</code>. 主机名
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * Setter for <code>tmaestro-lite.app_log.HOST_NAME</code>. 主机名
     */
    public AppLog setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.app_log.CREATED_TIME</code>. 创建时间
     */
    public LocalDateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Setter for <code>tmaestro-lite.app_log.CREATED_TIME</code>. 创建时间
     */
    public AppLog setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.app_log.UPDATED_TIME</code>. 更新时间
     */
    public LocalDateTime getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * Setter for <code>tmaestro-lite.app_log.UPDATED_TIME</code>. 更新时间
     */
    public AppLog setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.app_log.FILE_NAME</code>. 文件名
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * Setter for <code>tmaestro-lite.app_log.FILE_NAME</code>. 文件名
     */
    public AppLog setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AppLog (");

        sb.append(id);
        sb.append(", ").append(appId);
        sb.append(", ").append(logType);
        sb.append(", ").append(s3Key);
        sb.append(", ").append(hostName);
        sb.append(", ").append(createdTime);
        sb.append(", ").append(updatedTime);
        sb.append(", ").append(fileName);

        sb.append(")");
        return sb.toString();
    }
}
