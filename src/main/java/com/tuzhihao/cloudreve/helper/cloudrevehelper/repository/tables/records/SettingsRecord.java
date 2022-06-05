/*
 * This file is generated by jOOQ.
 */
package com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.records;


import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.Settings;

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
public class SettingsRecord extends UpdatableRecordImpl<SettingsRecord> implements Record7<Integer, LocalDateTime, LocalDateTime, LocalDateTime, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>settings.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>settings.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>settings.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>settings.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>settings.updated_at</code>.
     */
    public void setUpdatedAt(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>settings.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>settings.deleted_at</code>.
     */
    public void setDeletedAt(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>settings.deleted_at</code>.
     */
    public LocalDateTime getDeletedAt() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>settings.type</code>.
     */
    public void setType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>settings.type</code>.
     */
    public String getType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>settings.name</code>.
     */
    public void setName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>settings.name</code>.
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>settings.value</code>.
     */
    public void setValue(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>settings.value</code>.
     */
    public String getValue() {
        return (String) get(6);
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
    public Row7<Integer, LocalDateTime, LocalDateTime, LocalDateTime, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, LocalDateTime, LocalDateTime, LocalDateTime, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Settings.SETTINGS.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return Settings.SETTINGS.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Settings.SETTINGS.UPDATED_AT;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Settings.SETTINGS.DELETED_AT;
    }

    @Override
    public Field<String> field5() {
        return Settings.SETTINGS.TYPE;
    }

    @Override
    public Field<String> field6() {
        return Settings.SETTINGS.NAME;
    }

    @Override
    public Field<String> field7() {
        return Settings.SETTINGS.VALUE;
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
        return getType();
    }

    @Override
    public String component6() {
        return getName();
    }

    @Override
    public String component7() {
        return getValue();
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
        return getType();
    }

    @Override
    public String value6() {
        return getName();
    }

    @Override
    public String value7() {
        return getValue();
    }

    @Override
    public SettingsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public SettingsRecord value2(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public SettingsRecord value3(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public SettingsRecord value4(LocalDateTime value) {
        setDeletedAt(value);
        return this;
    }

    @Override
    public SettingsRecord value5(String value) {
        setType(value);
        return this;
    }

    @Override
    public SettingsRecord value6(String value) {
        setName(value);
        return this;
    }

    @Override
    public SettingsRecord value7(String value) {
        setValue(value);
        return this;
    }

    @Override
    public SettingsRecord values(Integer value1, LocalDateTime value2, LocalDateTime value3, LocalDateTime value4, String value5, String value6, String value7) {
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
     * Create a detached SettingsRecord
     */
    public SettingsRecord() {
        super(Settings.SETTINGS);
    }

    /**
     * Create a detached, initialised SettingsRecord
     */
    public SettingsRecord(Integer id, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, String type, String name, String value) {
        super(Settings.SETTINGS);

        setId(id);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
        setDeletedAt(deletedAt);
        setType(type);
        setName(name);
        setValue(value);
    }
}
