package com.tuzhihao.cloudreve.helper.cloudrevehelper.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/*

CREATE TABLE "files" (
	"id" integer PRIMARY KEY autoincrement,
	"created_at" datetime,
	"updated_at" datetime,
	"deleted_at" datetime,
	"name" varchar(255),
	"source_name" text,
	"user_id" integer,
	"size" bigint,
	"pic_info" varchar(255),
	"folder_id" integer,
	"policy_id" integer,
	"upload_session_id" varchar(255),
	"metadata" text
);

 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Table(name = "files")
@Entity
public class FileEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "source_name")
    private String sourceName;

    @Column(name = "user_id", nullable = false)
    private int userId;

    @Column(name = "size", nullable = false)
    private long size;

    @Column(name = "pic_info")
    private String picInfo;

    @Column(name = "folder_id", nullable = false)
    private int folderId;

    @Column(name = "policy_id", nullable = false)
    private int policyId;

    @Column(name = "upload_session_id")
    private String uploadSessionId;

    @Column(name = "metadata")
    private String metadata;

}
