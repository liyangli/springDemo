package com.ylisoftware.beanWrapper;

/**
 * author:liyangli
 * date: 2017/12/1 上午12:41.
 */
public class DependsOnExoticType {
    private ExoticType exoticType;

    public void setExoticType(ExoticType exoticType) {
        this.exoticType = exoticType;
    }

    @Override
    public String toString() {
        return "DependsOnExoticType{" +
                "exoticType=" + exoticType +
                '}';
    }
}
