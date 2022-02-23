package com.javacto.day1.b_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * liu
 **/
public class Test {
    @org.junit.Test
    public void addUser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserAction userAction = (UserAction) applicationContext.getBean("userActionId");
        userAction.addUser();
    }
}
