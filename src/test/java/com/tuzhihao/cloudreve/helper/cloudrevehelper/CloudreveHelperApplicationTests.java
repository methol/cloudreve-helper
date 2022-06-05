package com.tuzhihao.cloudreve.helper.cloudrevehelper;

import cn.hutool.core.lang.Pair;
import com.tuzhihao.cloudreve.helper.cloudrevehelper.service.FolderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CloudreveHelperApplicationTests {

    @Autowired
    FolderService folderService;

    @Test
    void contextLoads() {
    }

    @Test
    void listAllFolders() {
        folderService.findAll()
                .stream()
                .map(e -> Pair.of(e.getId(), e.getName()))
                .forEach(p -> System.out.println(p.getKey() + "\t" + p.getValue()));
    }

}
