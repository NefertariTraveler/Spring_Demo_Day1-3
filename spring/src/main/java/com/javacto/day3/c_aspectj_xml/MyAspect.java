package com.javacto.day3.c_aspectj_xml;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类，有多个通知  5个通知
 */
public class MyAspect {
    /**
     * 前置通知
     */
    public void before(JoinPoint joinPoint){
        //这里面是可以有业务代码的，可以new其它类的对象，调用方法等等
        //joinPoint.getSignature().getName() 得到我所执行的方法名
        System.out.println("前置通知"+joinPoint.getSignature().getName());
    }
    /**
     * 后置通知
     */
    public void afterReturning (JoinPoint joinPoint,Object obj){
        //通常后置通需，需要拿到返回的结果再进行下面的操作
        System.out.println("后置通知 返回的值为" + obj);
    }
    /**
     * 环绕通知
     */
    public Object around(ProceedingJoinPoint joinPoint){
        System.out.println("执行前 ");
        Object obj = null;
        try {
            //也可以抛出
            //执行目标方法
            obj = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("执行后");
        return obj;
    }
    /**
     * 异常通知
     */
    public void afterThrowing(JoinPoint joinPoint,Throwable throwable){
        System.out.println("抛出异常通知" + throwable.getMessage());
    }
    /**
     * 最终通知
     */
    public void after(JoinPoint joinPoint){
        System.out.println("最终通知");
    }
}
