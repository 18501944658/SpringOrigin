package com.itszt.gold.beanDefinitionPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import java.io.IOException;
import java.util.Properties;
import java.util.UUID;

/**
 *
 *
 * 在application.properties中配置占位符,通过本地配置文件实例化Bean,在通过实现BeanDefinitionRegistryPostProcessor接口,
 * 将对应类注册到BeanDefinitionRegistry中,来实例化的Bean
 * Version 1.0
 */
@Component
public class PropertyPlaceHolderBeanDefinition implements BeanDefinitionRegistryPostProcessor {

    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        try {
            Properties properties = PropertiesLoaderUtils.loadAllProperties("application.properties", ClassUtils.getDefaultClassLoader());
            String property = properties.getProperty("enjoy.beanClass");
            String[] beanClasss = property.split(",");
            for (String classs : beanClasss) {
                BeanDefinition beanDefinition = new GenericBeanDefinition();
                beanDefinition.setBeanClassName(classs);
//                String beanName = BeanDefinitionReaderUtils.generateBeanName(beanDefinition,registry);
                registry.registerBeanDefinition(UUID.randomUUID().toString(),beanDefinition);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
