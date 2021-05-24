package com.itszt.gold.scanBean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@ComponentScans本质是一个Set容器
//@ComponentScans({@ComponentScan("com.itst.gold"),@ComponentScan("com.itst.gold")})
//@ComponentScan(basePackages = "com.itst.gold",includeFilters ={@ComponentScan.Filter(type = FilterType.ANNOTATION,value = Component.class)} )
@ComponentScan("com.itszt.gold")
@PropertySource(value = "classpath:application.properties")
public class ScanBean {
}
