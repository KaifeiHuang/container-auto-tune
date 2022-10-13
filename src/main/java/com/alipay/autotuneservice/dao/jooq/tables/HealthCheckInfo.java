/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables;


import com.alipay.autotuneservice.dao.jooq.Keys;
import com.alipay.autotuneservice.dao.jooq.TmaestroLite;
import com.alipay.autotuneservice.dao.jooq.tables.records.HealthCheckInfoRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 健康检查
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HealthCheckInfo extends TableImpl<HealthCheckInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>tmaestro-lite.health_check_info</code>
     */
    public static final HealthCheckInfo HEALTH_CHECK_INFO = new HealthCheckInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HealthCheckInfoRecord> getRecordType() {
        return HealthCheckInfoRecord.class;
    }

    /**
     * The column <code>tmaestro-lite.health_check_info.ID</code>. 主键ID
     */
    public final TableField<HealthCheckInfoRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "主键ID");

    /**
     * The column <code>tmaestro-lite.health_check_info.ACCESS_TOKEN</code>. 关联的token
     */
    public final TableField<HealthCheckInfoRecord, String> ACCESS_TOKEN = createField(DSL.name("ACCESS_TOKEN"), SQLDataType.VARCHAR(255).nullable(false), this, "关联的token");

    /**
     * The column <code>tmaestro-lite.health_check_info.APP_ID</code>. 关联的集群id
     */
    public final TableField<HealthCheckInfoRecord, Integer> APP_ID = createField(DSL.name("APP_ID"), SQLDataType.INTEGER, this, "关联的集群id");

    /**
     * The column <code>tmaestro-lite.health_check_info.CREATED_BY</code>. 创建人
     */
    public final TableField<HealthCheckInfoRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(255), this, "创建人");

    /**
     * The column <code>tmaestro-lite.health_check_info.CREATED_TIME</code>. 创建时间
     */
    public final TableField<HealthCheckInfoRecord, LocalDateTime> CREATED_TIME = createField(DSL.name("CREATED_TIME"), SQLDataType.LOCALDATETIME(0), this, "创建时间");

    /**
     * The column <code>tmaestro-lite.health_check_info.STATUS</code>. 状态:检查成功、检查失败
     */
    public final TableField<HealthCheckInfoRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(255).nullable(false), this, "状态:检查成功、检查失败");

    /**
     * The column <code>tmaestro-lite.health_check_info.PROBLEAM_POINT</code>. 检查问题点
     */
    public final TableField<HealthCheckInfoRecord, String> PROBLEAM_POINT = createField(DSL.name("PROBLEAM_POINT"), SQLDataType.VARCHAR(4000).nullable(false), this, "检查问题点");

    /**
     * The column <code>tmaestro-lite.health_check_info.GRADE</code>. 分数
     */
    public final TableField<HealthCheckInfoRecord, String> GRADE = createField(DSL.name("GRADE"), SQLDataType.VARCHAR(255).nullable(false), this, "分数");

    /**
     * The column <code>tmaestro-lite.health_check_info.ENCHANGE_POINT</code>. 改变的点
     */
    public final TableField<HealthCheckInfoRecord, String> ENCHANGE_POINT = createField(DSL.name("ENCHANGE_POINT"), SQLDataType.VARCHAR(255), this, "改变的点");

    /**
     * The column <code>tmaestro-lite.health_check_info.ALGO_PROBLEAM</code>.
     */
    public final TableField<HealthCheckInfoRecord, String> ALGO_PROBLEAM = createField(DSL.name("ALGO_PROBLEAM"), SQLDataType.VARCHAR(4000), this, "");

    private HealthCheckInfo(Name alias, Table<HealthCheckInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private HealthCheckInfo(Name alias, Table<HealthCheckInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("健康检查"), TableOptions.table());
    }

    /**
     * Create an aliased <code>tmaestro-lite.health_check_info</code> table reference
     */
    public HealthCheckInfo(String alias) {
        this(DSL.name(alias), HEALTH_CHECK_INFO);
    }

    /**
     * Create an aliased <code>tmaestro-lite.health_check_info</code> table reference
     */
    public HealthCheckInfo(Name alias) {
        this(alias, HEALTH_CHECK_INFO);
    }

    /**
     * Create a <code>tmaestro-lite.health_check_info</code> table reference
     */
    public HealthCheckInfo() {
        this(DSL.name("health_check_info"), null);
    }

    public <O extends Record> HealthCheckInfo(Table<O> child, ForeignKey<O, HealthCheckInfoRecord> key) {
        super(child, key, HEALTH_CHECK_INFO);
    }

    @Override
    public Schema getSchema() {
        return TmaestroLite.TMAESTRO_LITE;
    }

    @Override
    public Identity<HealthCheckInfoRecord, Integer> getIdentity() {
        return (Identity<HealthCheckInfoRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<HealthCheckInfoRecord> getPrimaryKey() {
        return Keys.KEY_HEALTH_CHECK_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<HealthCheckInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<HealthCheckInfoRecord>>asList(Keys.KEY_HEALTH_CHECK_INFO_PRIMARY);
    }

    @Override
    public HealthCheckInfo as(String alias) {
        return new HealthCheckInfo(DSL.name(alias), this);
    }

    @Override
    public HealthCheckInfo as(Name alias) {
        return new HealthCheckInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HealthCheckInfo rename(String name) {
        return new HealthCheckInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HealthCheckInfo rename(Name name) {
        return new HealthCheckInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, Integer, String, LocalDateTime, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
