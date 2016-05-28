package com.hyolee.blog.controller;

import com.hyolee.blog.domain.User;
import com.hyolee.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.StringJoiner;

/**
 * Created by Administrator on 2016/5/22.
 * 用户控制类
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}")
    public User findUserById(@PathVariable("id") Integer id){
        return userService.findUserById(id);
    }
}
