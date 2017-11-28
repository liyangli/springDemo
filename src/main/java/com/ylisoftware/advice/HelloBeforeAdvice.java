package com.ylisoftware.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * author:liyangli
 * date: 2017/11/28 上午6:37.
 */
public class HelloBeforeAdvice implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {
//        String client = (String)objects[0];
        System.out.println(method);
        System.out.println(objects);
        System.out.println(o);
        System.out.println("How are you !"+".");

    }
}
