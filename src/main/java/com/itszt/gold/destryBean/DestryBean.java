package com.itszt.gold.destryBean;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Data
@Component
public class DestryBean {

    public DestryBean() {
    }

    @PreDestroy
   public void destry(){
       System.out.println("DestryBean 销毁成功！！！！");
   }
}
