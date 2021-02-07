package com.itszt.gold.factorymethod;

import com.itszt.gold.Man;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Bean等同于直接引用另一个类中FactoryMethodBean中非静态FactoryMethod方法
 */
@Data
@Component
public class FactoryMethodAnnotation {

    /***
     * 必须为非静态方法
     * @return
     */
    @Bean("damen")
    public Man getFactoryMethod(){
        return new Man();
    }
}
