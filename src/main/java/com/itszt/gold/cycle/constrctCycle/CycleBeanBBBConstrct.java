package com.itszt.gold.cycle.constrctCycle;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/***
 * 构造函数的循环依赖
 */

@Data
@Component
@Lazy
public class CycleBeanBBBConstrct {

    @Lazy
    public CycleBeanBBBConstrct(CycleBeanAAAConstrct cycleBeanAAAConstrct) {
        System.out.println("cycleBeanAAAConstrct = " + cycleBeanAAAConstrct);
    }
}
