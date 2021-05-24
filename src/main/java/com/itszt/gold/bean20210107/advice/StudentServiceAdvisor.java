package com.itszt.gold.bean20210107.advice;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceAdvisor implements PointcutAdvisor {

   @Autowired
   private StudentServiceAdvice studentServiceAdvice;


    public Pointcut getPointcut() {
        return Pointcut.TRUE;
    }

    public Advice getAdvice() {
        return studentServiceAdvice;
    }

    public boolean isPerInstance() {
        return false;
    }
}
