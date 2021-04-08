package com.itszt.gold.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class AwareBean1 implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("AwareBean1-applicationContext = " + applicationContext);
        this.applicationContext = applicationContext;
    }


    @Override
    public String toString() {
        return "AwareBean1{" +
                "applicationContext=" + applicationContext +
                '}';
    }
}
