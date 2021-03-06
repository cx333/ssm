package com.mybatis.dao;

import com.mybatis.pojo.User;
import com.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName UserDaoTest
 * @Description TODO
 * @Author 2021/3/7 1:12
 * Version 1.0
 **/

public class UserDaoTest {

    @Test
    public static void main(String[] args) {


        //第一步获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //第二部执行sql
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUserList();
        //循环打印
        for (User user : users) {
            System.out.println(user);
        }
        //关闭sqlSession;
        sqlSession.close();
    }
}
