package com.forms.pu.config;

import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

import javax.sql.DataSource;

public class BlogDataSourceFactory  {


    public static DataSource getBlogDataSource() {
        return new UnpooledDataSourceFactory().getDataSource();
    }

}
