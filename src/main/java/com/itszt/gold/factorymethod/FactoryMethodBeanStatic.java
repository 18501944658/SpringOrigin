package com.itszt.gold.factorymethod;


import com.itszt.gold.Man;
import lombok.Data;

@Data
public class FactoryMethodBeanStatic {


    public static Man getFactoryMethod(){
        return new Man();
    }

}
