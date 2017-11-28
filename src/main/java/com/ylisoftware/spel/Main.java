package com.ylisoftware.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author:liyangli
 * date: 2017/11/29 上午12:24.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-el.xml");
        System.out.println(ac.getBean("student"));

    }
}
