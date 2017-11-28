package com.ylisoftware.aop.service.impl;

import com.ylisoftware.aop.service.HelloService;

/**
 * author:liyangli
 * date: 2017/11/27 下午11:55.
 */
public class HelloServiceImpl implements HelloService{
    public String sayHello() {
        System.out.println("在调用hellServiceImpl method...");
        return "hello service method sayHello";
    }

    public String goWork() {
        return "i am go to work";
    }
}
