package com.itszt.gold.bean20210107;


import com.itszt.gold.CQ;
import com.itszt.gold.Student;
import org.springframework.context.annotation.Bean;

/**
 * @Bean注解使用
 *
 * 等同于在XML中配置FactoryBean和FactoryMethod一样,他们走的都是同一个实例化方法
 */
//@Configuration
public class AnnoBean {
    /**
     * 每一个@Bean注解的方法对应一个BeanDefinition对象
     *
     * 对应BeanDefiniition对象中的2个属性
     *
     * factoryBeanName=AnnoBean
     *
     * factoryMethodName=student
     * @return
     */
    @Bean
    public Student getStudent(){
        return new Student();
    }

    /**
     * 每一个@Bean注解的方法对应一个BeanDefinition对象
     *
     * factoryBeanName=AnnoBean
     *
     * factoryMethodName=cq
     * @return
     */
    @Bean
    public CQ getCQ(){
        return new CQ();
    }

}
