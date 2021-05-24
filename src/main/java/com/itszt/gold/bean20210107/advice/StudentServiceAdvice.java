package com.itszt.gold.bean20210107.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * 创建切面
 */
@Component
public class StudentServiceAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("===================StudentServiceAdvice");
        return invocation.proceed();
    }
}
