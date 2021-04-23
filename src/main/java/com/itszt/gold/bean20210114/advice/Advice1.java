package com.itszt.gold.bean20210114.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component
public class Advice1 implements MethodInterceptor {


    public Object invoke(MethodInvocation invocation) throws Throwable {
        return null;
    }
}
