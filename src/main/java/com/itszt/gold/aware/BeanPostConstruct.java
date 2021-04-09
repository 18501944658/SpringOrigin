package com.itszt.gold.aware;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 测试@PostConstrcut
 */
@Component
public class BeanPostConstruct {

    @PostConstruct
    public void init() {
        System.out.println("==================测试@PostConstrcut初始化方法init===============");
    }
}
