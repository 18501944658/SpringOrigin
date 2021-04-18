package com.itszt.gold.bean20201229;

import org.springframework.beans.factory.FactoryBean;

/**
 * 实现FactoryBean接口
 * 当通过beanFactory.getBean(beanname首字母小写)获取的是getObject返回对象实例
 *
 * 当通过beanFactory.getBean(&beanname首字母小写)获取的是实现BeanFactory接口类的实例
 */
public class FactoryBeanDemo implements FactoryBean {
    public Object getObject() throws Exception {
        return new XiaoXiang() ;
    }

    public Class<?> getObjectType() {
        return null;
    }
}
