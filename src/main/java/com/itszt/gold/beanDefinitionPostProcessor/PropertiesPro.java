package com.itszt.gold.beanDefinitionPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @Classname BeanPro
 * @Description TODO
 * @Author Jack
 * Date 2020/12/8 21:17
 * Version 1.0
 */
@Component
public class PropertiesPro implements BeanDefinitionRegistryPostProcessor, PriorityOrdered, Ordered, EnvironmentAware {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }

    @Override
    public int getOrder() {
        return 0;
    }

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("PropertiesPro.setEnvironment");
        StandardEnvironment bean = (StandardEnvironment)environment;
        Properties properties = new Properties();
        properties.put("enjoy.name","James");
        PropertiesPropertySource propertiesCustom = new PropertiesPropertySource("propertiesCustom", properties);
        MutablePropertySources propertySources = bean.getPropertySources();
        propertySources.addLast(propertiesCustom);
    }
}
