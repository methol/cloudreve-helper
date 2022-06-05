package com.tuzhihao.cloudreve.helper.cloudrevehelper.service;

import com.tuzhihao.cloudreve.helper.cloudrevehelper.entity.FolderEntity;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.repository.tables.Folders;
import org.jetbrains.annotations.NotNull;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FolderService {

    @Resource
    private DSLContext dslContext;

    public @NotNull List<FolderEntity> findAll() {
        Result<Record> fetch = dslContext
                .select()
                .from(Folders.FOLDERS)
//                .where(Folders.FOLDERS.NAME.eq("1"))
                .fetch();
        return fetch.into(FolderEntity.class);
    }

}
