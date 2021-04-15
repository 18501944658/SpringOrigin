package com.itszt.gold.scanBean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@ComponentScans本质是一个Set容器
//@ComponentScans({@ComponentScan("com.itst.gold"),@ComponentScan("com.itst.gold")})
@ComponentScan("com.itst.gold")
@PropertySource(value = "classpath:application.properties")
public class ScanBean {
}
