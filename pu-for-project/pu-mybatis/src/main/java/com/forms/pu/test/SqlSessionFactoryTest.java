package com.forms.pu.test;

import com.forms.pu.config.BlogDataSourceFactory;
import com.forms.pu.dao.BlogMapper;
import com.forms.pu.domain.Blog;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryTest {

    public static void main(String[] args) {
        new SqlSessionFactoryTest().createLocalSqlSessionFactory();
        //new SqlSessionFactoryTest().createXmlSqlSessionFactory();
    }


    public void createXmlSqlSessionFactory(){
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession session = sqlSessionFactory.openSession()) {
            Blog blog = (Blog) session.selectOne("com.forms.pu.dao.BlogMapper.selectBlog", 1);
            System.out.println("blog = " + blog);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createLocalSqlSessionFactory() {
        DataSource dataSource = BlogDataSourceFactory.getBlogDataSource();
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMapper(BlogMapper.class);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        SqlSession session = sqlSessionFactory.openSession();
        Blog blog = session.getMapper(BlogMapper.class).selectBlog(1L);
        System.out.println("blog = " + blog);
    }

}
