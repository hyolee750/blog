package com.hyolee.blog.service;

import com.hyolee.blog.domain.User;
import com.hyolee.blog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2016/5/22.
 */
@Service
@Transactional
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserById(Integer id){
        return userMapper.findUserById(id);
    }
}
