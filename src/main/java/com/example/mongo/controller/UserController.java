package com.example.mongo.controller;

import com.example.mongo.document.SysUser;
import com.example.mongo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lingjinli
 * @date 2024年11月12日 14:38
 * @desc 功能点
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private SysUserService userService;

    @PostMapping("/submit")
    public SysUser createUser(@RequestBody SysUser user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{name}")
    public SysUser getUserByName(@PathVariable String name) {
        return userService.findUserByName(name);
    }

    @GetMapping("/all")
    public List<SysUser> getAllUsers() {
        return userService.getAllUsers();
    }
}
