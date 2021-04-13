package com.itszt;

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

    }
}
