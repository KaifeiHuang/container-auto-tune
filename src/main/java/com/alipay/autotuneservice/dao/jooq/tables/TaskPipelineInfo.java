/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables;


import com.alipay.autotuneservice.dao.jooq.Keys;
import com.alipay.autotuneservice.dao.jooq.TmaestroLite;
import com.alipay.autotuneservice.dao.jooq.tables.records.TaskPipelineInfoRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 任务管理表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskPipelineInfo extends TableImpl<TaskPipelineInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>tmaestro-lite.task_pipeline_info</code>
     */
    public static final TaskPipelineInfo TASK_PIPELINE_INFO = new TaskPipelineInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TaskPipelineInfoRecord> getRecordType() {
        return TaskPipelineInfoRecord.class;
    }

    /**
     * The column <code>tmaestro-lite.task_pipeline_info.ID</code>. 主键ID
     */
    public final TableField<TaskPipelineInfoRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "主键ID");

    /**
     * The column <code>tmaestro-lite.task_pipeline_info.ACCESS_TOKEN</code>. 关联的token
     */
    public final TableField<TaskPipelineInfoRecord, String> ACCESS_TOKEN = createField(DSL.name("ACCESS_TOKEN"), SQLDataType.VARCHAR(255).nullable(false), this, "关联的token");

    /**
     * The column <code>tmaestro-lite.task_pipeline_info.EXECUTE_CLUSTER_ID</code>. 执行集群ID
     */
    public final TableField<TaskPipelineInfoRecord, String> EXECUTE_CLUSTER_ID = createField(DSL.name("EXECUTE_CLUSTER_ID"), SQLDataType.VARCHAR(255), this, "执行集群ID");

    /**
     * The column <code>tmaestro-lite.task_pipeline_info.EXECUTE_NODE_ID</code>. 执行单机ID
     */
    public final TableField<TaskPipelineInfoRecord, String> EXECUTE_NODE_ID = createField(DSL.name("EXECUTE_NODE_ID"), SQLDataType.VARCHAR(255), this, "执行单机ID");

    /**
     * The column <code>tmaestro-lite.task_pipeline_info.REPORT_TYPE</code>. 报告类型;报告类型：线程、内存、GC、ALL、TUNE
     */
    public final TableField<TaskPipelineInfoRecord, String> REPORT_TYPE = createField(DSL.name("REPORT_TYPE"), SQLDataType.VARCHAR(255), this, "报告类型;报告类型：线程、内存、GC、ALL、TUNE");

    /**
     * The column <code>tmaestro-lite.task_pipeline_info.EXECUTE_TYPE</code>. 执行类型;执行类型：人工、定时、阈值、upload
     */
    public final TableField<TaskPipelineInfoRecord, String> EXECUTE_TYPE = createField(DSL.name("EXECUTE_TYPE"), SQLDataType.VARCHAR(255), this, "执行类型;执行类型：人工、定时、阈值、upload");

    /**
     * The column <code>tmaestro-lite.task_pipeline_info.EXECUTE_PARAM</code>. 执行参数
     */
    public final TableField<TaskPipelineInfoRecord, String> EXECUTE_PARAM = createField(DSL.name("EXECUTE_PARAM"), SQLDataType.VARCHAR(255), this, "执行参数");

    /**
     * The column <code>tmaestro-lite.task_pipeline_info.EXECUTE_FUTURE_TIME</code>. 期望执行时间
     */
    public final TableField<TaskPipelineInfoRecord, LocalDateTime> EXECUTE_FUTURE_TIME = createField(DSL.name("EXECUTE_FUTURE_TIME"), SQLDataType.LOCALDATETIME(0), this, "期望执行时间");

    /**
     * The column <code>tmaestro-lite.task_pipeline_info.EXECUTE_TIME</code>. 实际执行时间
     */
    public final TableField<TaskPipelineInfoRecord, LocalDateTime> EXECUTE_TIME = createField(DSL.name("EXECUTE_TIME"), SQLDataType.LOCALDATETIME(0), this, "实际执行时间");

    /**
     * The column <code>tmaestro-lite.task_pipeline_info.RULE_IDS</code>. 关联的规则id;[]
     */
    public final TableField<TaskPipelineInfoRecord, Integer> RULE_IDS = createField(DSL.name("RULE_IDS"), SQLDataType.INTEGER, this, "关联的规则id;[]");

    /**
     * The column <code>tmaestro-lite.task_pipeline_info.REPORT_ID</code>. 关联的报告id
     */
    public final TableField<TaskPipelineInfoRecord, Integer> REPORT_ID = createField(DSL.name("REPORT_ID"), SQLDataType.INTEGER, this, "关联的报告id");

    /**
     * The column <code>tmaestro-lite.task_pipeline_info.CREATED_BY</code>. 创建人
     */
    public final TableField<TaskPipelineInfoRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(255), this, "创建人");

    /**
     * The column <code>tmaestro-lite.task_pipeline_info.CREATED_TIME</code>. 创建时间
     */
    public final TableField<TaskPipelineInfoRecord, LocalDateTime> CREATED_TIME = createField(DSL.name("CREATED_TIME"), SQLDataType.LOCALDATETIME(0), this, "创建时间");

    /**
     * The column <code>tmaestro-lite.task_pipeline_info.STATUS</code>. 状态;准备--&gt;运行(采集日志、分析日志)---&gt;结束
     */
    public final TableField<TaskPipelineInfoRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(255), this, "状态;准备-->运行(采集日志、分析日志)--->结束");

    private TaskPipelineInfo(Name alias, Table<TaskPipelineInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private TaskPipelineInfo(Name alias, Table<TaskPipelineInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("任务管理表"), TableOptions.table());
    }

    /**
     * Create an aliased <code>tmaestro-lite.task_pipeline_info</code> table reference
     */
    public TaskPipelineInfo(String alias) {
        this(DSL.name(alias), TASK_PIPELINE_INFO);
    }

    /**
     * Create an aliased <code>tmaestro-lite.task_pipeline_info</code> table reference
     */
    public TaskPipelineInfo(Name alias) {
        this(alias, TASK_PIPELINE_INFO);
    }

    /**
     * Create a <code>tmaestro-lite.task_pipeline_info</code> table reference
     */
    public TaskPipelineInfo() {
        this(DSL.name("task_pipeline_info"), null);
    }

    public <O extends Record> TaskPipelineInfo(Table<O> child, ForeignKey<O, TaskPipelineInfoRecord> key) {
        super(child, key, TASK_PIPELINE_INFO);
    }

    @Override
    public Schema getSchema() {
        return TmaestroLite.TMAESTRO_LITE;
    }

    @Override
    public Identity<TaskPipelineInfoRecord, Integer> getIdentity() {
        return (Identity<TaskPipelineInfoRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<TaskPipelineInfoRecord> getPrimaryKey() {
        return Keys.KEY_TASK_PIPELINE_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<TaskPipelineInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<TaskPipelineInfoRecord>>asList(Keys.KEY_TASK_PIPELINE_INFO_PRIMARY);
    }

    @Override
    public TaskPipelineInfo as(String alias) {
        return new TaskPipelineInfo(DSL.name(alias), this);
    }

    @Override
    public TaskPipelineInfo as(Name alias) {
        return new TaskPipelineInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TaskPipelineInfo rename(String name) {
        return new TaskPipelineInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TaskPipelineInfo rename(Name name) {
        return new TaskPipelineInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, String, String, String, String, String, String, LocalDateTime, LocalDateTime, Integer, Integer, String, LocalDateTime, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}