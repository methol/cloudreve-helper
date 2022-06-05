package com.tuzhihao.cloudreve.helper.cloudrevehelper.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/*
create table folders
(
    id         integer
        primary key autoincrement,
    created_at datetime,
    updated_at datetime,
    deleted_at datetime,
    name       varchar(255),
    parent_id  integer,
    owner_id   integer
);

 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Table(name = "folders")
@Entity
public class FolderEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "owner_id", nullable = false)
    private long ownerId;

}
