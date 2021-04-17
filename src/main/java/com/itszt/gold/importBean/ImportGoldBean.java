package com.itszt.gold.importBean;


import com.itszt.gold.Student;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/***
 * DeferredImportSelector 比较复杂, Springboot中自动配置用到了
 */
public class ImportGoldBean implements DeferredImportSelector {
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("ImportGoldBean = " + importingClassMetadata);
        return new String[]{Student.class.getName()};
    }
}
