package com.itszt.gold.bean20210105;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;


public class ImportBeanDefault implements DeferredImportSelector {
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[0];
    }

    /***
     * 返回实现了DeferredImportSelector.Group接口的类对象
     * @return
     */
    public Class<? extends Group> getImportGroup() {
        return ImportBeanDefaultGroup.class;
    }



    public class ImportBeanDefaultGroup implements DeferredImportSelector.Group {


        List<Entry> entries= new ArrayList<Entry>();
        /**
         * DeferredImportSelector
         * @param metadata
         * @param selector  外部类的对象
         */
        public void process(AnnotationMetadata metadata, DeferredImportSelector selector) {
            String[] strings = selector.selectImports(metadata);
            for (String string : strings) {
                entries.add(new Entry(metadata,string));
            }
        }

        public Iterable<Entry> selectImports() {
            return entries;
        }
    }
}
