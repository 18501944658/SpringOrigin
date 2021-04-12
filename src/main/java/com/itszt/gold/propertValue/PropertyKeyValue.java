package com.itszt.gold.propertValue;

import lombok.Data;

/**
 * 读取配置文件,给Bean赋初始值
 *
 * Property对象会存储在BeanDefinition对象中
 *
 * MutablePropertyValue这个list集合中,通过add方法进行添加
 *
 * 对于占位符的处理,spring是通过实现BeanDefinitionRegistryPostProcessor接口,
 * 遍历所有BeanDefinition对象,对BeanDefinition对象做crud,然后扫描MutablePropertyValues中值包含
 * ${}占位符的,进行读取配置文件,替换占位符的值
 *
 * spring实现BeanDefinitionRegistryPostProcessor接口的类的执行优先级肯定是最低的,因为要确保拿到最完整
 * 的Bean修改的定义,在实例化前进行BeanDefinition的注册
 */

/***
 * 占位符的解析 可以从2个方面获取,1-propertie配置文件 2-Environment对象
 *
 * PropertySourcesPlaceholderConfigurer读取配置文件后封装的对象
 */
@Data
public class PropertyKeyValue {

    private String name;

    private String password;
}
