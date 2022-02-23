package com.javacto.day1.e_factory_bean;

/**
 * describe
 * 懒汉单例 （延迟加载）
 */
public class Singleton2 {
    private static Singleton2 singleton2;
    private Singleton2(){

    }
    public static Singleton2 getSingleton2(){
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
