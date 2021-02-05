package com.itszt.gold.beanpackagescanner;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.annotation.AnnotationFilter;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 自定义扫描器注册器
 */
public class BeanScannerRegistar implements ImportBeanDefinitionRegistrar {
    /***
     * 覆写注册流程
     * @param importingClassMetadata
     * @param registry
     */
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
//        /**指定文件夹下任何class文件都进行Bean创建和注册**/
//        boolean acceptAllBeans = true;
//        AnnotationAttributes annoAttrs = AnnotationAttributes.fromMap(importingClassMetadata.getAnnotationAttributes(BeansScan.class.getName()));
//        /**自定义扫描器***/
//        BeanPackageScaner beanPackageScaner= new BeanPackageScaner(registry);
//        Class<?> annotationClass = annoAttrs.getClass("annotationClass");
    }
}
