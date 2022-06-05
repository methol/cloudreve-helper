/*
 * This file is generated by jOOQ.
 */
package com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables;


import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.DefaultSchema;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.Indexes;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.Keys;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.records.SettingsRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
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
public class Settings extends TableImpl<SettingsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>settings</code>
     */
    public static final Settings SETTINGS = new Settings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SettingsRecord> getRecordType() {
        return SettingsRecord.class;
    }

    /**
     * The column <code>settings.id</code>.
     */
    public final TableField<SettingsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>settings.created_at</code>.
     */
    public final TableField<SettingsRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>settings.updated_at</code>.
     */
    public final TableField<SettingsRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>settings.deleted_at</code>.
     */
    public final TableField<SettingsRecord, LocalDateTime> DELETED_AT = createField(DSL.name("deleted_at"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>settings.type</code>.
     */
    public final TableField<SettingsRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>settings.name</code>.
     */
    public final TableField<SettingsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>settings.value</code>.
     */
    public final TableField<SettingsRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.CLOB, this, "");

    private Settings(Name alias, Table<SettingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Settings(Name alias, Table<SettingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>settings</code> table reference
     */
    public Settings(String alias) {
        this(DSL.name(alias), SETTINGS);
    }

    /**
     * Create an aliased <code>settings</code> table reference
     */
    public Settings(Name alias) {
        this(alias, SETTINGS);
    }

    /**
     * Create a <code>settings</code> table reference
     */
    public Settings() {
        this(DSL.name("settings"), null);
    }

    public <O extends Record> Settings(Table<O> child, ForeignKey<O, SettingsRecord> key) {
        super(child, key, SETTINGS);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_SETTINGS_DELETED_AT, Indexes.SETTING_KEY);
    }

    @Override
    public Identity<SettingsRecord, Integer> getIdentity() {
        return (Identity<SettingsRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<SettingsRecord> getPrimaryKey() {
        return Keys.PK_SETTINGS;
    }

    @Override
    public List<UniqueKey<SettingsRecord>> getKeys() {
        return Arrays.<UniqueKey<SettingsRecord>>asList(Keys.PK_SETTINGS, Keys.SQLITE_AUTOINDEX_SETTINGS_1);
    }

    @Override
    public Settings as(String alias) {
        return new Settings(DSL.name(alias), this);
    }

    @Override
    public Settings as(Name alias) {
        return new Settings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Settings rename(String name) {
        return new Settings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Settings rename(Name name) {
        return new Settings(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, LocalDateTime, LocalDateTime, LocalDateTime, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}