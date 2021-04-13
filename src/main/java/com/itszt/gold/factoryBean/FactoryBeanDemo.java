package com.itszt.gold.factoryBean;

import com.itszt.gold.Student;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;


/***
 *  FactoryBeanDemo 和  Student 都会被Spring容器管理
 *
 *  灵活定义需要我们自己创建的实例的时候,我们可以实现factoryBean接口
 *
 *  在getObject方法里面定义实例化过程
 *  */
@Component
public class FactoryBeanDemo implements FactoryBean {
    /**getObject在容器启动的时候不会进行加载,只有调用的时候在会依赖注入***/
    /**只有当getObject中方法,返回的对象有被使用的时候才会调用getObject方法**/
    public Object getObject() throws Exception {
        return new Student();
    }

    public Class<?> getObjectType() {
        return Student.class;
    }
}
