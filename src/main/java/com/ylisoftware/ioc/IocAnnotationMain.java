package com.ylisoftware.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author:liyangli
 * date: 2017/11/28 下午11:40.
 */
public class IocAnnotationMain {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-annotation-ioc.xml");
        City city = ac.getBean(City.class);
        System.out.println(city);
    }
}
