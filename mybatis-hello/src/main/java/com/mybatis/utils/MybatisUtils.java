package com.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
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

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
        //把xml文件赋值给resource。
        String resource = "Mybatis-Config.xml";
        //通过输入流读取xml文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //通过SqlSessionFactoryBuilder构造出SqlSessionFactory实例
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    //有了sqlSessionFactory，现在可以从中获取sqlSession实例
    //sqlSession包含了面向数据库执行SQL命令所需要的方法。
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();

    }


}
