package com.javacto.day2.f_jdk_Proxy;

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
        /**
         *  3.代理类 将目标类(切入点)  和切面类(通知类)  结合  --->切面
         * ClassLoader loader, 类加载器，动态代码运行时加载
         *  Class<?>[] interfaces,  代理类需要实现的所有接口
         * InvocationHandler h   处理类，必需实现  就是要new对象
         */
        UserService serviceProxy = (UserService) Proxy.newProxyInstance(
                MyBeanFactory.class.getClassLoader(),
                userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //Object proxy  代理对象
                        //method 执行方法名
                        //args 方法实际参数
                        //执行前
                        myAspect.before();
                        //执行目标方法  放行
                        Object invoke = method.invoke(userService, args);
                        //执行后
                        myAspect.after();
                        return invoke;
                    }
                }
        );
        //最终这里返回的是代理类
        return serviceProxy;
    }
}
