/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables;


import com.alipay.autotuneservice.dao.jooq.Keys;
import com.alipay.autotuneservice.dao.jooq.TmaestroLite;
import com.alipay.autotuneservice.dao.jooq.tables.records.NoticeRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class Notice extends TableImpl<NoticeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>TMAESTRO-LITE.NOTICE</code>
     */
    public static final Notice NOTICE = new Notice();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NoticeRecord> getRecordType() {
        return NoticeRecord.class;
    }

    /**
     * The column <code>TMAESTRO-LITE.NOTICE.ID</code>.
     */
    public final TableField<NoticeRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>TMAESTRO-LITE.NOTICE.NOTICE_TYPE</code>.
     */
    public final TableField<NoticeRecord, String> NOTICE_TYPE = createField(DSL.name("NOTICE_TYPE"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>TMAESTRO-LITE.NOTICE.CREATED_TIME</code>.
     */
    public final TableField<NoticeRecord, LocalDateTime> CREATED_TIME = createField(DSL.name("CREATED_TIME"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>TMAESTRO-LITE.NOTICE.UPDATED_TIME</code>.
     */
    public final TableField<NoticeRecord, LocalDateTime> UPDATED_TIME = createField(DSL.name("UPDATED_TIME"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>TMAESTRO-LITE.NOTICE.ACCEPT</code>.
     */
    public final TableField<NoticeRecord, String> ACCEPT = createField(DSL.name("ACCEPT"), SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column <code>TMAESTRO-LITE.NOTICE.ACCESS_TOKEN</code>.
     */
    public final TableField<NoticeRecord, String> ACCESS_TOKEN = createField(DSL.name("ACCESS_TOKEN"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>TMAESTRO-LITE.NOTICE.NOTICE_STATUS</code>.
     */
    public final TableField<NoticeRecord, String> NOTICE_STATUS = createField(DSL.name("NOTICE_STATUS"), SQLDataType.VARCHAR(128), this, "");

    private Notice(Name alias, Table<NoticeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Notice(Name alias, Table<NoticeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>TMAESTRO-LITE.NOTICE</code> table reference
     */
    public Notice(String alias) {
        this(DSL.name(alias), NOTICE);
    }

    /**
     * Create an aliased <code>TMAESTRO-LITE.NOTICE</code> table reference
     */
    public Notice(Name alias) {
        this(alias, NOTICE);
    }

    /**
     * Create a <code>TMAESTRO-LITE.NOTICE</code> table reference
     */
    public Notice() {
        this(DSL.name("NOTICE"), null);
    }

    public <O extends Record> Notice(Table<O> child, ForeignKey<O, NoticeRecord> key) {
        super(child, key, NOTICE);
    }

    @Override
    public Schema getSchema() {
        return TmaestroLite.TMAESTRO_LITE;
    }

    @Override
    public Identity<NoticeRecord, Integer> getIdentity() {
        return (Identity<NoticeRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<NoticeRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_89;
    }

    @Override
    public List<UniqueKey<NoticeRecord>> getKeys() {
        return Arrays.<UniqueKey<NoticeRecord>>asList(Keys.CONSTRAINT_89, Keys.NOTICE_NOTICE_TYPE_ACCESS_TOKEN_UINDEX);
    }

    @Override
    public Notice as(String alias) {
        return new Notice(DSL.name(alias), this);
    }

    @Override
    public Notice as(Name alias) {
        return new Notice(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Notice rename(String name) {
        return new Notice(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Notice rename(Name name) {
        return new Notice(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, LocalDateTime, LocalDateTime, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
