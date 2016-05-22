package com.hyolee.blog.mapper;

import com.hyolee.blog.domain.User;

import java.util.List;

/**
 * Created by Administrator on 2016/5/22.
 */
public interface UserMapper {

    void save(User user);
    void update(User user);
    void delete(Integer id);
    User findUserById(Integer id);
    List<User> getAll();
}
