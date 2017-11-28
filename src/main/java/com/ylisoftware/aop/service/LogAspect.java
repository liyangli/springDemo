package com.ylisoftware.aop.service;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 日志切面
 * author:liyangli
 * date: 2017/11/28 上午12:06.
 */
public class LogAspect {

    /**
     * 任何通知方法通过JoniPoint进行传值
     * @param call
     */
    public void before(JoinPoint call){
        String className = call.getTarget().getClass().getName();
        String method = call.getSignature().getName();
        System.out.println("通知的类   className->"+className+";method->"+method);
    }

    public void afterReturn(){
        System.out.println("后置通知：方法正常结束了。。");
    }

    public void after(){
        System.out.println("最终通知，一定会执行");
    }

    public void afterThrowing(){
        System.out.println("异常抛出后通知");
    }

    /**
     * 代理的入口方法；
     * @param call
     * @return
     * @throws Throwable
     */
    public Object doAround(ProceedingJoinPoint call) throws Throwable{
        Object result = null;
        result = call.proceed();
        System.out.println("i am in doAround method.....");
        return result;
    }

}
