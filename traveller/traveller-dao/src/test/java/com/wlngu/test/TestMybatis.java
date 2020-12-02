package com.wlngu.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatis {
    public static void main(String[] args) throws IOException {
        InputStream in = Resources.getResourceAsStream("");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
    }
}
