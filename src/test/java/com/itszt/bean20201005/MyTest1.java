package com.itszt.bean20201005;


import com.itszt.gold.bean20210110.ScanBeanCus;
import com.itszt.gold.bean20210114.Mans;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest1 {
    /***
     * 读取配置文件获取bean对象
     */
    @Test
    public void testFact() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ScanBeanCus bean = context.getBean(ScanBeanCus.class);
        System.out.println("bean = " + bean);

    }

    @Test
    public void testFact111() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Mans bean = context.getBean(Mans.class);
        bean.getName();
    }


}
