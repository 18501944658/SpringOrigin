package com.itszt.gold.invokebeanfactorypostprocessors;

/**
 * 自定义注解,添加到BeanFactory中创建和的注册BeanDefinition对象
 */
@NewAnnodation
public class BeanDefinitionNewBean {
    private String name="hhaha";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
