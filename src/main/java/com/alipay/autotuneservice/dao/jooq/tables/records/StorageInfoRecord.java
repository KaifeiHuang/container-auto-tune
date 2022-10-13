/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables.records;


import com.alipay.autotuneservice.dao.jooq.tables.StorageInfo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * s3永久文件存储卷
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StorageInfoRecord extends UpdatableRecordImpl<StorageInfoRecord> implements Record5<Long, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>tmaestro-lite.storage_info.ID</code>.
     */
    public StorageInfoRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.storage_info.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>tmaestro-lite.storage_info.S3_KEY</code>.
     */
    public StorageInfoRecord setS3Key(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.storage_info.S3_KEY</code>.
     */
    public String getS3Key() {
        return (String) get(1);
    }

    /**
     * Setter for <code>tmaestro-lite.storage_info.FILE_NAME</code>.
     */
    public StorageInfoRecord setFileName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.storage_info.FILE_NAME</code>.
     */
    public String getFileName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>tmaestro-lite.storage_info.CREATED_TIME</code>.
     */
    public StorageInfoRecord setCreatedTime(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.storage_info.CREATED_TIME</code>.
     */
    public LocalDateTime getCreatedTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>tmaestro-lite.storage_info.UPDATED_TIME</code>.
     */
    public StorageInfoRecord setUpdatedTime(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.storage_info.UPDATED_TIME</code>.
     */
    public LocalDateTime getUpdatedTime() {
        return (LocalDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return StorageInfo.STORAGE_INFO.ID;
    }

    @Override
    public Field<String> field2() {
        return StorageInfo.STORAGE_INFO.S3_KEY;
    }

    @Override
    public Field<String> field3() {
        return StorageInfo.STORAGE_INFO.FILE_NAME;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return StorageInfo.STORAGE_INFO.CREATED_TIME;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return StorageInfo.STORAGE_INFO.UPDATED_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getS3Key();
    }

    @Override
    public String component3() {
        return getFileName();
    }

    @Override
    public LocalDateTime component4() {
        return getCreatedTime();
    }

    @Override
    public LocalDateTime component5() {
        return getUpdatedTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getS3Key();
    }

    @Override
    public String value3() {
        return getFileName();
    }

    @Override
    public LocalDateTime value4() {
        return getCreatedTime();
    }

    @Override
    public LocalDateTime value5() {
        return getUpdatedTime();
    }

    @Override
    public StorageInfoRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public StorageInfoRecord value2(String value) {
        setS3Key(value);
        return this;
    }

    @Override
    public StorageInfoRecord value3(String value) {
        setFileName(value);
        return this;
    }

    @Override
    public StorageInfoRecord value4(LocalDateTime value) {
        setCreatedTime(value);
        return this;
    }

    @Override
    public StorageInfoRecord value5(LocalDateTime value) {
        setUpdatedTime(value);
        return this;
    }

    @Override
    public StorageInfoRecord values(Long value1, String value2, String value3, LocalDateTime value4, LocalDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StorageInfoRecord
     */
    public StorageInfoRecord() {
        super(StorageInfo.STORAGE_INFO);
    }

    /**
     * Create a detached, initialised StorageInfoRecord
     */
    public StorageInfoRecord(Long id, String s3Key, String fileName, LocalDateTime createdTime, LocalDateTime updatedTime) {
        super(StorageInfo.STORAGE_INFO);

        setId(id);
        setS3Key(s3Key);
        setFileName(fileName);
        setCreatedTime(createdTime);
        setUpdatedTime(updatedTime);
    }
}
