package com.itszt.gold.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/*
当关闭循环依赖后,AllowCircleAware这个Bean实例化后,因所有的Bean是for循环形式的遍历创建实例化,
 * BeanCustomize这个Bean实例化后才会将是否循环引用关闭,所以在AllowCircleAware实例化后的Bean的循环引用才会是false**/
//@Component
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
