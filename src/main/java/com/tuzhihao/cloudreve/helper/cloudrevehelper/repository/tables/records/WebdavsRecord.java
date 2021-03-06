/*
 * This file is generated by jOOQ.
 */
package com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.records;


import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.Webdavs;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WebdavsRecord extends UpdatableRecordImpl<WebdavsRecord> implements Record8<Integer, LocalDateTime, LocalDateTime, LocalDateTime, String, String, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>webdavs.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>webdavs.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>webdavs.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>webdavs.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>webdavs.updated_at</code>.
     */
    public void setUpdatedAt(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>webdavs.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>webdavs.deleted_at</code>.
     */
    public void setDeletedAt(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>webdavs.deleted_at</code>.
     */
    public LocalDateTime getDeletedAt() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>webdavs.name</code>.
     */
    public void setName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>webdavs.name</code>.
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>webdavs.password</code>.
     */
    public void setPassword(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>webdavs.password</code>.
     */
    public String getPassword() {
        return (String) get(5);
    }

    /**
     * Setter for <code>webdavs.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>webdavs.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>webdavs.root</code>.
     */
    public void setRoot(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>webdavs.root</code>.
     */
    public String getRoot() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, LocalDateTime, LocalDateTime, LocalDateTime, String, String, Integer, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, LocalDateTime, LocalDateTime, LocalDateTime, String, String, Integer, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Webdavs.WEBDAVS.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return Webdavs.WEBDAVS.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Webdavs.WEBDAVS.UPDATED_AT;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Webdavs.WEBDAVS.DELETED_AT;
    }

    @Override
    public Field<String> field5() {
        return Webdavs.WEBDAVS.NAME;
    }

    @Override
    public Field<String> field6() {
        return Webdavs.WEBDAVS.PASSWORD;
    }

    @Override
    public Field<Integer> field7() {
        return Webdavs.WEBDAVS.USER_ID;
    }

    @Override
    public Field<String> field8() {
        return Webdavs.WEBDAVS.ROOT;
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
    public String component6() {
        return getPassword();
    }

    @Override
    public Integer component7() {
        return getUserId();
    }

    @Override
    public String component8() {
        return getRoot();
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
    public String value6() {
        return getPassword();
    }

    @Override
    public Integer value7() {
        return getUserId();
    }

    @Override
    public String value8() {
        return getRoot();
    }

    @Override
    public WebdavsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public WebdavsRecord value2(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public WebdavsRecord value3(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public WebdavsRecord value4(LocalDateTime value) {
        setDeletedAt(value);
        return this;
    }

    @Override
    public WebdavsRecord value5(String value) {
        setName(value);
        return this;
    }

    @Override
    public WebdavsRecord value6(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public WebdavsRecord value7(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public WebdavsRecord value8(String value) {
        setRoot(value);
        return this;
    }

    @Override
    public WebdavsRecord values(Integer value1, LocalDateTime value2, LocalDateTime value3, LocalDateTime value4, String value5, String value6, Integer value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WebdavsRecord
     */
    public WebdavsRecord() {
        super(Webdavs.WEBDAVS);
    }

    /**
     * Create a detached, initialised WebdavsRecord
     */
    public WebdavsRecord(Integer id, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, String name, String password, Integer userId, String root) {
        super(Webdavs.WEBDAVS);

        setId(id);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
        setDeletedAt(deletedAt);
        setName(name);
        setPassword(password);
        setUserId(userId);
        setRoot(root);
    }
}
