package com.example.mongo.repository;

import com.example.mongo.document.SysUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<SysUser, String> {
    // 这里可以定义自定义查询方法，比如根据名称查找
    SysUser findByName(String name);
}
