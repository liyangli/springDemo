package com.ylisoftware.beanWrapper;

import com.ylisoftware.beanWrapper.pop.ExoticTypeEditor;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

/**
 * author:liyangli
 * date: 2017/12/2 上午12:51.
 */
public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {

    /**
     * 注册用户端的编辑属性
     * @param propertyEditorRegistry
     */
    public void registerCustomEditors(PropertyEditorRegistry propertyEditorRegistry) {
        propertyEditorRegistry.registerCustomEditor(ExoticType.class,new ExoticTypeEditor());
    }
}
