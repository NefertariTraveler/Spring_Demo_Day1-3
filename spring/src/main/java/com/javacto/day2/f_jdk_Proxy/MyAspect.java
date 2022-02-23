package com.javacto.day2.f_jdk_Proxy;

/**
 * 切面类，需要把什么方法切进去
 **/
public class MyAspect {
    public void before(){
        System.out.println("执行前");
    }
    public void after(){
        System.out.println("执行后");
    }
}
