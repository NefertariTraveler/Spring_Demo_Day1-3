package com.javacto.day1.d_static_factory;

/**
 * liu
 **/
public class StaticFactoryBean {
    // 静态工厂  工厂是做什么的 ？ 不就是生产吗，我可以生产bean吗?
    public static UserService createUserService(){
        UserService userService = new UserServiceImpl();
        return userService;
    }
}
