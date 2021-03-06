package com.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName MybatisUtils
 * @Description TODO
 * @Author 2021/3/6 23:58
 * Version 1.0
 **/

//第一步获取SqlSessionFactory对象

public class MybatisUtils {

    static {
        try {
        //把xml文件赋值给resource。
        String resource = "Mybatis-Config.xml";
        //通过输入流读取xml文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //通过SqlSessionFactoryBuilder构造出SqlSessionFactory实例
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
