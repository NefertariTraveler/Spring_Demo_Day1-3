package com.javacto.day2.f_jdk_Proxy;

/**
 * liu
 **/
public class UserServiceImpl implements UserService{
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }

    @Override
    public void updateUser() {
        System.out.println("修改用户");
    }
}
