package com.itszt.gold.factorymethod;

import org.springframework.context.ApplicationContext;

public class ApplicationContextAccessor {

    private static ApplicationContext applicationContext;

    public ApplicationContextAccessor(ApplicationContext applicationContext) {
        System.out.println("ApplicationContextAccessor初始化完成");
        ApplicationContextAccessor.applicationContext = applicationContext;
    }
}
