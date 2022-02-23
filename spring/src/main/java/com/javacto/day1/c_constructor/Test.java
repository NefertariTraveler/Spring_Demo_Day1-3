package com.javacto.day1.c_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * liu
 **/
public class Test {
    @org.junit.Test
    public void addUser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userServcieId = (UserService) applicationContext.getBean("userService");
        userServcieId.addUser();
    }
}
