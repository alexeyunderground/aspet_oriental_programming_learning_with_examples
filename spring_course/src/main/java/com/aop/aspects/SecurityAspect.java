package com.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(40)
public class SecurityAspect {

    @Before("com.aop.aspects.MyPointCuts.allAddMethods() || com.aop.aspects.MyPointCuts.returnBookMethod()")
    public void beforeAddSecurityReturnAdvice(){
        System.out.println("beforeSecurityReturnAdvice: Проверяем security права Log #2");
        System.out.println("----------------------------------");
    }
}
