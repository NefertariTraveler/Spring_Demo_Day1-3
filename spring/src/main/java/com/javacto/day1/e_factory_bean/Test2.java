package com.javacto.day1.e_factory_bean;

/**
 * liu
 **/
public class Test2 {
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getSingleton1();
        Singleton1 s2 = Singleton1.getSingleton1();
        Singleton1 s3 = Singleton1.getSingleton1();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
