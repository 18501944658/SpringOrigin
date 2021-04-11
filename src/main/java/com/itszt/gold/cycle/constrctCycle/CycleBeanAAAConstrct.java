package com.itszt.gold.cycle.constrctCycle;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/***
 * 构造函数的循环依赖
 */
@Data
@Component
public class CycleBeanAAAConstrct {
     @Lazy
    //会触发入参对象的getBean
    public CycleBeanAAAConstrct(CycleBeanBBBConstrct cycleBeanBBBConstrct) {
        System.out.println("cycleBeanBBBConstrct = " + cycleBeanBBBConstrct);
    }
}
