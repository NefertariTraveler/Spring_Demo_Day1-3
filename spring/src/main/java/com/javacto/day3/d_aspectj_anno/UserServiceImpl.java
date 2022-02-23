package com.javacto.day3.d_aspectj_anno;

import org.springframework.stereotype.Service;

/**
 * liu
 **/
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public String deleteUser() {
        System.out.println("删除用户");
        return "我返回的值";
    }

    @Override
    public void updateUser() {
        System.out.println("修改用户");
    }
}
