package com.javacto.day3.c_aspectj_xml;

/**
 * liu
 **/
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
