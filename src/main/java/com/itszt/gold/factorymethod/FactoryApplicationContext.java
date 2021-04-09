package com.itszt.gold.factorymethod;


import lombok.Data;
import org.springframework.context.ApplicationContext;

@Data
public class FactoryApplicationContext {


    private  ApplicationContext applicationContext;

    public FactoryApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    /***
     * 必须为非静态方法
     * @return
     */
    public ApplicationContextAccessor getFactoryMethod(){
        return new ApplicationContextAccessor(applicationContext);
    }



}
