package com.itszt.gold.bean20210107.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CustomAdvice  implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("=====================CustomAdvice======================");
        return invocation.proceed();
    }
}
