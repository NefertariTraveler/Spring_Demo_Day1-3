package com.javacto.day2.c_web_anno;

import org.springframework.stereotype.Repository;

/**
 * liu
 **/
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("dao层 di");
    }
}
