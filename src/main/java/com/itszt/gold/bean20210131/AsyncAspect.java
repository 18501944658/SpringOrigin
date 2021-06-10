package com.itszt.gold.bean20210131;


import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@EnableAsync(proxyTargetClass = true)
public class AsyncAspect {
}
