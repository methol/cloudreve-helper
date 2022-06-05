/*
 * This file is generated by jOOQ.
 */
package com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables;


import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.DefaultSchema;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.Indexes;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.Keys;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.records.FoldersRecord;

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
public class Folders extends TableImpl<FoldersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>folders</code>
     */
    public static final Folders FOLDERS = new Folders();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FoldersRecord> getRecordType() {
        return FoldersRecord.class;
    }

    /**
     * The column <code>folders.id</code>.
     */
    public final TableField<FoldersRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>folders.created_at</code>.
     */
    public final TableField<FoldersRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>folders.updated_at</code>.
     */
    public final TableField<FoldersRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>folders.deleted_at</code>.
     */
    public final TableField<FoldersRecord, LocalDateTime> DELETED_AT = createField(DSL.name("deleted_at"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>folders.name</code>.
     */
    public final TableField<FoldersRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>folders.parent_id</code>.
     */
    public final TableField<FoldersRecord, Integer> PARENT_ID = createField(DSL.name("parent_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>folders.owner_id</code>.
     */
    public final TableField<FoldersRecord, Integer> OWNER_ID = createField(DSL.name("owner_id"), SQLDataType.INTEGER, this, "");

    private Folders(Name alias, Table<FoldersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Folders(Name alias, Table<FoldersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>folders</code> table reference
     */
    public Folders(String alias) {
        this(DSL.name(alias), FOLDERS);
    }

    /**
     * Create an aliased <code>folders</code> table reference
     */
    public Folders(Name alias) {
        this(alias, FOLDERS);
    }

    /**
     * Create a <code>folders</code> table reference
     */
    public Folders() {
        this(DSL.name("folders"), null);
    }

    public <O extends Record> Folders(Table<O> child, ForeignKey<O, FoldersRecord> key) {
        super(child, key, FOLDERS);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_FOLDERS_DELETED_AT, Indexes.IDX_ONLY_ONE_NAME, Indexes.OWNER_ID, Indexes.PARENT_ID);
    }

    @Override
    public Identity<FoldersRecord, Integer> getIdentity() {
        return (Identity<FoldersRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<FoldersRecord> getPrimaryKey() {
        return Keys.PK_FOLDERS;
    }

    @Override
    public List<UniqueKey<FoldersRecord>> getKeys() {
        return Arrays.<UniqueKey<FoldersRecord>>asList(Keys.PK_FOLDERS);
    }

    @Override
    public Folders as(String alias) {
        return new Folders(DSL.name(alias), this);
    }

    @Override
    public Folders as(Name alias) {
        return new Folders(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Folders rename(String name) {
        return new Folders(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Folders rename(Name name) {
        return new Folders(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, LocalDateTime, LocalDateTime, LocalDateTime, String, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}