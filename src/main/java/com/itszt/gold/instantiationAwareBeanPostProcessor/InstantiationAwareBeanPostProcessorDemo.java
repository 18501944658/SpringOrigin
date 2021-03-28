package com.itszt.gold.instantiationAwareBeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 *      * 测试实现InstantiationAwareBeanPostProcessor接口
 *      * 实现该接口,覆写postProcessAfterInstantiation方法并返回fasle,可以阻止bean的依赖注入
 */
//@Component
public class InstantiationAwareBeanPostProcessorDemo implements InstantiationAwareBeanPostProcessor {
    /**
     * 阻止bean的依赖注入
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        return false;
    }
}
