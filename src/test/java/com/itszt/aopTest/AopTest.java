package com.itszt.aopTest;

import com.itszt.gold.bean20210117.StudentService;
import com.itszt.gold.scanBean.ScanBean;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring Aop 测试
 */
public class AopTest {


    @Test
    public void test1(){
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ScanBean.class);
        StudentService bean = context.getBean(StudentService.class);
        System.out.println("bean = " + bean);
        bean.eat("lijinjian");
    }


    @Test
    public void test2(){
//        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ScanBean.class);
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        StudentService bean = context.getBean(StudentService.class);
        bean.eat("213142");
    }
}
