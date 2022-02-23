package com.javacto.day3.d_aspectj_anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * liu
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans5.xml");
        UserService userService = (UserService) ac.getBean("userServiceImpl");
        userService.addUser();
        userService.deleteUser();
        userService.updateUser();
    }
}
