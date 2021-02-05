package com.itszt.gold.even;

import lombok.Data;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Data
@Component
public class EnjoyApplicationListener implements ApplicationListener {


    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof EnjoyEvent) {
            System.out.println("event = " + event);
            System.out.println("===============EnjoyApplicationListener========================");
        }
    }
}
