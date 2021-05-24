package com.itszt.gold.bean20210112;


import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy(proxyTargetClass = true,exposeProxy = true)
public class AopProxy {

}
