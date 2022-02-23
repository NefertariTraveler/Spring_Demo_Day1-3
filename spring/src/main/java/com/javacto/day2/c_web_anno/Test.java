package com.javacto.day2.c_web_anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.java2d.pipe.AlphaPaintPipe;

/**
 * liu
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans2.xml");
        UserAction userAction = (UserAction) applicationContext.getBean("userAction");
        userAction.addUser();
    }
}
