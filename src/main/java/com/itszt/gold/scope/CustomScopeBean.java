package com.itszt.gold.scope;


import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 自定义多例
 *
 *  应用场景:需要自己去维护一个Bean
 *  ObjectFactory.getObject方法是拿到一个实例
 *  但是这个实例没有交给spring来管理,
 *  我们需要自己定义容器去管理这些Bean
 */
@Component
@org.springframework.context.annotation.Scope("refreshScope")
@Data
public class CustomScopeBean  {


private String username;
}
