package com.itszt.gold.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.stereotype.Component;

/***
 * 关闭循环依赖
 */
@Component
public class AllowCircleAware implements BeanDefinitionRegistryPostProcessor {

    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        String[] beanDefinitionNames = registry.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
        }
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        DefaultListableBeanFactory beanFactory1 = (DefaultListableBeanFactory) beanFactory;
        beanFactory1.setAllowBeanDefinitionOverriding(true);
        /**不允许循环依赖**/
        beanFactory1.setAllowCircularReferences(false);
        beanFactory1.setAllowRawInjectionDespiteWrapping(true);

    }
}
