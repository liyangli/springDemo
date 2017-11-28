package com.ylisoftware.dyProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * author:liyangli
 * date: 2017/11/28 上午6:21.
 */
public class HelloCglibProxy implements MethodInterceptor {


    private Enhancer enhancer = new Enhancer();
    public Object getProxy(Class clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    private void begin(){
        System.out.println("i am begin");
    }

    private void after(){
        System.out.println("i am after");
    }


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //begin
        begin();
        Object obj = methodProxy.invokeSuper(o,objects);
        after();
        return obj;
    }
}
