package com.example.mongo.document;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author lingjinli
 * @date 2024年11月12日 14:16
 * @desc 功能点 集合
 */
@Data
@Document(collection = "sys_user")
public class SysUser {
    @Id  // 将此字段映射为 MongoDB 文档的 "_id"
    private String id;
    @Field("tenant_id")  // 指定 MongoDB 字段名为 tenant_id
    private String tenantId;
    @Field("pwd_expired_flag")
    private String pwdExpiredFlag;
    @Field("user_id")
    private Long userId;
    @Field("name")
    private String name;
    @Field("exp")
    private Long exp;
    @Field("create_jwt_time")
    private Long createJwtTime;
    @Field("access_token_delay")
    private Integer accessTokenDelay;
    @Field("jti")
    private String jti;
    @Field("client_id")
    private String clientId;
    @Field("scope")
    private String[] scope;
}
