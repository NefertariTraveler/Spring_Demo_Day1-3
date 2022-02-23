package com.javacto.day2.d_my_anno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * liu
 **/
@JdbcConfig(url = "jdbc:mysql://localhost:3306/phone",userName = "root",pwd = "123456")
public class DbUtil {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection connection;
        JdbcConfig jdbcConfig = DbUtil.class.getAnnotation(JdbcConfig.class);
        String url = jdbcConfig.url();
        String userName = jdbcConfig.userName();
        String pwd = jdbcConfig.pwd();
        connection = DriverManager.getConnection(url,userName,pwd);
        return connection;
    }

    public static void main(String[] args) throws SQLException {
        System.out.println(DbUtil.getConnection());
    }
}
