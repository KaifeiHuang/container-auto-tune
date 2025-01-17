/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables.records;


import com.alipay.autotuneservice.dao.jooq.tables.JavaInfo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JavaInfoRecord extends UpdatableRecordImpl<JavaInfoRecord> implements Record18<Integer, Integer, String, String, String, String, String, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>TMAESTRO-LITE.JAVA_INFO.ID</code>. 唯一ID;唯一ID
     */
    public JavaInfoRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JAVA_INFO.ID</code>. 唯一ID;唯一ID
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JAVA_INFO.PID</code>. 应用id
     */
    public JavaInfoRecord setPid(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JAVA_INFO.PID</code>. 应用id
     */
    public Integer getPid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JAVA_INFO.VERSION</code>. 版本
     */
    public JavaInfoRecord setVersion(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JAVA_INFO.VERSION</code>. 版本
     */
    public String getVersion() {
        return (String) get(2);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JAVA_INFO.JVM_HOME</code>. javaHome
     */
    public JavaInfoRecord setJvmHome(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JAVA_INFO.JVM_HOME</code>. javaHome
     */
    public String getJvmHome() {
        return (String) get(3);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JAVA_INFO.CLASS_PATH</code>. classPath
     */
    public JavaInfoRecord setClassPath(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JAVA_INFO.CLASS_PATH</code>. classPath
     */
    public String getClassPath() {
        return (String) get(4);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JAVA_INFO.LIBRARY_PATH</code>. 文件路径
     */
    public JavaInfoRecord setLibraryPath(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JAVA_INFO.LIBRARY_PATH</code>. 文件路径
     */
    public String getLibraryPath() {
        return (String) get(5);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JAVA_INFO.USER_NAME</code>. userName
     */
    public JavaInfoRecord setUserName(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JAVA_INFO.USER_NAME</code>. userName
     */
    public String getUserName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JAVA_INFO.USER_DIR</code>. userDir
     */
    public JavaInfoRecord setUserDir(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JAVA_INFO.USER_DIR</code>. userDir
     */
    public String getUserDir() {
        return (String) get(7);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JAVA_INFO.EXEC_TIME</code>. 存活时间
     */
    public JavaInfoRecord setExecTime(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JAVA_INFO.EXEC_TIME</code>. 存活时间
     */
    public String getExecTime() {
        return (String) get(8);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JAVA_INFO.JAVA_LIBS</code>. 依赖包
     */
    public JavaInfoRecord setJavaLibs(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JAVA_INFO.JAVA_LIBS</code>. 依赖包
     */
    public String getJavaLibs() {
        return (String) get(9);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JAVA_INFO.INPUT_ARGUMENTS</code>. 启动参数
     */
    public JavaInfoRecord setInputArguments(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JAVA_INFO.INPUT_ARGUMENTS</code>. 启动参数
     */
    public String getInputArguments() {
        return (String) get(10);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JAVA_INFO.HOST_NAME</code>. hostname
     */
    public JavaInfoRecord setHostName(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JAVA_INFO.HOST_NAME</code>. hostname
     */
    public String getHostName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JAVA_INFO.OS_VERSION</code>. osVersion
     */
    public JavaInfoRecord setOsVersion(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JAVA_INFO.OS_VERSION</code>. osVersion
     */
    public String getOsVersion() {
        return (String) get(12);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JAVA_INFO.OS_ARCH</code>. osArch
     */
    public JavaInfoRecord setOsArch(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JAVA_INFO.OS_ARCH</code>. osArch
     */
    public String getOsArch() {
        return (String) get(13);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JAVA_INFO.APP_NAME</code>. 集群真实名称;集群真实名称
     */
    public JavaInfoRecord setAppName(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JAVA_INFO.APP_NAME</code>. 集群真实名称;集群真实名称
     */
    public String getAppName() {
        return (String) get(14);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JAVA_INFO.NAMESPACE</code>.
     */
    public JavaInfoRecord setNamespace(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JAVA_INFO.NAMESPACE</code>.
     */
    public String getNamespace() {
        return (String) get(15);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JAVA_INFO.CREATED_TIME</code>. 创建时间;创建时间
     */
    public JavaInfoRecord setCreatedTime(LocalDateTime value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JAVA_INFO.CREATED_TIME</code>. 创建时间;创建时间
     */
    public LocalDateTime getCreatedTime() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.JAVA_INFO.UPDATED_TIME</code>. 更新时间;更新时间
     */
    public JavaInfoRecord setUpdatedTime(LocalDateTime value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.JAVA_INFO.UPDATED_TIME</code>. 更新时间;更新时间
     */
    public LocalDateTime getUpdatedTime() {
        return (LocalDateTime) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<Integer, Integer, String, String, String, String, String, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<Integer, Integer, String, String, String, String, String, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return JavaInfo.JAVA_INFO.ID;
    }

    @Override
    public Field<Integer> field2() {
        return JavaInfo.JAVA_INFO.PID;
    }

    @Override
    public Field<String> field3() {
        return JavaInfo.JAVA_INFO.VERSION;
    }

    @Override
    public Field<String> field4() {
        return JavaInfo.JAVA_INFO.JVM_HOME;
    }

    @Override
    public Field<String> field5() {
        return JavaInfo.JAVA_INFO.CLASS_PATH;
    }

    @Override
    public Field<String> field6() {
        return JavaInfo.JAVA_INFO.LIBRARY_PATH;
    }

    @Override
    public Field<String> field7() {
        return JavaInfo.JAVA_INFO.USER_NAME;
    }

    @Override
    public Field<String> field8() {
        return JavaInfo.JAVA_INFO.USER_DIR;
    }

    @Override
    public Field<String> field9() {
        return JavaInfo.JAVA_INFO.EXEC_TIME;
    }

    @Override
    public Field<String> field10() {
        return JavaInfo.JAVA_INFO.JAVA_LIBS;
    }

    @Override
    public Field<String> field11() {
        return JavaInfo.JAVA_INFO.INPUT_ARGUMENTS;
    }

    @Override
    public Field<String> field12() {
        return JavaInfo.JAVA_INFO.HOST_NAME;
    }

    @Override
    public Field<String> field13() {
        return JavaInfo.JAVA_INFO.OS_VERSION;
    }

    @Override
    public Field<String> field14() {
        return JavaInfo.JAVA_INFO.OS_ARCH;
    }

    @Override
    public Field<String> field15() {
        return JavaInfo.JAVA_INFO.APP_NAME;
    }

    @Override
    public Field<String> field16() {
        return JavaInfo.JAVA_INFO.NAMESPACE;
    }

    @Override
    public Field<LocalDateTime> field17() {
        return JavaInfo.JAVA_INFO.CREATED_TIME;
    }

    @Override
    public Field<LocalDateTime> field18() {
        return JavaInfo.JAVA_INFO.UPDATED_TIME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getPid();
    }

    @Override
    public String component3() {
        return getVersion();
    }

    @Override
    public String component4() {
        return getJvmHome();
    }

    @Override
    public String component5() {
        return getClassPath();
    }

    @Override
    public String component6() {
        return getLibraryPath();
    }

    @Override
    public String component7() {
        return getUserName();
    }

    @Override
    public String component8() {
        return getUserDir();
    }

    @Override
    public String component9() {
        return getExecTime();
    }

    @Override
    public String component10() {
        return getJavaLibs();
    }

    @Override
    public String component11() {
        return getInputArguments();
    }

    @Override
    public String component12() {
        return getHostName();
    }

    @Override
    public String component13() {
        return getOsVersion();
    }

    @Override
    public String component14() {
        return getOsArch();
    }

    @Override
    public String component15() {
        return getAppName();
    }

    @Override
    public String component16() {
        return getNamespace();
    }

    @Override
    public LocalDateTime component17() {
        return getCreatedTime();
    }

    @Override
    public LocalDateTime component18() {
        return getUpdatedTime();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getPid();
    }

    @Override
    public String value3() {
        return getVersion();
    }

    @Override
    public String value4() {
        return getJvmHome();
    }

    @Override
    public String value5() {
        return getClassPath();
    }

    @Override
    public String value6() {
        return getLibraryPath();
    }

    @Override
    public String value7() {
        return getUserName();
    }

    @Override
    public String value8() {
        return getUserDir();
    }

    @Override
    public String value9() {
        return getExecTime();
    }

    @Override
    public String value10() {
        return getJavaLibs();
    }

    @Override
    public String value11() {
        return getInputArguments();
    }

    @Override
    public String value12() {
        return getHostName();
    }

    @Override
    public String value13() {
        return getOsVersion();
    }

    @Override
    public String value14() {
        return getOsArch();
    }

    @Override
    public String value15() {
        return getAppName();
    }

    @Override
    public String value16() {
        return getNamespace();
    }

    @Override
    public LocalDateTime value17() {
        return getCreatedTime();
    }

    @Override
    public LocalDateTime value18() {
        return getUpdatedTime();
    }

    @Override
    public JavaInfoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public JavaInfoRecord value2(Integer value) {
        setPid(value);
        return this;
    }

    @Override
    public JavaInfoRecord value3(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public JavaInfoRecord value4(String value) {
        setJvmHome(value);
        return this;
    }

    @Override
    public JavaInfoRecord value5(String value) {
        setClassPath(value);
        return this;
    }

    @Override
    public JavaInfoRecord value6(String value) {
        setLibraryPath(value);
        return this;
    }

    @Override
    public JavaInfoRecord value7(String value) {
        setUserName(value);
        return this;
    }

    @Override
    public JavaInfoRecord value8(String value) {
        setUserDir(value);
        return this;
    }

    @Override
    public JavaInfoRecord value9(String value) {
        setExecTime(value);
        return this;
    }

    @Override
    public JavaInfoRecord value10(String value) {
        setJavaLibs(value);
        return this;
    }

    @Override
    public JavaInfoRecord value11(String value) {
        setInputArguments(value);
        return this;
    }

    @Override
    public JavaInfoRecord value12(String value) {
        setHostName(value);
        return this;
    }

    @Override
    public JavaInfoRecord value13(String value) {
        setOsVersion(value);
        return this;
    }

    @Override
    public JavaInfoRecord value14(String value) {
        setOsArch(value);
        return this;
    }

    @Override
    public JavaInfoRecord value15(String value) {
        setAppName(value);
        return this;
    }

    @Override
    public JavaInfoRecord value16(String value) {
        setNamespace(value);
        return this;
    }

    @Override
    public JavaInfoRecord value17(LocalDateTime value) {
        setCreatedTime(value);
        return this;
    }

    @Override
    public JavaInfoRecord value18(LocalDateTime value) {
        setUpdatedTime(value);
        return this;
    }

    @Override
    public JavaInfoRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, LocalDateTime value17, LocalDateTime value18) {
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
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JavaInfoRecord
     */
    public JavaInfoRecord() {
        super(JavaInfo.JAVA_INFO);
    }

    /**
     * Create a detached, initialised JavaInfoRecord
     */
    public JavaInfoRecord(Integer id, Integer pid, String version, String jvmHome, String classPath, String libraryPath, String userName, String userDir, String execTime, String javaLibs, String inputArguments, String hostName, String osVersion, String osArch, String appName, String namespace, LocalDateTime createdTime, LocalDateTime updatedTime) {
        super(JavaInfo.JAVA_INFO);

        setId(id);
        setPid(pid);
        setVersion(version);
        setJvmHome(jvmHome);
        setClassPath(classPath);
        setLibraryPath(libraryPath);
        setUserName(userName);
        setUserDir(userDir);
        setExecTime(execTime);
        setJavaLibs(javaLibs);
        setInputArguments(inputArguments);
        setHostName(hostName);
        setOsVersion(osVersion);
        setOsArch(osArch);
        setAppName(appName);
        setNamespace(namespace);
        setCreatedTime(createdTime);
        setUpdatedTime(updatedTime);
    }
}
