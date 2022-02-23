package com.javacto.day1.e_factory_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * liu
 **/
public class Test {
    @org.junit.Test
    public void test(){
        //1.实例工程必需先选择  工程对象
        FactoryBean factoryBean = new FactoryBean();
        //2.通过工厂拿到对象
        UserService userService = factoryBean.createUserService();
        userService.addUser();
    }

    @org.junit.Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) applicationContext.getBean("userServcieId_factory");
        userService.addUser();
    }
}
