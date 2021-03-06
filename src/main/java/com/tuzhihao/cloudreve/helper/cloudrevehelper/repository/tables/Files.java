/*
 * This file is generated by jOOQ.
 */
package com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables;


import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.DefaultSchema;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.Indexes;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.Keys;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.records.FilesRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class Files extends TableImpl<FilesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>files</code>
     */
    public static final Files FILES = new Files();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilesRecord> getRecordType() {
        return FilesRecord.class;
    }

    /**
     * The column <code>files.id</code>.
     */
    public final TableField<FilesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>files.created_at</code>.
     */
    public final TableField<FilesRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>files.updated_at</code>.
     */
    public final TableField<FilesRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>files.deleted_at</code>.
     */
    public final TableField<FilesRecord, LocalDateTime> DELETED_AT = createField(DSL.name("deleted_at"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>files.name</code>.
     */
    public final TableField<FilesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>files.source_name</code>.
     */
    public final TableField<FilesRecord, String> SOURCE_NAME = createField(DSL.name("source_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>files.user_id</code>.
     */
    public final TableField<FilesRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>files.size</code>.
     */
    public final TableField<FilesRecord, Long> SIZE = createField(DSL.name("size"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>files.pic_info</code>.
     */
    public final TableField<FilesRecord, String> PIC_INFO = createField(DSL.name("pic_info"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>files.folder_id</code>.
     */
    public final TableField<FilesRecord, Integer> FOLDER_ID = createField(DSL.name("folder_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>files.policy_id</code>.
     */
    public final TableField<FilesRecord, Integer> POLICY_ID = createField(DSL.name("policy_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>files.upload_session_id</code>.
     */
    public final TableField<FilesRecord, String> UPLOAD_SESSION_ID = createField(DSL.name("upload_session_id"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>files.metadata</code>.
     */
    public final TableField<FilesRecord, String> METADATA = createField(DSL.name("metadata"), SQLDataType.CLOB, this, "");

    private Files(Name alias, Table<FilesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Files(Name alias, Table<FilesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>files</code> table reference
     */
    public Files(String alias) {
        this(DSL.name(alias), FILES);
    }

    /**
     * Create an aliased <code>files</code> table reference
     */
    public Files(Name alias) {
        this(alias, FILES);
    }

    /**
     * Create a <code>files</code> table reference
     */
    public Files() {
        this(DSL.name("files"), null);
    }

    public <O extends Record> Files(Table<O> child, ForeignKey<O, FilesRecord> key) {
        super(child, key, FILES);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FOLDER_ID, Indexes.IDX_FILES_DELETED_AT, Indexes.IDX_ONLY_ONE, Indexes.SESSION_ID, Indexes.SESSION_ONLY_ONE, Indexes.USER_ID);
    }

    @Override
    public Identity<FilesRecord, Integer> getIdentity() {
        return (Identity<FilesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<FilesRecord> getPrimaryKey() {
        return Keys.PK_FILES;
    }

    @Override
    public List<UniqueKey<FilesRecord>> getKeys() {
        return Arrays.<UniqueKey<FilesRecord>>asList(Keys.PK_FILES);
    }

    @Override
    public Files as(String alias) {
        return new Files(DSL.name(alias), this);
    }

    @Override
    public Files as(Name alias) {
        return new Files(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Files rename(String name) {
        return new Files(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Files rename(Name name) {
        return new Files(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Integer, LocalDateTime, LocalDateTime, LocalDateTime, String, String, Integer, Long, String, Integer, Integer, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
