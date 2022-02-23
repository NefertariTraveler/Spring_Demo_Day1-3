package com.javacto.day3.e_jdbc_api;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * liu
 **/
public class JdbcApi {
    public static void main(String[] args) {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/mysql007");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("123456");
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(basicDataSource);
        jdbcTemplate.update("INSERT INTO tuser (t_name,t_password,t_sex) VALUES ('万网1','4556','5')");
    }
}
