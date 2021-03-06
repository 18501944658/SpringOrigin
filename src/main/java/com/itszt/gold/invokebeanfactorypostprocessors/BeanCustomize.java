package com.itszt.gold.invokebeanfactorypostprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

/**
 * 定义执行是在实例化之前,可以完成BeanDefinition的修改和注册,beanDefinition的增删改查
 **/

/**beanFactory后置处理器,Spring容器初始化时,从资源中读取到bean的相关定义后,保存在BeanDefinitionMap,
 * 在实例化bean的操作就时一句这些bean的定义来做的,而在实例化之前,Spring允许我们通过自定义扩展来改变
 * bean的定义,定义一旦变了,后面的实例也就变了,而beanFactory后置处理器,即BeanFactoryPostProcessor就是
 * 用来改变的bean定义的.
 * **/
@Component
public class BeanCustomize implements BeanDefinitionRegistryPostProcessor {

    /**
     * 该方法用来在注册更多的bean到Spring容器中,从BeanDefinitionRegistry提供了丰富的方法来操作
     * BeanDefinition,判断得,注册,移除等方法都准备好了,我们在编写PostProcessBeanDefinitionRegistry方法的内容时,
     * 就能直接使用入参registry的这些方法来完成判断和注册,移除等操作.
     * @param registry
     * @throws BeansException
     */
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
       /**遍历所有已经注册的BeanDefinition对象**/
//        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
//        System.out.println("---------------------BeanDefinitionRegistry---------------------");
//        for (int i = 0; i < beanDefinitionNames.length; i++) {
////            System.out.println(beanDefinitionNames[i]);
//            if (beanDefinitionNames[i].equals("student")){
//                BeanDefinition student = registry.getBeanDefinition("student");
//                System.out.println("student = " + student);
//                student.setLazyInit(true);
//                System.out.println("student = " + student);
//            }
//        }
//        System.out.println("---------------------BeanDefinitionRegistry---------------------");
       /**自定义依赖注入***/
//        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
//        genericBeanDefinition.setBeanClass(Man.class);
//        MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
//        mutablePropertyValues.add("name", "heihei");
//        genericBeanDefinition.setPropertyValues(mutablePropertyValues);
//        registry.registerBeanDefinition("man",genericBeanDefinition);

        /**扫描器**/
        ClassPathBeanDefinitionScanner scanner= new ClassPathBeanDefinitionScanner(registry);
        /**需要过滤的注解,添加新的过滤注解*/
        scanner.addIncludeFilter(new AnnotationTypeFilter(NewAnnodation.class));
        scanner.scan("com.itszt");

    }

    /***
     * 主要用来对bean定义做一些改变
     * @param beanFactory
     * @throws BeansException
     */
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        DefaultListableBeanFactory beanFactory1 = (DefaultListableBeanFactory) beanFactory;
        beanFactory1.setAllowBeanDefinitionOverriding(true);
        /*当关闭循环依赖后,BeanCustomize这个Bean实例化后,因所有的Bean是for循环形式的遍历创建实例化,
        * BeanCustomize这个Bean实例化后才会将是否循环引用关闭,所以在BeanCustomize实例化后的Bean的循环引用才会是false**/
        beanFactory1.setAllowCircularReferences(true);
    }
}
