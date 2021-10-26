package com.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExceptionHandlingAspect {

    @Before("com.aop.aspects.MyPointCuts.allAddMethods() || com.aop.aspects.MyPointCuts.returnBookMethod()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("beforeGetExceptionHandlingAdvice: ловим/обрабатываем исключения " +
                "при попытке получить книгу/журнал");
        System.out.println("----------------------------------");
    }
}
