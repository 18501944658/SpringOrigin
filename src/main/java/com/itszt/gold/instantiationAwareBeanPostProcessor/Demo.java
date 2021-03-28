package com.itszt.gold.instantiationAwareBeanPostProcessor;

import com.itszt.gold.CQ;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Data
@Getter
@Setter
public class Demo {


    @Autowired
    private CQ cq;

    @PostConstruct
    public void  init(){
        System.out.println("demo-------------初始化完成");
    }

}
