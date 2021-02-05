package com.itszt.gold.even;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/***
 * 自定义事件
 */
@Data
public class EnjoyEvent extends ApplicationEvent {

    private String name;

    public EnjoyEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

}
