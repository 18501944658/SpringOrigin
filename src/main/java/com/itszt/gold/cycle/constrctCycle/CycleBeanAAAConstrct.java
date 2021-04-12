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
public class CycleBeanAAAConstrct {

     @Lazy
     /**@Lazy注解,会生成一个CycleBeanBBBConstrct 的代理对象,不调用CycleBeanBBBConstrct的getBean操作,所以不会出现循环依赖问题***/
    //会触发入参对象的getBean
    public CycleBeanAAAConstrct(CycleBeanBBBConstrct cycleBeanBBBConstrct) {
        System.out.println("cycleBeanBBBConstrct = " + cycleBeanBBBConstrct);
    }
}
