package com.javacto.day3.a_bzd;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 半自动
 * 切面类中确定通知，需要实现不同的接口，接口就是规范，从而确定方法名称
 * MethodInterceptor 采用的是环绕通知
 */
public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        //这里是可以再去调用其它类的中一些方法的
        System.out.println("执行前");
        //手需执行目标方法
        Object proceed = invocation.proceed();
        System.out.println("执行后");
        return proceed;
    }
}
