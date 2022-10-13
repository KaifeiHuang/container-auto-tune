/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables;


import com.alipay.autotuneservice.dao.jooq.Keys;
import com.alipay.autotuneservice.dao.jooq.TmaestroLite;
import com.alipay.autotuneservice.dao.jooq.tables.records.TunePoolInfoRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
 * 调参池管理表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TunePoolInfo extends TableImpl<TunePoolInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>tmaestro-lite.tune_pool_info</code>
     */
    public static final TunePoolInfo TUNE_POOL_INFO = new TunePoolInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TunePoolInfoRecord> getRecordType() {
        return TunePoolInfoRecord.class;
    }

    /**
     * The column <code>tmaestro-lite.tune_pool_info.ID</code>. 主键ID
     */
    public final TableField<TunePoolInfoRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "主键ID");

    /**
     * The column <code>tmaestro-lite.tune_pool_info.ACCESS_TOKEN</code>. 关联的token
     */
    public final TableField<TunePoolInfoRecord, String> ACCESS_TOKEN = createField(DSL.name("ACCESS_TOKEN"), SQLDataType.VARCHAR(255).nullable(false), this, "关联的token");

    /**
     * The column <code>tmaestro-lite.tune_pool_info.APP_ID</code>. 应用ID
     */
    public final TableField<TunePoolInfoRecord, Integer> APP_ID = createField(DSL.name("APP_ID"), SQLDataType.INTEGER.nullable(false), this, "应用ID");

    /**
     * The column <code>tmaestro-lite.tune_pool_info.PIPELINE_ID</code>. 关联的流程ID
     */
    public final TableField<TunePoolInfoRecord, Integer> PIPELINE_ID = createField(DSL.name("PIPELINE_ID"), SQLDataType.INTEGER.nullable(false), this, "关联的流程ID");

    /**
     * The column <code>tmaestro-lite.tune_pool_info.APP_NAME</code>. 应用名
     */
    public final TableField<TunePoolInfoRecord, String> APP_NAME = createField(DSL.name("APP_NAME"), SQLDataType.VARCHAR(32).nullable(false), this, "应用名");

    /**
     * The column <code>tmaestro-lite.tune_pool_info.CREATED_TIME</code>. 创建时间
     */
    public final TableField<TunePoolInfoRecord, LocalDateTime> CREATED_TIME = createField(DSL.name("CREATED_TIME"), SQLDataType.LOCALDATETIME(0), this, "创建时间");

    /**
     * The column <code>tmaestro-lite.tune_pool_info.UPDATED_TIME</code>. 更新时间
     */
    public final TableField<TunePoolInfoRecord, LocalDateTime> UPDATED_TIME = createField(DSL.name("UPDATED_TIME"), SQLDataType.LOCALDATETIME(0), this, "更新时间");

    /**
     * The column <code>tmaestro-lite.tune_pool_info.UPDATED_BY</code>. 更新人
     */
    public final TableField<TunePoolInfoRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(255), this, "更新人");

    /**
     * The column <code>tmaestro-lite.tune_pool_info.EXPERIMENT_POOL_STATUS</code>. 实验池状态
     */
    public final TableField<TunePoolInfoRecord, String> EXPERIMENT_POOL_STATUS = createField(DSL.name("EXPERIMENT_POOL_STATUS"), SQLDataType.VARCHAR(255).nullable(false), this, "实验池状态");

    /**
     * The column <code>tmaestro-lite.tune_pool_info.BATCH_POOL_STATUS</code>. 调参池状态
     */
    public final TableField<TunePoolInfoRecord, String> BATCH_POOL_STATUS = createField(DSL.name("BATCH_POOL_STATUS"), SQLDataType.VARCHAR(255).nullable(false), this, "调参池状态");

    /**
     * The column <code>tmaestro-lite.tune_pool_info.EXPERIMENT_POOL_CONFIG</code>. 实验池配置
     */
    public final TableField<TunePoolInfoRecord, String> EXPERIMENT_POOL_CONFIG = createField(DSL.name("EXPERIMENT_POOL_CONFIG"), SQLDataType.VARCHAR(2000).nullable(false), this, "实验池配置");

    /**
     * The column <code>tmaestro-lite.tune_pool_info.BATCH_POOL_CONFIG</code>. 调参池配置
     */
    public final TableField<TunePoolInfoRecord, String> BATCH_POOL_CONFIG = createField(DSL.name("BATCH_POOL_CONFIG"), SQLDataType.VARCHAR(2000).nullable(false), this, "调参池配置");

    private TunePoolInfo(Name alias, Table<TunePoolInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private TunePoolInfo(Name alias, Table<TunePoolInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("调参池管理表"), TableOptions.table());
    }

    /**
     * Create an aliased <code>tmaestro-lite.tune_pool_info</code> table reference
     */
    public TunePoolInfo(String alias) {
        this(DSL.name(alias), TUNE_POOL_INFO);
    }

    /**
     * Create an aliased <code>tmaestro-lite.tune_pool_info</code> table reference
     */
    public TunePoolInfo(Name alias) {
        this(alias, TUNE_POOL_INFO);
    }

    /**
     * Create a <code>tmaestro-lite.tune_pool_info</code> table reference
     */
    public TunePoolInfo() {
        this(DSL.name("tune_pool_info"), null);
    }

    public <O extends Record> TunePoolInfo(Table<O> child, ForeignKey<O, TunePoolInfoRecord> key) {
        super(child, key, TUNE_POOL_INFO);
    }

    @Override
    public Schema getSchema() {
        return TmaestroLite.TMAESTRO_LITE;
    }

    @Override
    public Identity<TunePoolInfoRecord, Integer> getIdentity() {
        return (Identity<TunePoolInfoRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<TunePoolInfoRecord> getPrimaryKey() {
        return Keys.KEY_TUNE_POOL_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<TunePoolInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<TunePoolInfoRecord>>asList(Keys.KEY_TUNE_POOL_INFO_PRIMARY);
    }

    @Override
    public TunePoolInfo as(String alias) {
        return new TunePoolInfo(DSL.name(alias), this);
    }

    @Override
    public TunePoolInfo as(Name alias) {
        return new TunePoolInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TunePoolInfo rename(String name) {
        return new TunePoolInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TunePoolInfo rename(Name name) {
        return new TunePoolInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, Integer, Integer, String, LocalDateTime, LocalDateTime, String, String, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}