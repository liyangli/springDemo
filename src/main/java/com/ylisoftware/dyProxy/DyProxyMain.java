package com.ylisoftware.dyProxy;

import com.ylisoftware.aop.service.HelloService;
import com.ylisoftware.aop.service.impl.HelloServiceImpl;

import java.lang.reflect.Proxy;


/**
 * 动态代理验证对象
 * author:liyangli
 * date: 2017/11/28 上午5:58.
 */
public class DyProxyMain {

    public void refDemo(){
        HelloService hs = new HelloServiceImpl();
        HelloProxy handler = new HelloProxy(hs);
        HelloService helloService = (HelloService) Proxy.newProxyInstance(hs.getClass().getClassLoader(),
                hs.getClass().getInterfaces(),handler);
        helloService.sayHello();
    }

    public void cglibDemo(){
        HelloCglibProxy cglibProxy = new HelloCglibProxy();
        HelloService hs = (HelloService) cglibProxy.getProxy(HelloServiceImpl.class);
        hs.sayHello();
    }

    public static void main(String[] args) {
        DyProxyMain dpm = new DyProxyMain();
//        dpm.refDemo();
        dpm.cglibDemo();
    }
}
