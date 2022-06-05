/*
 * This file is generated by jOOQ.
 */
package com.tuzhihao.cloudreve.helper.cloudrevehelper.repository;


import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.Downloads;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.Files;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.Folders;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.Groups;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.Nodes;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.Policies;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.Settings;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.Shares;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.SqliteSequence;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.Tags;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.Tasks;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.Users;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.Webdavs;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DEFAULT_SCHEMA</code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>downloads</code>.
     */
    public final Downloads DOWNLOADS = Downloads.DOWNLOADS;

    /**
     * The table <code>files</code>.
     */
    public final Files FILES = Files.FILES;

    /**
     * The table <code>folders</code>.
     */
    public final Folders FOLDERS = Folders.FOLDERS;

    /**
     * The table <code>groups</code>.
     */
    public final Groups GROUPS = Groups.GROUPS;

    /**
     * The table <code>nodes</code>.
     */
    public final Nodes NODES = Nodes.NODES;

    /**
     * The table <code>policies</code>.
     */
    public final Policies POLICIES = Policies.POLICIES;

    /**
     * The table <code>settings</code>.
     */
    public final Settings SETTINGS = Settings.SETTINGS;

    /**
     * The table <code>shares</code>.
     */
    public final Shares SHARES = Shares.SHARES;

    /**
     * The table <code>sqlite_sequence</code>.
     */
    public final SqliteSequence SQLITE_SEQUENCE = SqliteSequence.SQLITE_SEQUENCE;

    /**
     * The table <code>tags</code>.
     */
    public final Tags TAGS = Tags.TAGS;

    /**
     * The table <code>tasks</code>.
     */
    public final Tasks TASKS = Tasks.TASKS;

    /**
     * The table <code>users</code>.
     */
    public final Users USERS = Users.USERS;

    /**
     * The table <code>webdavs</code>.
     */
    public final Webdavs WEBDAVS = Webdavs.WEBDAVS;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Downloads.DOWNLOADS,
            Files.FILES,
            Folders.FOLDERS,
            Groups.GROUPS,
            Nodes.NODES,
            Policies.POLICIES,
            Settings.SETTINGS,
            Shares.SHARES,
            SqliteSequence.SQLITE_SEQUENCE,
            Tags.TAGS,
            Tasks.TASKS,
            Users.USERS,
            Webdavs.WEBDAVS);
    }
}
