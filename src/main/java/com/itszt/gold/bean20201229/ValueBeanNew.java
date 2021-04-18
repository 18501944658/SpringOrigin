package com.itszt.gold.bean20201229;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 自己设置Environment中key-value值
 * 获取并输出
 */
@Component
public class ValueBeanNew implements EnvironmentAware {


    @Value("${gold.love}")
    private String name;


    public void setEnvironment(Environment environment) {
        System.out.println("name = " + name);
        String property = environment.getProperty("gold.love");
        System.out.println("property = " + property);
    }
}
