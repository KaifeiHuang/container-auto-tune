/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 单机管理表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PodInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       id;
    private Integer       appId;
    private Integer       nodeId;
    private String        podName;
    private String        ip;
    private String        status;
    private LocalDateTime createdTime;
    private String        podJvm;
    private String        env;
    private String        podDeployType;
    private String        podTemplate;
    private String        podTags;
    private String        accessToken;
    private String        clusterName;
    private String        k8sNamespace;
    private String        podStatus;
    private LocalDateTime updatedTime;
    private Integer       cpuCoreLimit;
    private Integer       memLimit;
    private String        cpuLimit;
    private Integer       agentInstall;
    private String        dHostname;
    private String        nodeIp;
    private String        nodeName;

    public PodInfo() {}

    public PodInfo(PodInfo value) {
        this.id = value.id;
        this.appId = value.appId;
        this.nodeId = value.nodeId;
        this.podName = value.podName;
        this.ip = value.ip;
        this.status = value.status;
        this.createdTime = value.createdTime;
        this.podJvm = value.podJvm;
        this.env = value.env;
        this.podDeployType = value.podDeployType;
        this.podTemplate = value.podTemplate;
        this.podTags = value.podTags;
        this.accessToken = value.accessToken;
        this.clusterName = value.clusterName;
        this.k8sNamespace = value.k8sNamespace;
        this.podStatus = value.podStatus;
        this.updatedTime = value.updatedTime;
        this.cpuCoreLimit = value.cpuCoreLimit;
        this.memLimit = value.memLimit;
        this.cpuLimit = value.cpuLimit;
        this.agentInstall = value.agentInstall;
        this.dHostname = value.dHostname;
        this.nodeIp = value.nodeIp;
        this.nodeName = value.nodeName;
    }

    public PodInfo(
        Integer       id,
        Integer       appId,
        Integer       nodeId,
        String        podName,
        String        ip,
        String        status,
        LocalDateTime createdTime,
        String        podJvm,
        String        env,
        String        podDeployType,
        String        podTemplate,
        String        podTags,
        String        accessToken,
        String        clusterName,
        String        k8sNamespace,
        String        podStatus,
        LocalDateTime updatedTime,
        Integer       cpuCoreLimit,
        Integer       memLimit,
        String        cpuLimit,
        Integer       agentInstall,
        String        dHostname,
        String        nodeIp,
        String        nodeName
    ) {
        this.id = id;
        this.appId = appId;
        this.nodeId = nodeId;
        this.podName = podName;
        this.ip = ip;
        this.status = status;
        this.createdTime = createdTime;
        this.podJvm = podJvm;
        this.env = env;
        this.podDeployType = podDeployType;
        this.podTemplate = podTemplate;
        this.podTags = podTags;
        this.accessToken = accessToken;
        this.clusterName = clusterName;
        this.k8sNamespace = k8sNamespace;
        this.podStatus = podStatus;
        this.updatedTime = updatedTime;
        this.cpuCoreLimit = cpuCoreLimit;
        this.memLimit = memLimit;
        this.cpuLimit = cpuLimit;
        this.agentInstall = agentInstall;
        this.dHostname = dHostname;
        this.nodeIp = nodeIp;
        this.nodeName = nodeName;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.ID</code>. 主键ID
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.ID</code>. 主键ID
     */
    public PodInfo setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.APP_ID</code>. 关联的应用id
     */
    public Integer getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.APP_ID</code>. 关联的应用id
     */
    public PodInfo setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.NODE_ID</code>. 关联的集群id
     */
    public Integer getNodeId() {
        return this.nodeId;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.NODE_ID</code>. 关联的集群id
     */
    public PodInfo setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.POD_NAME</code>. 所属节点名称
     */
    public String getPodName() {
        return this.podName;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.POD_NAME</code>. 所属节点名称
     */
    public PodInfo setPodName(String podName) {
        this.podName = podName;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.IP</code>. IP地址
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.IP</code>. IP地址
     */
    public PodInfo setIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.STATUS</code>. 状态;状态;包含：存活、失效
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.STATUS</code>. 状态;状态;包含：存活、失效
     */
    public PodInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.CREATED_TIME</code>. 创建时间
     */
    public LocalDateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.CREATED_TIME</code>. 创建时间
     */
    public PodInfo setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.POD_JVM</code>. 生效jvm配置
     */
    public String getPodJvm() {
        return this.podJvm;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.POD_JVM</code>. 生效jvm配置
     */
    public PodInfo setPodJvm(String podJvm) {
        this.podJvm = podJvm;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.ENV</code>. 环境变量
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.ENV</code>. 环境变量
     */
    public PodInfo setEnv(String env) {
        this.env = env;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.POD_DEPLOY_TYPE</code>. pod部署类型
     */
    public String getPodDeployType() {
        return this.podDeployType;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.POD_DEPLOY_TYPE</code>. pod部署类型
     */
    public PodInfo setPodDeployType(String podDeployType) {
        this.podDeployType = podDeployType;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.POD_TEMPLATE</code>. pod基础模板信息;pod部署类型：4C8G
     */
    public String getPodTemplate() {
        return this.podTemplate;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.POD_TEMPLATE</code>. pod基础模板信息;pod部署类型：4C8G
     */
    public PodInfo setPodTemplate(String podTemplate) {
        this.podTemplate = podTemplate;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.POD_TAGS</code>. 标签
     */
    public String getPodTags() {
        return this.podTags;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.POD_TAGS</code>. 标签
     */
    public PodInfo setPodTags(String podTags) {
        this.podTags = podTags;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.ACCESS_TOKEN</code>. 关联的token
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.ACCESS_TOKEN</code>. 关联的token
     */
    public PodInfo setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.CLUSTER_NAME</code>. k8s集群名
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.CLUSTER_NAME</code>. k8s集群名
     */
    public PodInfo setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.K8S_NAMESPACE</code>. k8s命名空间
     */
    public String getK8sNamespace() {
        return this.k8sNamespace;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.K8S_NAMESPACE</code>. k8s命名空间
     */
    public PodInfo setK8sNamespace(String k8sNamespace) {
        this.k8sNamespace = k8sNamespace;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.POD_STATUS</code>. 状态;状态;包含：存活、失效
     */
    public String getPodStatus() {
        return this.podStatus;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.POD_STATUS</code>. 状态;状态;包含：存活、失效
     */
    public PodInfo setPodStatus(String podStatus) {
        this.podStatus = podStatus;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.UPDATED_TIME</code>.
     */
    public LocalDateTime getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.UPDATED_TIME</code>.
     */
    public PodInfo setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.CPU_CORE_LIMIT</code>. cpu core limit
     */
    public Integer getCpuCoreLimit() {
        return this.cpuCoreLimit;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.CPU_CORE_LIMIT</code>. cpu core limit
     */
    public PodInfo setCpuCoreLimit(Integer cpuCoreLimit) {
        this.cpuCoreLimit = cpuCoreLimit;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.MEM_LIMIT</code>. memory limit
     */
    public Integer getMemLimit() {
        return this.memLimit;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.MEM_LIMIT</code>. memory limit
     */
    public PodInfo setMemLimit(Integer memLimit) {
        this.memLimit = memLimit;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.CPU_LIMIT</code>. cpu limit
     */
    public String getCpuLimit() {
        return this.cpuLimit;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.CPU_LIMIT</code>. cpu limit
     */
    public PodInfo setCpuLimit(String cpuLimit) {
        this.cpuLimit = cpuLimit;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.AGENT_INSTALL</code>. 是否安装autotuneagent.
1 - 安装
0 - 未安装
     */
    public Integer getAgentInstall() {
        return this.agentInstall;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.AGENT_INSTALL</code>. 是否安装autotuneagent.
1 - 安装
0 - 未安装
     */
    public PodInfo setAgentInstall(Integer agentInstall) {
        this.agentInstall = agentInstall;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.D_HOSTNAME</code>.
     */
    public String getDHostname() {
        return this.dHostname;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.D_HOSTNAME</code>.
     */
    public PodInfo setDHostname(String dHostname) {
        this.dHostname = dHostname;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.NODE_IP</code>.
     */
    public String getNodeIp() {
        return this.nodeIp;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.NODE_IP</code>.
     */
    public PodInfo setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }

    /**
     * Getter for <code>tmaestro-lite.pod_info.NODE_NAME</code>.
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * Setter for <code>tmaestro-lite.pod_info.NODE_NAME</code>.
     */
    public PodInfo setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PodInfo (");

        sb.append(id);
        sb.append(", ").append(appId);
        sb.append(", ").append(nodeId);
        sb.append(", ").append(podName);
        sb.append(", ").append(ip);
        sb.append(", ").append(status);
        sb.append(", ").append(createdTime);
        sb.append(", ").append(podJvm);
        sb.append(", ").append(env);
        sb.append(", ").append(podDeployType);
        sb.append(", ").append(podTemplate);
        sb.append(", ").append(podTags);
        sb.append(", ").append(accessToken);
        sb.append(", ").append(clusterName);
        sb.append(", ").append(k8sNamespace);
        sb.append(", ").append(podStatus);
        sb.append(", ").append(updatedTime);
        sb.append(", ").append(cpuCoreLimit);
        sb.append(", ").append(memLimit);
        sb.append(", ").append(cpuLimit);
        sb.append(", ").append(agentInstall);
        sb.append(", ").append(dHostname);
        sb.append(", ").append(nodeIp);
        sb.append(", ").append(nodeName);

        sb.append(")");
        return sb.toString();
    }
}
