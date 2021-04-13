package com.itszt.gold.scanBean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.itst.gold")
@PropertySource(value = "classpath:application.properties")
public class ScanBean {
}
