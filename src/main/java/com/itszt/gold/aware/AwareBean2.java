package com.itszt.gold.aware;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class AwareBean2 implements InitializingBean {


    public void afterPropertiesSet() throws Exception {
        System.out.println("==================afterPropertiesSet");
    }
}
