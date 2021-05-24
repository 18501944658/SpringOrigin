package com.itszt.gold.bean20210107.advice;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 注册实现一个自定义的切面
 *
 * Advisor顶级AOP切面抽象,它的继承体系主要有
 *
 * PointcutAdvisor 和  IntroductionAdvisor
 *
 *  IntroductionAdvisor与PointcutAdvisor最本质上的区别就是,IntroductionAdvisor只能应用于类级别的拦截,而PointCutAdvisor,可以使用任何类型的Ponitcut
 */
@Component
@Order(1)
public class CustomAdvisor2 implements PointcutAdvisor {
    public Pointcut getPointcut() {
        return Pointcut.TRUE;
    }

    public Advice getAdvice() {
        return new CustomAdvice();
    }

    public boolean isPerInstance() {
        return false;
    }
}
