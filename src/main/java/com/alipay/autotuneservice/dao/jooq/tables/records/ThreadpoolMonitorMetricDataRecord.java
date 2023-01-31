/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables.records;


import com.alipay.autotuneservice.dao.jooq.tables.ThreadpoolMonitorMetricData;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ThreadpoolMonitorMetricDataRecord extends UpdatableRecordImpl<ThreadpoolMonitorMetricDataRecord> implements Record17<Integer, String, Integer, Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.ID</code>. 唯一ID;唯一ID
     */
    public ThreadpoolMonitorMetricDataRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.ID</code>. 唯一ID;唯一ID
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.HOST_NAME</code>. host name
     */
    public ThreadpoolMonitorMetricDataRecord setHostName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.HOST_NAME</code>. host name
     */
    public String getHostName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.PERIOD</code>. 日期
     */
    public ThreadpoolMonitorMetricDataRecord setPeriod(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.PERIOD</code>. 日期
     */
    public Integer getPeriod() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.ACTIVE_COUNT</code>. activeCount
     */
    public ThreadpoolMonitorMetricDataRecord setActiveCount(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.ACTIVE_COUNT</code>. activeCount
     */
    public Integer getActiveCount() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.APP_NAME</code>. appName
     */
    public ThreadpoolMonitorMetricDataRecord setAppName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.APP_NAME</code>. appName
     */
    public String getAppName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.BLOCK_QUEUE</code>. blockQueue
     */
    public ThreadpoolMonitorMetricDataRecord setBlockQueue(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.BLOCK_QUEUE</code>. blockQueue
     */
    public Integer getBlockQueue() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.COMPLETED_TASK_COUNT</code>. completedTaskCount
     */
    public ThreadpoolMonitorMetricDataRecord setCompletedTaskCount(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.COMPLETED_TASK_COUNT</code>. completedTaskCount
     */
    public Integer getCompletedTaskCount() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.CORE_POOL_SIZE</code>. corePoolSize
     */
    public ThreadpoolMonitorMetricDataRecord setCorePoolSize(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.CORE_POOL_SIZE</code>. corePoolSize
     */
    public Integer getCorePoolSize() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.DT</code>. dt
     */
    public ThreadpoolMonitorMetricDataRecord setDt(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.DT</code>. dt
     */
    public Integer getDt() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.IDLE_POOL_SIZE</code>. idlePoolSize
     */
    public ThreadpoolMonitorMetricDataRecord setIdlePoolSize(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.IDLE_POOL_SIZE</code>. idlePoolSize
     */
    public Integer getIdlePoolSize() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.KEEP_ALIVE_TIME</code>. keepAliveTime
     */
    public ThreadpoolMonitorMetricDataRecord setKeepAliveTime(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.KEEP_ALIVE_TIME</code>. keepAliveTime
     */
    public Integer getKeepAliveTime() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.LARGEST_POOL_SIZE</code>. largestPoolSize
     */
    public ThreadpoolMonitorMetricDataRecord setLargestPoolSize(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.LARGEST_POOL_SIZE</code>. largestPoolSize
     */
    public Integer getLargestPoolSize() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.MAXI_MUM_POOL_SIZE</code>. maximumPoolSize
     */
    public ThreadpoolMonitorMetricDataRecord setMaxiMumPoolSize(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.MAXI_MUM_POOL_SIZE</code>. maximumPoolSize
     */
    public Integer getMaxiMumPoolSize() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.POOL_SIZE</code>. poolSize
     */
    public ThreadpoolMonitorMetricDataRecord setPoolSize(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.POOL_SIZE</code>. poolSize
     */
    public Integer getPoolSize() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.REJECT_COUNT</code>. rejectCount
     */
    public ThreadpoolMonitorMetricDataRecord setRejectCount(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.REJECT_COUNT</code>. rejectCount
     */
    public Integer getRejectCount() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.TASK_COUNT</code>. taskCount
     */
    public ThreadpoolMonitorMetricDataRecord setTaskCount(Integer value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.TASK_COUNT</code>. taskCount
     */
    public Integer getTaskCount() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.THREAD_POOL_NAME</code>.
     */
    public ThreadpoolMonitorMetricDataRecord setThreadPoolName(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.THREADPOOL_MONITOR_METRIC_DATA.THREAD_POOL_NAME</code>.
     */
    public String getThreadPoolName() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<Integer, String, Integer, Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<Integer, String, Integer, Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA.ID;
    }

    @Override
    public Field<String> field2() {
        return ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA.HOST_NAME;
    }

    @Override
    public Field<Integer> field3() {
        return ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA.PERIOD;
    }

    @Override
    public Field<Integer> field4() {
        return ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA.ACTIVE_COUNT;
    }

    @Override
    public Field<String> field5() {
        return ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA.APP_NAME;
    }

    @Override
    public Field<Integer> field6() {
        return ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA.BLOCK_QUEUE;
    }

    @Override
    public Field<Integer> field7() {
        return ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA.COMPLETED_TASK_COUNT;
    }

    @Override
    public Field<Integer> field8() {
        return ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA.CORE_POOL_SIZE;
    }

    @Override
    public Field<Integer> field9() {
        return ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA.DT;
    }

    @Override
    public Field<Integer> field10() {
        return ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA.IDLE_POOL_SIZE;
    }

    @Override
    public Field<Integer> field11() {
        return ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA.KEEP_ALIVE_TIME;
    }

    @Override
    public Field<Integer> field12() {
        return ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA.LARGEST_POOL_SIZE;
    }

    @Override
    public Field<Integer> field13() {
        return ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA.MAXI_MUM_POOL_SIZE;
    }

    @Override
    public Field<Integer> field14() {
        return ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA.POOL_SIZE;
    }

    @Override
    public Field<Integer> field15() {
        return ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA.REJECT_COUNT;
    }

    @Override
    public Field<Integer> field16() {
        return ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA.TASK_COUNT;
    }

    @Override
    public Field<String> field17() {
        return ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA.THREAD_POOL_NAME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getHostName();
    }

    @Override
    public Integer component3() {
        return getPeriod();
    }

    @Override
    public Integer component4() {
        return getActiveCount();
    }

    @Override
    public String component5() {
        return getAppName();
    }

    @Override
    public Integer component6() {
        return getBlockQueue();
    }

    @Override
    public Integer component7() {
        return getCompletedTaskCount();
    }

    @Override
    public Integer component8() {
        return getCorePoolSize();
    }

    @Override
    public Integer component9() {
        return getDt();
    }

    @Override
    public Integer component10() {
        return getIdlePoolSize();
    }

    @Override
    public Integer component11() {
        return getKeepAliveTime();
    }

    @Override
    public Integer component12() {
        return getLargestPoolSize();
    }

    @Override
    public Integer component13() {
        return getMaxiMumPoolSize();
    }

    @Override
    public Integer component14() {
        return getPoolSize();
    }

    @Override
    public Integer component15() {
        return getRejectCount();
    }

    @Override
    public Integer component16() {
        return getTaskCount();
    }

    @Override
    public String component17() {
        return getThreadPoolName();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getHostName();
    }

    @Override
    public Integer value3() {
        return getPeriod();
    }

    @Override
    public Integer value4() {
        return getActiveCount();
    }

    @Override
    public String value5() {
        return getAppName();
    }

    @Override
    public Integer value6() {
        return getBlockQueue();
    }

    @Override
    public Integer value7() {
        return getCompletedTaskCount();
    }

    @Override
    public Integer value8() {
        return getCorePoolSize();
    }

    @Override
    public Integer value9() {
        return getDt();
    }

    @Override
    public Integer value10() {
        return getIdlePoolSize();
    }

    @Override
    public Integer value11() {
        return getKeepAliveTime();
    }

    @Override
    public Integer value12() {
        return getLargestPoolSize();
    }

    @Override
    public Integer value13() {
        return getMaxiMumPoolSize();
    }

    @Override
    public Integer value14() {
        return getPoolSize();
    }

    @Override
    public Integer value15() {
        return getRejectCount();
    }

    @Override
    public Integer value16() {
        return getTaskCount();
    }

    @Override
    public String value17() {
        return getThreadPoolName();
    }

    @Override
    public ThreadpoolMonitorMetricDataRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ThreadpoolMonitorMetricDataRecord value2(String value) {
        setHostName(value);
        return this;
    }

    @Override
    public ThreadpoolMonitorMetricDataRecord value3(Integer value) {
        setPeriod(value);
        return this;
    }

    @Override
    public ThreadpoolMonitorMetricDataRecord value4(Integer value) {
        setActiveCount(value);
        return this;
    }

    @Override
    public ThreadpoolMonitorMetricDataRecord value5(String value) {
        setAppName(value);
        return this;
    }

    @Override
    public ThreadpoolMonitorMetricDataRecord value6(Integer value) {
        setBlockQueue(value);
        return this;
    }

    @Override
    public ThreadpoolMonitorMetricDataRecord value7(Integer value) {
        setCompletedTaskCount(value);
        return this;
    }

    @Override
    public ThreadpoolMonitorMetricDataRecord value8(Integer value) {
        setCorePoolSize(value);
        return this;
    }

    @Override
    public ThreadpoolMonitorMetricDataRecord value9(Integer value) {
        setDt(value);
        return this;
    }

    @Override
    public ThreadpoolMonitorMetricDataRecord value10(Integer value) {
        setIdlePoolSize(value);
        return this;
    }

    @Override
    public ThreadpoolMonitorMetricDataRecord value11(Integer value) {
        setKeepAliveTime(value);
        return this;
    }

    @Override
    public ThreadpoolMonitorMetricDataRecord value12(Integer value) {
        setLargestPoolSize(value);
        return this;
    }

    @Override
    public ThreadpoolMonitorMetricDataRecord value13(Integer value) {
        setMaxiMumPoolSize(value);
        return this;
    }

    @Override
    public ThreadpoolMonitorMetricDataRecord value14(Integer value) {
        setPoolSize(value);
        return this;
    }

    @Override
    public ThreadpoolMonitorMetricDataRecord value15(Integer value) {
        setRejectCount(value);
        return this;
    }

    @Override
    public ThreadpoolMonitorMetricDataRecord value16(Integer value) {
        setTaskCount(value);
        return this;
    }

    @Override
    public ThreadpoolMonitorMetricDataRecord value17(String value) {
        setThreadPoolName(value);
        return this;
    }

    @Override
    public ThreadpoolMonitorMetricDataRecord values(Integer value1, String value2, Integer value3, Integer value4, String value5, Integer value6, Integer value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, Integer value13, Integer value14, Integer value15, Integer value16, String value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ThreadpoolMonitorMetricDataRecord
     */
    public ThreadpoolMonitorMetricDataRecord() {
        super(ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA);
    }

    /**
     * Create a detached, initialised ThreadpoolMonitorMetricDataRecord
     */
    public ThreadpoolMonitorMetricDataRecord(Integer id, String hostName, Integer period, Integer activeCount, String appName, Integer blockQueue, Integer completedTaskCount, Integer corePoolSize, Integer dt, Integer idlePoolSize, Integer keepAliveTime, Integer largestPoolSize, Integer maxiMumPoolSize, Integer poolSize, Integer rejectCount, Integer taskCount, String threadPoolName) {
        super(ThreadpoolMonitorMetricData.THREADPOOL_MONITOR_METRIC_DATA);

        setId(id);
        setHostName(hostName);
        setPeriod(period);
        setActiveCount(activeCount);
        setAppName(appName);
        setBlockQueue(blockQueue);
        setCompletedTaskCount(completedTaskCount);
        setCorePoolSize(corePoolSize);
        setDt(dt);
        setIdlePoolSize(idlePoolSize);
        setKeepAliveTime(keepAliveTime);
        setLargestPoolSize(largestPoolSize);
        setMaxiMumPoolSize(maxiMumPoolSize);
        setPoolSize(poolSize);
        setRejectCount(rejectCount);
        setTaskCount(taskCount);
        setThreadPoolName(threadPoolName);
    }
}
