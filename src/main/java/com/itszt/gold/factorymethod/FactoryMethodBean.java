package com.itszt.gold.factorymethod;


import com.itszt.gold.Man;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Data
public class FactoryMethodBean {

    /***
     * 必须为非静态方法
     * @return
     */
    public Man getFactoryMethod(){
        return new Man();
    }



}
