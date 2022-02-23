package com.javacto.day2.g_cglib;

/**
 * liu
 **/
public class Test {
    public static void main(String[] args) {
        UserService userService = MyBeanFactory.createUserService();
        userService.addUser();
        userService.deleteUser();
        userService.updateUser();
    }
}
