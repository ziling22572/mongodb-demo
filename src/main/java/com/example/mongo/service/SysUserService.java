package com.example.mongo.service;

import com.example.mongo.document.SysUser;
import com.example.mongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserService {


    @Autowired
    private UserRepository userRepository;

    public SysUser saveUser(SysUser user) {
        return userRepository.save(user); // 保存用户
    }

    public SysUser findUserByName(String name) {
        return userRepository.findByName(name); // 根据名称查询用户
    }

    public List<SysUser> getAllUsers() {
        return userRepository.findAll(); // 查询所有用户
    }
}
