package com.itszt.gold.bean20210107.advice;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AopUtils;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * MethodMatcher 是方法匹配
 */
@Component
public class StudentServicePointCut  implements  MethodMatcher, Pointcut {


    public boolean matches(Method method, Class<?> targetClass) {

        return false;
    }

    public boolean isRuntime() {
        return true;
    }

    public boolean matches(Method method, Class<?> targetClass, Object... args) {
        AopUtils.getMostSpecificMethod(method,targetClass);
        return false;
    }

    public ClassFilter getClassFilter() {
        return ClassFilter.TRUE;
    }

    public MethodMatcher getMethodMatcher() {
        return this;
    }
}
