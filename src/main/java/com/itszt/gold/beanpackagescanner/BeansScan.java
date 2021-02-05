package com.itszt.gold.beanpackagescanner;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 自定义扫描器过滤注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(BeanScannerRegistar.class)
public @interface BeansScan {

    String[] value() default {};

    String[] basePackages() default {};

    Class<? extends Annotation> annotationClass() default Annotation.class;
}
