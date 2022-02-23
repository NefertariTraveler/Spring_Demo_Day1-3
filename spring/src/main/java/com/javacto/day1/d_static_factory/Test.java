package com.javacto.day1.d_static_factory;

import com.javacto.day1.b_di.UserAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * liu
 **/
public class Test {
    @org.junit.Test
    public void test(){
        //1.通过静态工厂得到对象
        UserService userService = StaticFactoryBean.createUserService();
        //2.调用对象
        userService.addUser();
    }

    @org.junit.Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) applicationContext.getBean("staticFactoryBean");
        userService.addUser();
    }
}
