package com.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyPointCuts {

    @Pointcut("execution(* com.aop.CityLibrary.fdadd*(..))")
    public void allAddMethods() {}

    @Pointcut("execution(* com.aop.CityLibrary.fdreturnBook*(..))")
    public void returnBookMethod(){}

}
