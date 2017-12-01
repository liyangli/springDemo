package com.ylisoftware.beanWrapper.pop;

import com.ylisoftware.beanWrapper.ExoticType;

import java.beans.PropertyEditorSupport;

/**
 * author:liyangli
 * date: 2017/12/1 上午12:44.
 */
public class ExoticTypeEditor extends PropertyEditorSupport{


    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println("i am in ExoticTypeEditor method .......");
        ExoticType type = new ExoticType(text);
        setValue(type);
    }
}
