package com.ylisoftware.ioc;

/**
 * 注入对象测试
 * author:liyangli
 * date: 2017/11/28 上午6:50.
 */
public class PersonService {

    private Person person;

    public PersonService(Person person) {
        this.person = person;
    }

    public String findName(String name){
        System.out.println("Hello "+name);
        return name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
