package com.javacto.day2.e_myAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * liu
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans2.xml");
        UserService userServiceImpl3 = (UserService) applicationContext.getBean("userServiceImpl3");
        userServiceImpl3.addUser();
    }
}
