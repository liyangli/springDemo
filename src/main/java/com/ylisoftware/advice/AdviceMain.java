package com.ylisoftware.advice;

import com.ylisoftware.aop.service.HelloService;
import com.ylisoftware.aop.service.impl.HelloServiceImpl;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * author:liyangli
 * date: 2017/11/28 上午6:38.
 */
public class AdviceMain {

    public static void main(String[] args) {
        HelloService hs = new HelloServiceImpl();
        BeforeAdvice ba = new HelloBeforeAdvice();
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(hs);
        pf.addAdvice(ba);

        //生成代理对象
        HelloService hsProxy = (HelloService)pf.getProxy();
        System.out.println(hsProxy.sayHello());
    }
}
