package com.javacto.day1.e_factory_bean;

/**
 * describe  单例模式  面试的时候直接 手写在纸上  我这个对象只创建了一次
 * 饿汉式单例（立即加载）
 */
public class Singleton1 {
    //主动创建
    private static Singleton1 singleton1 = new Singleton1();
    //私有化
    private Singleton1(){

    }
    //以自己为实例返回值的静态方法，静态工厂
    public static Singleton1 getSingleton1() {
        return singleton1;
    }
}
