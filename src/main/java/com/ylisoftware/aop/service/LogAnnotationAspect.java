package com.ylisoftware.aop.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 注解方式
 * author:liyangli
 * date: 2017/11/28 上午12:33.
 */
@Aspect
public class LogAnnotationAspect {

    @Pointcut("execution(* com.ylisoftware.aop.service.*.*(..))")
    private void allMethod(){

    }


    @Before("execution(* com.ylisoftware.aop.service.*.*(..))")
    public void before(JoinPoint call){
        String className = call.getTarget().getClass().getName();
        String method = call.getSignature().getName();
        System.out.println("通知的类   className->"+className+";method->"+method);
    }

    @AfterReturning("allMethod()")
    public void afterReturn(){
        System.out.println("后置通知：方法正常结束了。。");
    }
    @After("allMethod()")
    public void after(){
        System.out.println("最终通知，一定会执行");
    }

    @AfterThrowing("allMethod()")
    public void afterThrowing(){
        System.out.println("异常抛出后通知");
    }

    @Around("allMethod()")
    public Object doAround(ProceedingJoinPoint call) throws Throwable{
        Object result = null;
        result = call.proceed();
        System.out.println("i am in doAround method.....");
        return result;
    }
}
