package com.ylisoftware.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * author:liyangli
 * date: 2017/11/30 上午6:38.
 */
public class PersonValidator implements Validator {

    public boolean supports(Class<?> aClass) {
        return Person.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"name","name.empty");
        Person p = (Person)o;
        if(p.getAge() < 0){
            errors.rejectValue("age","无效值");
        }else if(p.getAge() > 100){
            errors.rejectValue("age","年龄太大了");
        }
    }
}
