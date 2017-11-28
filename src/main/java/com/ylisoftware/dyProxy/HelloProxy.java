package com.ylisoftware.dyProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * author:liyangli
 * date: 2017/11/28 上午5:55.
 */
public class HelloProxy implements InvocationHandler {

    private Object target;

    public HelloProxy(Object target) {
        this.target = target;
    }

    private void before(){
        System.out.println("method before");
    }

    private void after(){
        System.out.println("method after");
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行before
        //执行after
        before();
        System.out.println("method->"+method);
        Object result = method.invoke(this.target,args);
        after();
        return result;
    }
}
