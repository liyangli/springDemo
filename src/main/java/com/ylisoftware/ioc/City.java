package com.ylisoftware.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * author:liyangli
 * date: 2017/11/28 下午11:39.
 */
@Component()
public class City {

    @Autowired(required = false)
    @Value("demo")
    private String name;
    @Autowired
    private Anminal anminal;

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", anminal=" + anminal +
                '}';
    }
}
