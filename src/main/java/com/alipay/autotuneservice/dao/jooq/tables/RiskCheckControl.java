/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables;


import com.alipay.autotuneservice.dao.jooq.Indexes;
import com.alipay.autotuneservice.dao.jooq.Keys;
import com.alipay.autotuneservice.dao.jooq.TmaestroLite;
import com.alipay.autotuneservice.dao.jooq.tables.records.RiskCheckControlRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RiskCheckControl extends TableImpl<RiskCheckControlRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>TMAESTRO-LITE.RISK_CHECK_CONTROL</code>
     */
    public static final RiskCheckControl RISK_CHECK_CONTROL = new RiskCheckControl();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RiskCheckControlRecord> getRecordType() {
        return RiskCheckControlRecord.class;
    }

    /**
     * The column <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.ID</code>. 主键ID
     */
    public final TableField<RiskCheckControlRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "主键ID");

    /**
     * The column <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.APP_ID</code>. 应用id
     */
    public final TableField<RiskCheckControlRecord, Integer> APP_ID = createField(DSL.name("APP_ID"), SQLDataType.INTEGER, this, "应用id");

    /**
     * The column <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.APP_NAME</code>. 应用名称
     */
    public final TableField<RiskCheckControlRecord, String> APP_NAME = createField(DSL.name("APP_NAME"), SQLDataType.VARCHAR(50), this, "应用名称");

    /**
     * The column <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.CHECK_TIME</code>. 风险检查次数
     */
    public final TableField<RiskCheckControlRecord, Integer> CHECK_TIME = createField(DSL.name("CHECK_TIME"), SQLDataType.INTEGER.nullable(false), this, "风险检查次数");

    /**
     * The column <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.TASK_IDS</code>. 任务ID列表
     */
    public final TableField<RiskCheckControlRecord, String> TASK_IDS = createField(DSL.name("TASK_IDS"), SQLDataType.VARCHAR(255), this, "任务ID列表");

    /**
     * The column <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.STATUS</code>. 任务执行状态(EXECETING,END)
     */
    public final TableField<RiskCheckControlRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(10), this, "任务执行状态(EXECETING,END)");

    /**
     * The column <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.CHECK_RESULT</code>. 风险检查结果
     */
    public final TableField<RiskCheckControlRecord, String> CHECK_RESULT = createField(DSL.name("CHECK_RESULT"), SQLDataType.VARCHAR(10).nullable(false), this, "风险检查结果");

    /**
     * The column <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.TRACE_ID</code>. 任务唯一标识
     */
    public final TableField<RiskCheckControlRecord, String> TRACE_ID = createField(DSL.name("TRACE_ID"), SQLDataType.VARCHAR(100), this, "任务唯一标识");

    /**
     * The column <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.RISK_MSG</code>. 风险详情
     */
    public final TableField<RiskCheckControlRecord, String> RISK_MSG = createField(DSL.name("RISK_MSG"), SQLDataType.VARCHAR(1000), this, "风险详情");

    /**
     * The column <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.CREATE_TIME</code>. 创建时间
     */
    public final TableField<RiskCheckControlRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("CREATE_TIME"), SQLDataType.LOCALDATETIME(6), this, "创建时间");

    /**
     * The column <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.RISKBEGINTIME</code>.
     */
    public final TableField<RiskCheckControlRecord, LocalDateTime> RISKBEGINTIME = createField(DSL.name("RISKBEGINTIME"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.RISKENDTIME</code>.
     */
    public final TableField<RiskCheckControlRecord, LocalDateTime> RISKENDTIME = createField(DSL.name("RISKENDTIME"), SQLDataType.LOCALDATETIME(6), this, "");

    private RiskCheckControl(Name alias, Table<RiskCheckControlRecord> aliased) {
        this(alias, aliased, null);
    }

    private RiskCheckControl(Name alias, Table<RiskCheckControlRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>TMAESTRO-LITE.RISK_CHECK_CONTROL</code> table reference
     */
    public RiskCheckControl(String alias) {
        this(DSL.name(alias), RISK_CHECK_CONTROL);
    }

    /**
     * Create an aliased <code>TMAESTRO-LITE.RISK_CHECK_CONTROL</code> table reference
     */
    public RiskCheckControl(Name alias) {
        this(alias, RISK_CHECK_CONTROL);
    }

    /**
     * Create a <code>TMAESTRO-LITE.RISK_CHECK_CONTROL</code> table reference
     */
    public RiskCheckControl() {
        this(DSL.name("RISK_CHECK_CONTROL"), null);
    }

    public <O extends Record> RiskCheckControl(Table<O> child, ForeignKey<O, RiskCheckControlRecord> key) {
        super(child, key, RISK_CHECK_CONTROL);
    }

    @Override
    public Schema getSchema() {
        return TmaestroLite.TMAESTRO_LITE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.RISK_CHECK_CONTROLLER_TRACE_ID_IDX);
    }

    @Override
    public Identity<RiskCheckControlRecord, Integer> getIdentity() {
        return (Identity<RiskCheckControlRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<RiskCheckControlRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_45;
    }

    @Override
    public List<UniqueKey<RiskCheckControlRecord>> getKeys() {
        return Arrays.<UniqueKey<RiskCheckControlRecord>>asList(Keys.CONSTRAINT_45);
    }

    @Override
    public RiskCheckControl as(String alias) {
        return new RiskCheckControl(DSL.name(alias), this);
    }

    @Override
    public RiskCheckControl as(Name alias) {
        return new RiskCheckControl(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RiskCheckControl rename(String name) {
        return new RiskCheckControl(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RiskCheckControl rename(Name name) {
        return new RiskCheckControl(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, Integer, String, Integer, String, String, String, String, String, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
