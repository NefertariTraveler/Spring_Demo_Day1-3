package com.javacto.day3.d_aspectj_anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 切面类，有多个通知  5个通知
 */
@Component
@Aspect
public class MyAspect {
    @Pointcut("execution(* com.javacto.day3.d_aspectj_anno.*.*(..))")
    public void pointcut(){}

    /**
     * 前置通知
     */
    @Before(value = "pointcut()")
    public void before(JoinPoint joinPoint){
        //这里面是可以有业务代码的，可以new其它类的对象，调用方法等等
        //joinPoint.getSignature().getName() 得到我所执行的方法名
        System.out.println("前置通知"+joinPoint.getSignature().getName());
    }
    /**
     * 后置通知
     */
    @AfterReturning(value = "pointcut()",returning = "obj")
    public void afterReturning (JoinPoint joinPoint,Object obj){
        //通常后置通需，需要拿到返回的结果再进行下面的操作
        System.out.println("后置通知 返回的值为" + obj);
    }
    /**
     * 环绕通知
     */
    @Around(value = "pointcut()")
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
    @AfterThrowing(value = "pointcut()",throwing = "throwable")
    public void afterThrowing(JoinPoint joinPoint,Throwable throwable){
        System.out.println("抛出异常通知" + throwable.getMessage());
    }
    /**
     * 最终通知
     */
    @After(value = "pointcut()")
    public void after(JoinPoint joinPoint){
        System.out.println("最终通知");
    }
}
