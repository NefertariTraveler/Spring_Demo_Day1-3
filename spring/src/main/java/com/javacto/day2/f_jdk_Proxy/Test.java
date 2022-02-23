package com.javacto.day2.f_jdk_Proxy;

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
