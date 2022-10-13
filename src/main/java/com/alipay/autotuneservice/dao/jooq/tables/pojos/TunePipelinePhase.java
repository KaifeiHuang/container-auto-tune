/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 调参pipeline阶段
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TunePipelinePhase implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       id;
    private String        stage;
    private Integer       pipelineId;
    private Integer       pipelineBranchId;
    private LocalDateTime updatedTime;
    private LocalDateTime createdTime;
    private String        context;

    public TunePipelinePhase() {}

    public TunePipelinePhase(TunePipelinePhase value) {
        this.id = value.id;
        this.stage = value.stage;
        this.pipelineId = value.pipelineId;
        this.pipelineBranchId = value.pipelineBranchId;
        this.updatedTime = value.updatedTime;
        this.createdTime = value.createdTime;
        this.context = value.context;
    }

    public TunePipelinePhase(
        Integer       id,
        String        stage,
        Integer       pipelineId,
        Integer       pipelineBranchId,
        LocalDateTime updatedTime,
        LocalDateTime createdTime,
        String        context
    ) {
        this.id = id;
        this.stage = stage;
        this.pipelineId = pipelineId;
        this.pipelineBranchId = pipelineBranchId;
        this.updatedTime = updatedTime;
        this.createdTime = createdTime;
        this.context = context;
    }

    /**
     * Getter for <code>tmaestro-lite.tune_pipeline_phase.ID</code>. 主键
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>tmaestro-lite.tune_pipeline_phase.ID</code>. 主键
     */
    public TunePipelinePhase setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tune_pipeline_phase.STAGE</code>. 阶段
     */
    public String getStage() {
        return this.stage;
    }

    /**
     * Setter for <code>tmaestro-lite.tune_pipeline_phase.STAGE</code>. 阶段
     */
    public TunePipelinePhase setStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tune_pipeline_phase.PIPELINE_ID</code>. pipeline id
     */
    public Integer getPipelineId() {
        return this.pipelineId;
    }

    /**
     * Setter for <code>tmaestro-lite.tune_pipeline_phase.PIPELINE_ID</code>. pipeline id
     */
    public TunePipelinePhase setPipelineId(Integer pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tune_pipeline_phase.PIPELINE_BRANCH_ID</code>. tune_pipeline主键id
     */
    public Integer getPipelineBranchId() {
        return this.pipelineBranchId;
    }

    /**
     * Setter for <code>tmaestro-lite.tune_pipeline_phase.PIPELINE_BRANCH_ID</code>. tune_pipeline主键id
     */
    public TunePipelinePhase setPipelineBranchId(Integer pipelineBranchId) {
        this.pipelineBranchId = pipelineBranchId;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tune_pipeline_phase.UPDATED_TIME</code>. 更新时间
     */
    public LocalDateTime getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * Setter for <code>tmaestro-lite.tune_pipeline_phase.UPDATED_TIME</code>. 更新时间
     */
    public TunePipelinePhase setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tune_pipeline_phase.CREATED_TIME</code>. 创建时间
     */
    public LocalDateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Setter for <code>tmaestro-lite.tune_pipeline_phase.CREATED_TIME</code>. 创建时间
     */
    public TunePipelinePhase setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.tune_pipeline_phase.CONTEXT</code>. 上下文
     */
    public String getContext() {
        return this.context;
    }

    /**
     * Setter for <code>tmaestro-lite.tune_pipeline_phase.CONTEXT</code>. 上下文
     */
    public TunePipelinePhase setContext(String context) {
        this.context = context;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TunePipelinePhase (");

        sb.append(id);
        sb.append(", ").append(stage);
        sb.append(", ").append(pipelineId);
        sb.append(", ").append(pipelineBranchId);
        sb.append(", ").append(updatedTime);
        sb.append(", ").append(createdTime);
        sb.append(", ").append(context);

        sb.append(")");
        return sb.toString();
    }
}
