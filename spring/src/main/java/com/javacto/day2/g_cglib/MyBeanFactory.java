package com.javacto.day2.g_cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 静态工厂
 **/
public class MyBeanFactory {
    public  static UserService createUserService(){
        //1.目标类
        final UserService userService = new UserServiceImpl();
        //2.切面类
        final MyAspect myAspect = new MyAspect();
        // 3.代理类 ，采用cglib，底层创建目标类的子类
        //3.1 核心类
        Enhancer enhancer = new Enhancer();
        //3.2 确定父类
        enhancer.setSuperclass(userService.getClass());
        /* 3.3 设置回调函数 , MethodInterceptor接口 等效 jdk InvocationHandler接口
         * 	intercept() 等效 jdk  invoke()
         * 		参数1、参数2、参数3：以invoke一样
         * 		参数4：methodProxy 方法的代理
         */
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                //前
                myAspect.before();
                //执行目标类的方法
                Object invoke = method.invoke(userService, objects);
                // * 执行代理类的父类 ，执行目标类 （目标类和代理类 父子关系）
                methodProxy.invokeSuper(o,objects);
                //后
                myAspect.after();
                return invoke;
            }
        });
        //3.4 创建代理
        UserService userService1 = (UserService) enhancer.create();
        return userService1;
    }
}
