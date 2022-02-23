package com.javacto.day2.c_web_anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * liu
 **/
@Controller
public class UserAction {
    //控制层需要依赖 业务层
    @Resource
    private UserService userService;

    public void addUser(){
        //调用业务层方法
        userService.addUser();
    }
}
