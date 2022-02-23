package com.javacto.day3.c_aspectj_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * liu
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans4.xml");
        UserService userService = (UserService) ac.getBean("userService");
        userService.addUser();
        userService.deleteUser();
        userService.updateUser();
    }
}
