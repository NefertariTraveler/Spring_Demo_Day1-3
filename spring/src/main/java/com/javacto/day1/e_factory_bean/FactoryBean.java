package com.javacto.day1.e_factory_bean;

/**
 * liu
 **/
public class FactoryBean {
    // 实例工厂  工厂是做什么的 ？ 不就是生产吗，我可以生产bean吗?  方法不是静态的
    public UserService createUserService(){
        UserService userService = new UserServiceImpl();
        return userService;
    }
}
