package com.itszt.gold.even;

import lombok.Data;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Data
@Component
public class SpringRefreshedListener implements ApplicationListener<ContextRefreshedEvent> {


    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("=============Spring容器加载完毕！！！==================");
    }
}
