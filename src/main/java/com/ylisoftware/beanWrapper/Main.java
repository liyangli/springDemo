package com.ylisoftware.beanWrapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author:liyangli
 * date: 2017/11/30 下午11:53.
 */
public class Main {

    private void beanWrapper(){
        BeanWrapper company = new BeanWrapperImpl(new Company());
        company.setPropertyValue("name","som company Inc.");

//        PropertyValue value = new PropertyValue("name","some company Inc");
//        company.setPropertyValue(value);

        BeanWrapper jim = new BeanWrapperImpl(new Employee());
        jim.setPropertyValue("name","Jim stravin");
        jim.setPropertyValue("salary",1.2f);
        company.setPropertyValue("employee",jim.getWrappedInstance());


        Float salary = (Float)company.getPropertyValue("employee.salary");
        System.out.println("slary-->"+salary);
    }

    /**
     * 属性对象进行editor进行处理
     */
    private void editorDemo(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-edit.xml");
        System.out.println(ac.getBean("dependsOnExoticType"));
    }

    private void configurer(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-registrar.xml");
        System.out.println(ac.getBean("dependsOnExoticType"));
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.configurer();

    }
}
