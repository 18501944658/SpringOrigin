package com.itszt.gold.bean20201229;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class PropertyProBean implements BeanDefinitionRegistryPostProcessor, EnvironmentAware {
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }

    /***
     * 手动操作向environment对象中放入key-value值,可以通过@Value将值取出
     * @param environment
     */
    public void setEnvironment(Environment environment) {
       StandardEnvironment bean =(StandardEnvironment) environment;
        Properties properties= new Properties();
        properties.setProperty("gold.love","lijinjainlovexiang");
        PropertiesPropertySource propertiesPropertySource= new PropertiesPropertySource("propertoesmap",properties);
        MutablePropertySources propertySources =bean.getPropertySources();
        propertySources.addLast(propertiesPropertySource);
    }
}
