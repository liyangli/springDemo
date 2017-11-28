package com.ylisoftware.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author:liyangli
 * date: 2017/11/28 上午6:48.
 */
public class IocMain {

    private ApplicationContext ac;

    public IocMain() {

        this.ac = new ClassPathXmlApplicationContext("spring-ioc.xml");
        /*PersonService ps = (PersonService) this.ac.getBean("personService");
        System.out.println(ps.findName("HI"));*/
        System.out.println(this.ac.getBean("person"));
    }


    private void constructorMethod(){
        System.out.println(ac.getBean("person"));
    }

    private void setMethod(){
        System.out.println(ac.getBean("person1"));
    }

    public static void main(String[] args) {
        //三种注入方式
        IocMain im = new IocMain();
        im.constructorMethod();
        im.setMethod();

    }
}
