package com.ylisoftware.aop;

import com.ylisoftware.aop.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Aop控制类
 * author:liyangli
 * date: 2017/11/27 下午11:57.
 */
public class AopCtr {

    AopCtr(){
        //加载对应spring配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-aop.xml");
        HelloService hs = (HelloService) ac.getBean("helloService");
        String hello = hs.sayHello();
        System.out.println("hello->"+hello);
        String goWork = hs.goWork();
        System.out.println("goWork->"+goWork);
    }



    public static void main(String[] args) {
        AopCtr ac = new AopCtr();
    }
}
