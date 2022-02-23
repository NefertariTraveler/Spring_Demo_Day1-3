package com.javacto.day2.a_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * liu
 **/
public class Test {
    public static void main(String[] args) {
        //1.获取spring核心容器对象，只是测试的时候需使用，以后都不写
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        User user =(User) ac.getBean("user");
        System.out.println(user);
    }
}
