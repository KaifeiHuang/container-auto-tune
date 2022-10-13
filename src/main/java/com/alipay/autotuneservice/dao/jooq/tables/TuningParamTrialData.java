/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables;


import com.alipay.autotuneservice.dao.jooq.Keys;
import com.alipay.autotuneservice.dao.jooq.TmaestroLite;
import com.alipay.autotuneservice.dao.jooq.tables.records.TuningParamTrialDataRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row17;
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
public class TuningParamTrialData extends TableImpl<TuningParamTrialDataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>tmaestro-lite.tuning_param_trial_data</code>
     */
    public static final TuningParamTrialData TUNING_PARAM_TRIAL_DATA = new TuningParamTrialData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TuningParamTrialDataRecord> getRecordType() {
        return TuningParamTrialDataRecord.class;
    }

    /**
     * The column <code>tmaestro-lite.tuning_param_trial_data.id</code>.
     */
    public final TableField<TuningParamTrialDataRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>tmaestro-lite.tuning_param_trial_data.pipeline_id</code>.
     */
    public final TableField<TuningParamTrialDataRecord, Integer> PIPELINE_ID = createField(DSL.name("pipeline_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>tmaestro-lite.tuning_param_trial_data.trial_id</code>.
     */
    public final TableField<TuningParamTrialDataRecord, Integer> TRIAL_ID = createField(DSL.name("trial_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>tmaestro-lite.tuning_param_trial_data.app</code>.
     */
    public final TableField<TuningParamTrialDataRecord, String> APP = createField(DSL.name("app"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>tmaestro-lite.tuning_param_trial_data.app_id</code>.
     */
    public final TableField<TuningParamTrialDataRecord, String> APP_ID = createField(DSL.name("app_id"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>tmaestro-lite.tuning_param_trial_data.trial_status</code>.
     */
    public final TableField<TuningParamTrialDataRecord, String> TRIAL_STATUS = createField(DSL.name("trial_status"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>tmaestro-lite.tuning_param_trial_data.trial_status_info</code>.
     */
    public final TableField<TuningParamTrialDataRecord, String> TRIAL_STATUS_INFO = createField(DSL.name("trial_status_info"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>tmaestro-lite.tuning_param_trial_data.task_status</code>.
     */
    public final TableField<TuningParamTrialDataRecord, String> TASK_STATUS = createField(DSL.name("task_status"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>tmaestro-lite.tuning_param_trial_data.refer_params</code>.
     */
    public final TableField<TuningParamTrialDataRecord, String> REFER_PARAMS = createField(DSL.name("refer_params"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>tmaestro-lite.tuning_param_trial_data.trial_params</code>.
     */
    public final TableField<TuningParamTrialDataRecord, String> TRIAL_PARAMS = createField(DSL.name("trial_params"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>tmaestro-lite.tuning_param_trial_data.alg_rec_type</code>.
     */
    public final TableField<TuningParamTrialDataRecord, String> ALG_REC_TYPE = createField(DSL.name("alg_rec_type"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>tmaestro-lite.tuning_param_trial_data.refer_pods</code>.
     */
    public final TableField<TuningParamTrialDataRecord, String> REFER_PODS = createField(DSL.name("refer_pods"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>tmaestro-lite.tuning_param_trial_data.trial_pods</code>.
     */
    public final TableField<TuningParamTrialDataRecord, String> TRIAL_PODS = createField(DSL.name("trial_pods"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>tmaestro-lite.tuning_param_trial_data.refer_metric_value</code>.
     */
    public final TableField<TuningParamTrialDataRecord, String> REFER_METRIC_VALUE = createField(DSL.name("refer_metric_value"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>tmaestro-lite.tuning_param_trial_data.trial_metric_value</code>.
     */
    public final TableField<TuningParamTrialDataRecord, String> TRIAL_METRIC_VALUE = createField(DSL.name("trial_metric_value"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>tmaestro-lite.tuning_param_trial_data.start_time</code>.
     */
    public final TableField<TuningParamTrialDataRecord, LocalDateTime> START_TIME = createField(DSL.name("start_time"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>tmaestro-lite.tuning_param_trial_data.stop_time</code>.
     */
    public final TableField<TuningParamTrialDataRecord, LocalDateTime> STOP_TIME = createField(DSL.name("stop_time"), SQLDataType.LOCALDATETIME(0), this, "");

    private TuningParamTrialData(Name alias, Table<TuningParamTrialDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private TuningParamTrialData(Name alias, Table<TuningParamTrialDataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>tmaestro-lite.tuning_param_trial_data</code> table reference
     */
    public TuningParamTrialData(String alias) {
        this(DSL.name(alias), TUNING_PARAM_TRIAL_DATA);
    }

    /**
     * Create an aliased <code>tmaestro-lite.tuning_param_trial_data</code> table reference
     */
    public TuningParamTrialData(Name alias) {
        this(alias, TUNING_PARAM_TRIAL_DATA);
    }

    /**
     * Create a <code>tmaestro-lite.tuning_param_trial_data</code> table reference
     */
    public TuningParamTrialData() {
        this(DSL.name("tuning_param_trial_data"), null);
    }

    public <O extends Record> TuningParamTrialData(Table<O> child, ForeignKey<O, TuningParamTrialDataRecord> key) {
        super(child, key, TUNING_PARAM_TRIAL_DATA);
    }

    @Override
    public Schema getSchema() {
        return TmaestroLite.TMAESTRO_LITE;
    }

    @Override
    public Identity<TuningParamTrialDataRecord, Long> getIdentity() {
        return (Identity<TuningParamTrialDataRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<TuningParamTrialDataRecord> getPrimaryKey() {
        return Keys.KEY_TUNING_PARAM_TRIAL_DATA_PRIMARY;
    }

    @Override
    public List<UniqueKey<TuningParamTrialDataRecord>> getKeys() {
        return Arrays.<UniqueKey<TuningParamTrialDataRecord>>asList(Keys.KEY_TUNING_PARAM_TRIAL_DATA_PRIMARY);
    }

    @Override
    public TuningParamTrialData as(String alias) {
        return new TuningParamTrialData(DSL.name(alias), this);
    }

    @Override
    public TuningParamTrialData as(Name alias) {
        return new TuningParamTrialData(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TuningParamTrialData rename(String name) {
        return new TuningParamTrialData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TuningParamTrialData rename(Name name) {
        return new TuningParamTrialData(name, null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<Long, Integer, Integer, String, String, String, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row17) super.fieldsRow();
    }
}
