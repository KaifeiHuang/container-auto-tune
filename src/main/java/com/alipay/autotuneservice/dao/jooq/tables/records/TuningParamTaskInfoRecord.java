/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables.records;


import com.alipay.autotuneservice.dao.jooq.tables.TuningParamTaskInfo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TuningParamTaskInfoRecord extends UpdatableRecordImpl<TuningParamTaskInfoRecord> implements Record9<Long, Integer, String, String, String, String, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>tmaestro-lite.tuning_param_task_info.info_id</code>.
     */
    public TuningParamTaskInfoRecord setInfoId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tuning_param_task_info.info_id</code>.
     */
    public Long getInfoId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>tmaestro-lite.tuning_param_task_info.app_id</code>.
     */
    public TuningParamTaskInfoRecord setAppId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tuning_param_task_info.app_id</code>.
     */
    public Integer getAppId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>tmaestro-lite.tuning_param_task_info.app</code>.
     */
    public TuningParamTaskInfoRecord setApp(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tuning_param_task_info.app</code>.
     */
    public String getApp() {
        return (String) get(2);
    }

    /**
     * Setter for <code>tmaestro-lite.tuning_param_task_info.optimization_type</code>.
     */
    public TuningParamTaskInfoRecord setOptimizationType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tuning_param_task_info.optimization_type</code>.
     */
    public String getOptimizationType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>tmaestro-lite.tuning_param_task_info.problem_type</code>.
     */
    public TuningParamTaskInfoRecord setProblemType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tuning_param_task_info.problem_type</code>.
     */
    public String getProblemType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>tmaestro-lite.tuning_param_task_info.param_distribution</code>.
     */
    public TuningParamTaskInfoRecord setParamDistribution(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tuning_param_task_info.param_distribution</code>.
     */
    public String getParamDistribution() {
        return (String) get(5);
    }

    /**
     * Setter for <code>tmaestro-lite.tuning_param_task_info.problem_id</code>.
     */
    public TuningParamTaskInfoRecord setProblemId(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tuning_param_task_info.problem_id</code>.
     */
    public String getProblemId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>tmaestro-lite.tuning_param_task_info.dt</code>.
     */
    public TuningParamTaskInfoRecord setDt(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tuning_param_task_info.dt</code>.
     */
    public String getDt() {
        return (String) get(7);
    }

    /**
     * Setter for <code>tmaestro-lite.tuning_param_task_info.write_time</code>.
     */
    public TuningParamTaskInfoRecord setWriteTime(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tuning_param_task_info.write_time</code>.
     */
    public LocalDateTime getWriteTime() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Integer, String, String, String, String, String, String, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, Integer, String, String, String, String, String, String, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TuningParamTaskInfo.TUNING_PARAM_TASK_INFO.INFO_ID;
    }

    @Override
    public Field<Integer> field2() {
        return TuningParamTaskInfo.TUNING_PARAM_TASK_INFO.APP_ID;
    }

    @Override
    public Field<String> field3() {
        return TuningParamTaskInfo.TUNING_PARAM_TASK_INFO.APP;
    }

    @Override
    public Field<String> field4() {
        return TuningParamTaskInfo.TUNING_PARAM_TASK_INFO.OPTIMIZATION_TYPE;
    }

    @Override
    public Field<String> field5() {
        return TuningParamTaskInfo.TUNING_PARAM_TASK_INFO.PROBLEM_TYPE;
    }

    @Override
    public Field<String> field6() {
        return TuningParamTaskInfo.TUNING_PARAM_TASK_INFO.PARAM_DISTRIBUTION;
    }

    @Override
    public Field<String> field7() {
        return TuningParamTaskInfo.TUNING_PARAM_TASK_INFO.PROBLEM_ID;
    }

    @Override
    public Field<String> field8() {
        return TuningParamTaskInfo.TUNING_PARAM_TASK_INFO.DT;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return TuningParamTaskInfo.TUNING_PARAM_TASK_INFO.WRITE_TIME;
    }

    @Override
    public Long component1() {
        return getInfoId();
    }

    @Override
    public Integer component2() {
        return getAppId();
    }

    @Override
    public String component3() {
        return getApp();
    }

    @Override
    public String component4() {
        return getOptimizationType();
    }

    @Override
    public String component5() {
        return getProblemType();
    }

    @Override
    public String component6() {
        return getParamDistribution();
    }

    @Override
    public String component7() {
        return getProblemId();
    }

    @Override
    public String component8() {
        return getDt();
    }

    @Override
    public LocalDateTime component9() {
        return getWriteTime();
    }

    @Override
    public Long value1() {
        return getInfoId();
    }

    @Override
    public Integer value2() {
        return getAppId();
    }

    @Override
    public String value3() {
        return getApp();
    }

    @Override
    public String value4() {
        return getOptimizationType();
    }

    @Override
    public String value5() {
        return getProblemType();
    }

    @Override
    public String value6() {
        return getParamDistribution();
    }

    @Override
    public String value7() {
        return getProblemId();
    }

    @Override
    public String value8() {
        return getDt();
    }

    @Override
    public LocalDateTime value9() {
        return getWriteTime();
    }

    @Override
    public TuningParamTaskInfoRecord value1(Long value) {
        setInfoId(value);
        return this;
    }

    @Override
    public TuningParamTaskInfoRecord value2(Integer value) {
        setAppId(value);
        return this;
    }

    @Override
    public TuningParamTaskInfoRecord value3(String value) {
        setApp(value);
        return this;
    }

    @Override
    public TuningParamTaskInfoRecord value4(String value) {
        setOptimizationType(value);
        return this;
    }

    @Override
    public TuningParamTaskInfoRecord value5(String value) {
        setProblemType(value);
        return this;
    }

    @Override
    public TuningParamTaskInfoRecord value6(String value) {
        setParamDistribution(value);
        return this;
    }

    @Override
    public TuningParamTaskInfoRecord value7(String value) {
        setProblemId(value);
        return this;
    }

    @Override
    public TuningParamTaskInfoRecord value8(String value) {
        setDt(value);
        return this;
    }

    @Override
    public TuningParamTaskInfoRecord value9(LocalDateTime value) {
        setWriteTime(value);
        return this;
    }

    @Override
    public TuningParamTaskInfoRecord values(Long value1, Integer value2, String value3, String value4, String value5, String value6, String value7, String value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TuningParamTaskInfoRecord
     */
    public TuningParamTaskInfoRecord() {
        super(TuningParamTaskInfo.TUNING_PARAM_TASK_INFO);
    }

    /**
     * Create a detached, initialised TuningParamTaskInfoRecord
     */
    public TuningParamTaskInfoRecord(Long infoId, Integer appId, String app, String optimizationType, String problemType, String paramDistribution, String problemId, String dt, LocalDateTime writeTime) {
        super(TuningParamTaskInfo.TUNING_PARAM_TASK_INFO);

        setInfoId(infoId);
        setAppId(appId);
        setApp(app);
        setOptimizationType(optimizationType);
        setProblemType(problemType);
        setParamDistribution(paramDistribution);
        setProblemId(problemId);
        setDt(dt);
        setWriteTime(writeTime);
    }
}
