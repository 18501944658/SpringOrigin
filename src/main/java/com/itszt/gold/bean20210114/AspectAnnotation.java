package com.itszt.gold.bean20210114;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class AspectAnnotation {

    @Pointcut(value = "execution(public * com.itszt.gold.bean20210114.interceptor.*.*(..))")
    public void pc1(){}

    @Before("pc1()")
    public void before1(){
        System.out.println("===================AspectAnnotation before======================");
    }

}
