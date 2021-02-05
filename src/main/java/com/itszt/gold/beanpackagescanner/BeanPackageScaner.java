package com.itszt.gold.beanpackagescanner;

import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

import java.util.Set;

/**
 * 自定义扫描器
 */
public class BeanPackageScaner extends ClassPathBeanDefinitionScanner {


    public BeanPackageScaner(BeanDefinitionRegistry registry) {
        /**不使用默认的注解过滤**/
        super(registry, false);
    }

    /****
     * 直接调用父类的doScan方法进行扫描创建注册BeanDefinition对象在BeanFactory中
     * @param basePackages
     * @return
     */
    @Override
    protected Set<BeanDefinitionHolder> doScan(String... basePackages) {
        Set<BeanDefinitionHolder> beanDefinitionHolders = super.doScan(basePackages);
        return beanDefinitionHolders;
    }
}
