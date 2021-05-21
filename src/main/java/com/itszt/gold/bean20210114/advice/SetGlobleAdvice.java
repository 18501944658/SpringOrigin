package com.itszt.gold.bean20210114.advice;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;


@Component
public class SetGlobleAdvice implements BeanPostProcessor, PriorityOrdered {
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof AnnotationAwareAspectJAutoProxyCreator){
            AnnotationAwareAspectJAutoProxyCreator annotationAwareAspectJAutoProxyCreator= (AnnotationAwareAspectJAutoProxyCreator) bean;
            annotationAwareAspectJAutoProxyCreator.setInterceptorNames("girlAdvice");
        }
        return null;
    }

    public int getOrder() {
        return 45;
    }
}
