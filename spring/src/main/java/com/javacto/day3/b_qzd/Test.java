package com.javacto.day3.b_qzd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * liu
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans3.xml");
        UserService userService = (UserService) ac.getBean("userService");
        userService.addUser();
        userService.deleteUser();
        userService.updateUser();
    }
}
