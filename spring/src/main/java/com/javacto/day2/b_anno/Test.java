package com.javacto.day2.b_anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * liu
 **/
public class Test {
    @org.junit.Test
    public  void test(){
        //1.获取spring核心容器对象，只是测试的时候需使用，以后都不写
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans2.xml");
        //2.通过容器获取对象
        UserService userServcie =(UserService) applicationContext.getBean("userServiceImpl");
        userServcie.addUser();
    }
}
