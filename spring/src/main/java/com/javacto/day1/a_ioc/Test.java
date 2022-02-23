package com.javacto.day1.a_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * liu
 **/
public class Test {
    @org.junit.Test
    public void test(){
        //spring方法的写法
        //1.获取spring核心容器，只有在测试的时候需要写，实际开发中不需要写。
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //2.通过容器来获取对象
        UserService userServcieId = (UserService) applicationContext.getBean("userServcieId");
        //3.完成接口调用
        userServcieId.addUser();
    }
}
