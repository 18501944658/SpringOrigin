package com.itszt.gold.bean20210117;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotationAspectJ {



    //    @Pointcut(value = "execution(public  * com.itszt.gold.bean20210117.*.*(..))")
    @Pointcut("this(com.itszt.gold.bean20210117.StudentServiceImpl)")
    public void pc1() {
    }


    @Before("pc1()")
    public void Abefore13() {
//        MethodInvocation methodInvocation = ExposeInvocationInterceptor.currentInvocation();
//        Method method = methodInvocation.getMethod();
        System.out.println("=======================AspectAnnotation Abefore13=========================================");
    }

    @Before("pc1()")
    public void before13() {
        System.out.println("========================spectAnnotation before13============================");
    }


    @Before("pc1()")
    public void before32() {
        System.out.println("========================spectAnnotation before32============================");
    }

    @Before("pc1()")
    public void before132() {
        System.out.println("==============AspectAnnotation before132=========");

    }

    @Before("pc1()")
    public void before12121() {
        System.out.println("==============AspectAnnotation before12121=========");

    }

    @Around(value = "pc1()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("==============AspectAnnotation around前置通知=========");
        Object result = joinPoint.proceed();
        System.out.println("==============AspectAnnotation around后置通知=========");

        return result;
    }


}
