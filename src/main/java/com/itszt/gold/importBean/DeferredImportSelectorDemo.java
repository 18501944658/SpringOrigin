package com.itszt.gold.importBean;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;

/***
 * 通过返回任意普通类的完整的限定名,可以直接实例化Bean
 *
 * 如果没有实现DeferredImportSelector.Group接口,则调用DeferredImportSelector接口实现类的selectImports方法
 *
 * 如果实现了DeferredImportSelector.Group接口,则调用getImportGroup方法的返回
 */
public class DeferredImportSelectorDemo implements DeferredImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        /***任何一个普通类,只要返回类的完成限定名,则同样也会被Bean容器实例化***/
        return new String[]{SelectImportBeanOne.class.getName()};
    }


    /**
     * 要返回实现了group接口的类
     * @return
     */
    public Class<? extends Group> getImportGroup() {
        /**实现DeferredImportSelector.Group接口的内部类类实例**/
        return DeferredImportSelectorGroupDemo.class;
    }

    /**
     * 实现了DeferredImportSelector.Group接口的类
     */
    private static class DeferredImportSelectorGroupDemo implements DeferredImportSelector.Group{

        List<Entry> list=new ArrayList<Entry>();
        /**
         * 收集需要实例化的类
         * @param metadata
         * @param selector  外部类的对象就是实现了DeferredImportSelector接口的主类
         */
        public void process(AnnotationMetadata metadata, DeferredImportSelector selector) {
            System.out.println("DeferredImportSelector.Group.process");
            /**调到外部类的selectImports拿到了类的完整限定名的数组**/
            String[] strings = selector.selectImports(metadata);
            for (String string : strings) {
                list.add(new Entry(metadata,string));
            }
        }

        public Iterable<Entry> selectImports() {
            System.out.println("DeferredImportSelector.Group.selectImports");
            return list;
        }
    }
}
