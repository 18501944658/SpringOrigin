package com.itszt.gold.bean20210110;

import com.itszt.config.BeansScaner;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

import java.util.Set;

/***
 * 覆写ClassPathBeanDefinitionScanner类的doScan方法
 * 用于扫描的需要实例化注册的bean
 * 默认扫描的注解的@Component
 */

public class SelfBeanScan extends ClassPathBeanDefinitionScanner {
    public SelfBeanScan(BeanDefinitionRegistry registry) {
        super(registry);
    }

    @Override
    protected Set<BeanDefinitionHolder> doScan(String... basePackages) {
        Set<BeanDefinitionHolder> beanDefinitionHolders = super.doScan(basePackages);
        return beanDefinitionHolders;
    }
}
