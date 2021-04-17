package com.itszt;

import com.itszt.gold.importBean.ImportBean;
import com.itszt.gold.importBean.SelectImportBeanOne;
import com.itszt.gold.scanBean.ScanBean;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 完全基于注解
 */
public class AnnotationTest {

    @Test
    public void test1() {
        AnnotationConfigApplicationContext application = new AnnotationConfigApplicationContext(ScanBean.class);
        ImportBean bean = application.getBean(ImportBean.class);
        System.out.println("bean = " + bean);
    }

    @Test
    public void test2() {
        AnnotationConfigApplicationContext application = new AnnotationConfigApplicationContext(ScanBean.class);
        SelectImportBeanOne bean = application.getBean(SelectImportBeanOne.class);
        System.out.println("bean = " + bean);
    }
}
