/*
 * This file is generated by jOOQ.
 */
package com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.records;


import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.Downloads;

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
public class DownloadsRecord extends UpdatableRecordImpl<DownloadsRecord> implements Record18<Integer, LocalDateTime, LocalDateTime, LocalDateTime, Integer, Integer, String, Long, Long, String, Integer, String, String, String, String, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>downloads.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>downloads.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>downloads.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>downloads.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>downloads.updated_at</code>.
     */
    public void setUpdatedAt(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>downloads.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>downloads.deleted_at</code>.
     */
    public void setDeletedAt(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>downloads.deleted_at</code>.
     */
    public LocalDateTime getDeletedAt() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>downloads.status</code>.
     */
    public void setStatus(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>downloads.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>downloads.type</code>.
     */
    public void setType(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>downloads.type</code>.
     */
    public Integer getType() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>downloads.source</code>.
     */
    public void setSource(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>downloads.source</code>.
     */
    public String getSource() {
        return (String) get(6);
    }

    /**
     * Setter for <code>downloads.total_size</code>.
     */
    public void setTotalSize(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>downloads.total_size</code>.
     */
    public Long getTotalSize() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>downloads.downloaded_size</code>.
     */
    public void setDownloadedSize(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>downloads.downloaded_size</code>.
     */
    public Long getDownloadedSize() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>downloads.g_id</code>.
     */
    public void setGId(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>downloads.g_id</code>.
     */
    public String getGId() {
        return (String) get(9);
    }

    /**
     * Setter for <code>downloads.speed</code>.
     */
    public void setSpeed(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>downloads.speed</code>.
     */
    public Integer getSpeed() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>downloads.parent</code>.
     */
    public void setParent(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>downloads.parent</code>.
     */
    public String getParent() {
        return (String) get(11);
    }

    /**
     * Setter for <code>downloads.attrs</code>.
     */
    public void setAttrs(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>downloads.attrs</code>.
     */
    public String getAttrs() {
        return (String) get(12);
    }

    /**
     * Setter for <code>downloads.error</code>.
     */
    public void setError(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>downloads.error</code>.
     */
    public String getError() {
        return (String) get(13);
    }

    /**
     * Setter for <code>downloads.dst</code>.
     */
    public void setDst(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>downloads.dst</code>.
     */
    public String getDst() {
        return (String) get(14);
    }

    /**
     * Setter for <code>downloads.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>downloads.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>downloads.task_id</code>.
     */
    public void setTaskId(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>downloads.task_id</code>.
     */
    public Integer getTaskId() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>downloads.node_id</code>.
     */
    public void setNodeId(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>downloads.node_id</code>.
     */
    public Integer getNodeId() {
        return (Integer) get(17);
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
    public Row18<Integer, LocalDateTime, LocalDateTime, LocalDateTime, Integer, Integer, String, Long, Long, String, Integer, String, String, String, String, Integer, Integer, Integer> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<Integer, LocalDateTime, LocalDateTime, LocalDateTime, Integer, Integer, String, Long, Long, String, Integer, String, String, String, String, Integer, Integer, Integer> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Downloads.DOWNLOADS.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return Downloads.DOWNLOADS.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Downloads.DOWNLOADS.UPDATED_AT;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Downloads.DOWNLOADS.DELETED_AT;
    }

    @Override
    public Field<Integer> field5() {
        return Downloads.DOWNLOADS.STATUS;
    }

    @Override
    public Field<Integer> field6() {
        return Downloads.DOWNLOADS.TYPE;
    }

    @Override
    public Field<String> field7() {
        return Downloads.DOWNLOADS.SOURCE;
    }

    @Override
    public Field<Long> field8() {
        return Downloads.DOWNLOADS.TOTAL_SIZE;
    }

    @Override
    public Field<Long> field9() {
        return Downloads.DOWNLOADS.DOWNLOADED_SIZE;
    }

    @Override
    public Field<String> field10() {
        return Downloads.DOWNLOADS.G_ID;
    }

    @Override
    public Field<Integer> field11() {
        return Downloads.DOWNLOADS.SPEED;
    }

    @Override
    public Field<String> field12() {
        return Downloads.DOWNLOADS.PARENT;
    }

    @Override
    public Field<String> field13() {
        return Downloads.DOWNLOADS.ATTRS;
    }

    @Override
    public Field<String> field14() {
        return Downloads.DOWNLOADS.ERROR;
    }

    @Override
    public Field<String> field15() {
        return Downloads.DOWNLOADS.DST;
    }

    @Override
    public Field<Integer> field16() {
        return Downloads.DOWNLOADS.USER_ID;
    }

    @Override
    public Field<Integer> field17() {
        return Downloads.DOWNLOADS.TASK_ID;
    }

    @Override
    public Field<Integer> field18() {
        return Downloads.DOWNLOADS.NODE_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public LocalDateTime component2() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component3() {
        return getUpdatedAt();
    }

    @Override
    public LocalDateTime component4() {
        return getDeletedAt();
    }

    @Override
    public Integer component5() {
        return getStatus();
    }

    @Override
    public Integer component6() {
        return getType();
    }

    @Override
    public String component7() {
        return getSource();
    }

    @Override
    public Long component8() {
        return getTotalSize();
    }

    @Override
    public Long component9() {
        return getDownloadedSize();
    }

    @Override
    public String component10() {
        return getGId();
    }

    @Override
    public Integer component11() {
        return getSpeed();
    }

    @Override
    public String component12() {
        return getParent();
    }

    @Override
    public String component13() {
        return getAttrs();
    }

    @Override
    public String component14() {
        return getError();
    }

    @Override
    public String component15() {
        return getDst();
    }

    @Override
    public Integer component16() {
        return getUserId();
    }

    @Override
    public Integer component17() {
        return getTaskId();
    }

    @Override
    public Integer component18() {
        return getNodeId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public LocalDateTime value2() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value3() {
        return getUpdatedAt();
    }

    @Override
    public LocalDateTime value4() {
        return getDeletedAt();
    }

    @Override
    public Integer value5() {
        return getStatus();
    }

    @Override
    public Integer value6() {
        return getType();
    }

    @Override
    public String value7() {
        return getSource();
    }

    @Override
    public Long value8() {
        return getTotalSize();
    }

    @Override
    public Long value9() {
        return getDownloadedSize();
    }

    @Override
    public String value10() {
        return getGId();
    }

    @Override
    public Integer value11() {
        return getSpeed();
    }

    @Override
    public String value12() {
        return getParent();
    }

    @Override
    public String value13() {
        return getAttrs();
    }

    @Override
    public String value14() {
        return getError();
    }

    @Override
    public String value15() {
        return getDst();
    }

    @Override
    public Integer value16() {
        return getUserId();
    }

    @Override
    public Integer value17() {
        return getTaskId();
    }

    @Override
    public Integer value18() {
        return getNodeId();
    }

    @Override
    public DownloadsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public DownloadsRecord value2(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public DownloadsRecord value3(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public DownloadsRecord value4(LocalDateTime value) {
        setDeletedAt(value);
        return this;
    }

    @Override
    public DownloadsRecord value5(Integer value) {
        setStatus(value);
        return this;
    }

    @Override
    public DownloadsRecord value6(Integer value) {
        setType(value);
        return this;
    }

    @Override
    public DownloadsRecord value7(String value) {
        setSource(value);
        return this;
    }

    @Override
    public DownloadsRecord value8(Long value) {
        setTotalSize(value);
        return this;
    }

    @Override
    public DownloadsRecord value9(Long value) {
        setDownloadedSize(value);
        return this;
    }

    @Override
    public DownloadsRecord value10(String value) {
        setGId(value);
        return this;
    }

    @Override
    public DownloadsRecord value11(Integer value) {
        setSpeed(value);
        return this;
    }

    @Override
    public DownloadsRecord value12(String value) {
        setParent(value);
        return this;
    }

    @Override
    public DownloadsRecord value13(String value) {
        setAttrs(value);
        return this;
    }

    @Override
    public DownloadsRecord value14(String value) {
        setError(value);
        return this;
    }

    @Override
    public DownloadsRecord value15(String value) {
        setDst(value);
        return this;
    }

    @Override
    public DownloadsRecord value16(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public DownloadsRecord value17(Integer value) {
        setTaskId(value);
        return this;
    }

    @Override
    public DownloadsRecord value18(Integer value) {
        setNodeId(value);
        return this;
    }

    @Override
    public DownloadsRecord values(Integer value1, LocalDateTime value2, LocalDateTime value3, LocalDateTime value4, Integer value5, Integer value6, String value7, Long value8, Long value9, String value10, Integer value11, String value12, String value13, String value14, String value15, Integer value16, Integer value17, Integer value18) {
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
     * Create a detached DownloadsRecord
     */
    public DownloadsRecord() {
        super(Downloads.DOWNLOADS);
    }

    /**
     * Create a detached, initialised DownloadsRecord
     */
    public DownloadsRecord(Integer id, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, Integer status, Integer type, String source, Long totalSize, Long downloadedSize, String gId, Integer speed, String parent, String attrs, String error, String dst, Integer userId, Integer taskId, Integer nodeId) {
        super(Downloads.DOWNLOADS);

        setId(id);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
        setDeletedAt(deletedAt);
        setStatus(status);
        setType(type);
        setSource(source);
        setTotalSize(totalSize);
        setDownloadedSize(downloadedSize);
        setGId(gId);
        setSpeed(speed);
        setParent(parent);
        setAttrs(attrs);
        setError(error);
        setDst(dst);
        setUserId(userId);
        setTaskId(taskId);
        setNodeId(nodeId);
    }
}