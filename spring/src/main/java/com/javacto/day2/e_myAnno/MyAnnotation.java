package com.javacto.day2.e_myAnno;

import java.lang.annotation.*;

/**
 * describe 自定义注解
 * @Target  表示这个注解 需要用在 类/还是接口，还是方法，还是属性中
 * ElementType.TYPE 作用域，只能在类上使用
 * ElementType.FIELD 可以使用在属性上
 * ElementType.METHOD 作用到方法上
 *@Retention(RetentionPolicy.SOURCE)  注解只保留在源文件，当java文件编译成class的时候，注解被遗弃
 * RetentionPolicy.CLASS 注解保留到class 但jvm加载class的时候就会被遗弃
 * RetentionPolicy.RUNTIME 注解不仅被保留到class，jvm加载class文件之后，仍然存在
 *
 * Documented 本注解会 生成相关文档
 */
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface MyAnnotation {
    //这就是一个方法
    String value() default "";
}
