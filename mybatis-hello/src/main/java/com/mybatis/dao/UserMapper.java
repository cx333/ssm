package com.mybatis.dao;

import com.mybatis.pojo.User;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author 2021/3/7 0:37
 * Version 1.0
 **/

public interface UserMapper {
    List<User> getUserList();

}
