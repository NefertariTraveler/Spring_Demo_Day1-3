package com.javacto.day2.d_my_anno;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**
 * liu
 **/
@MyAnnotation()
@Controller
@Component
@Repository
public class Test {
    //属性
    @MyAnnotation
    private  String   name;

    //方法
    @MyAnnotation
    public  void addUser(){

    }
}
