package com.javacto.day3.a_bzd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * liu
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans3.xml");
        //半自动，调用者，如果不需要使用AOP又要去修改一次代码
        UserService userService = (UserService) ac.getBean("proxyFactoryBean");
        userService.addUser();
        userService.deleteUser();
        userService.updateUser();
    }
}
