package com.itszt.gold.smartInstantiationAwareBeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/***
 * 循环依赖中,对依赖注入的bean进行修改
 */
//@Component
public class SmartInstantiationAwareBeanPostProcessorDemo implements SmartInstantiationAwareBeanPostProcessor {

    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
