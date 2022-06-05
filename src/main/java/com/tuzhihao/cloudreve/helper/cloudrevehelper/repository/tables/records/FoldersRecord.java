/*
 * This file is generated by jOOQ.
 */
package com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.records;


import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.Folders;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FoldersRecord extends UpdatableRecordImpl<FoldersRecord> implements Record7<Integer, LocalDateTime, LocalDateTime, LocalDateTime, String, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>folders.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>folders.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>folders.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>folders.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>folders.updated_at</code>.
     */
    public void setUpdatedAt(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>folders.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>folders.deleted_at</code>.
     */
    public void setDeletedAt(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>folders.deleted_at</code>.
     */
    public LocalDateTime getDeletedAt() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>folders.name</code>.
     */
    public void setName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>folders.name</code>.
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>folders.parent_id</code>.
     */
    public void setParentId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>folders.parent_id</code>.
     */
    public Integer getParentId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>folders.owner_id</code>.
     */
    public void setOwnerId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>folders.owner_id</code>.
     */
    public Integer getOwnerId() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, LocalDateTime, LocalDateTime, LocalDateTime, String, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, LocalDateTime, LocalDateTime, LocalDateTime, String, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Folders.FOLDERS.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return Folders.FOLDERS.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Folders.FOLDERS.UPDATED_AT;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Folders.FOLDERS.DELETED_AT;
    }

    @Override
    public Field<String> field5() {
        return Folders.FOLDERS.NAME;
    }

    @Override
    public Field<Integer> field6() {
        return Folders.FOLDERS.PARENT_ID;
    }

    @Override
    public Field<Integer> field7() {
        return Folders.FOLDERS.OWNER_ID;
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
    public String component5() {
        return getName();
    }

    @Override
    public Integer component6() {
        return getParentId();
    }

    @Override
    public Integer component7() {
        return getOwnerId();
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
    public String value5() {
        return getName();
    }

    @Override
    public Integer value6() {
        return getParentId();
    }

    @Override
    public Integer value7() {
        return getOwnerId();
    }

    @Override
    public FoldersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public FoldersRecord value2(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public FoldersRecord value3(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public FoldersRecord value4(LocalDateTime value) {
        setDeletedAt(value);
        return this;
    }

    @Override
    public FoldersRecord value5(String value) {
        setName(value);
        return this;
    }

    @Override
    public FoldersRecord value6(Integer value) {
        setParentId(value);
        return this;
    }

    @Override
    public FoldersRecord value7(Integer value) {
        setOwnerId(value);
        return this;
    }

    @Override
    public FoldersRecord values(Integer value1, LocalDateTime value2, LocalDateTime value3, LocalDateTime value4, String value5, Integer value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FoldersRecord
     */
    public FoldersRecord() {
        super(Folders.FOLDERS);
    }

    /**
     * Create a detached, initialised FoldersRecord
     */
    public FoldersRecord(Integer id, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, String name, Integer parentId, Integer ownerId) {
        super(Folders.FOLDERS);

        setId(id);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
        setDeletedAt(deletedAt);
        setName(name);
        setParentId(parentId);
        setOwnerId(ownerId);
    }
}
