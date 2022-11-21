/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables;


import com.alipay.autotuneservice.dao.jooq.Keys;
import com.alipay.autotuneservice.dao.jooq.TmaestroLite;
import com.alipay.autotuneservice.dao.jooq.tables.records.CommandInfoRecord;

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
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CommandInfo extends TableImpl<CommandInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>TMAESTRO-LITE.COMMAND_INFO</code>
     */
    public static final CommandInfo COMMAND_INFO = new CommandInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CommandInfoRecord> getRecordType() {
        return CommandInfoRecord.class;
    }

    /**
     * The column <code>TMAESTRO-LITE.COMMAND_INFO.ID</code>. 主键ID
     */
    public final TableField<CommandInfoRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "主键ID");

    /**
     * The column <code>TMAESTRO-LITE.COMMAND_INFO.SESSIONID</code>. 会话ID
     */
    public final TableField<CommandInfoRecord, String> SESSIONID = createField(DSL.name("SESSIONID"), SQLDataType.VARCHAR(128).nullable(false), this, "会话ID");

    /**
     * The column <code>TMAESTRO-LITE.COMMAND_INFO.RUNLE_ACTION</code>. 执行类型
     */
    public final TableField<CommandInfoRecord, String> RUNLE_ACTION = createField(DSL.name("RUNLE_ACTION"), SQLDataType.VARCHAR(256).nullable(false), this, "执行类型");

    /**
     * The column <code>TMAESTRO-LITE.COMMAND_INFO.RESULT_TYPE</code>. 结果类型
     */
    public final TableField<CommandInfoRecord, String> RESULT_TYPE = createField(DSL.name("RESULT_TYPE"), SQLDataType.VARCHAR(128).nullable(false), this, "结果类型");

    /**
     * The column <code>TMAESTRO-LITE.COMMAND_INFO.RESULT</code>. 结果
     */
    public final TableField<CommandInfoRecord, String> RESULT = createField(DSL.name("RESULT"), SQLDataType.VARCHAR(1000), this, "结果");

    /**
     * The column <code>TMAESTRO-LITE.COMMAND_INFO.ACCESS_TOKEN</code>. 关联的token
     */
    public final TableField<CommandInfoRecord, String> ACCESS_TOKEN = createField(DSL.name("ACCESS_TOKEN"), SQLDataType.VARCHAR(255), this, "关联的token");

    /**
     * The column <code>TMAESTRO-LITE.COMMAND_INFO.APP_NAME</code>. 应用名
     */
    public final TableField<CommandInfoRecord, String> APP_NAME = createField(DSL.name("APP_NAME"), SQLDataType.VARCHAR(32), this, "应用名");

    /**
     * The column <code>TMAESTRO-LITE.COMMAND_INFO.UNION_CODE</code>. 每个VM启动后,自动生成唯一标识,用来进行唯一关联
     */
    public final TableField<CommandInfoRecord, String> UNION_CODE = createField(DSL.name("UNION_CODE"), SQLDataType.VARCHAR(32).nullable(false), this, "每个VM启动后,自动生成唯一标识,用来进行唯一关联");

    /**
     * The column <code>TMAESTRO-LITE.COMMAND_INFO.CONTEXT</code>. 执行上下文
     */
    public final TableField<CommandInfoRecord, String> CONTEXT = createField(DSL.name("CONTEXT"), SQLDataType.VARCHAR(1000), this, "执行上下文");

    /**
     * The column <code>TMAESTRO-LITE.COMMAND_INFO.STATUS</code>. 执行状态
     */
    public final TableField<CommandInfoRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(128).nullable(false), this, "执行状态");

    /**
     * The column <code>TMAESTRO-LITE.COMMAND_INFO.CREATED_TIME</code>. 创建时间
     */
    public final TableField<CommandInfoRecord, LocalDateTime> CREATED_TIME = createField(DSL.name("CREATED_TIME"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "创建时间");

    /**
     * The column <code>TMAESTRO-LITE.COMMAND_INFO.UPDATED_TIME</code>. 更新时间
     */
    public final TableField<CommandInfoRecord, LocalDateTime> UPDATED_TIME = createField(DSL.name("UPDATED_TIME"), SQLDataType.LOCALDATETIME(6), this, "更新时间");

    private CommandInfo(Name alias, Table<CommandInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private CommandInfo(Name alias, Table<CommandInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>TMAESTRO-LITE.COMMAND_INFO</code> table reference
     */
    public CommandInfo(String alias) {
        this(DSL.name(alias), COMMAND_INFO);
    }

    /**
     * Create an aliased <code>TMAESTRO-LITE.COMMAND_INFO</code> table reference
     */
    public CommandInfo(Name alias) {
        this(alias, COMMAND_INFO);
    }

    /**
     * Create a <code>TMAESTRO-LITE.COMMAND_INFO</code> table reference
     */
    public CommandInfo() {
        this(DSL.name("COMMAND_INFO"), null);
    }

    public <O extends Record> CommandInfo(Table<O> child, ForeignKey<O, CommandInfoRecord> key) {
        super(child, key, COMMAND_INFO);
    }

    @Override
    public Schema getSchema() {
        return TmaestroLite.TMAESTRO_LITE;
    }

    @Override
    public Identity<CommandInfoRecord, Integer> getIdentity() {
        return (Identity<CommandInfoRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<CommandInfoRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_76;
    }

    @Override
    public List<UniqueKey<CommandInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<CommandInfoRecord>>asList(Keys.CONSTRAINT_76);
    }

    @Override
    public CommandInfo as(String alias) {
        return new CommandInfo(DSL.name(alias), this);
    }

    @Override
    public CommandInfo as(Name alias) {
        return new CommandInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CommandInfo rename(String name) {
        return new CommandInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CommandInfo rename(Name name) {
        return new CommandInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}