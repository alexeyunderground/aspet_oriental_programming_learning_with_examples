package com.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: В библиотеку пытаются " +
                "вернуть книгу");

        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: В библиотеку " +
                "успешно возвращют книгу");
        System.out.println("aroundReturnBookLoggingAdvice: метод returnBook() выполнялся " +
                ""+(end-begin)+ " миллисекунд");

        return targetMethodResult;
    }
    @Around("execution(* returnMagazine())")
    public Object aroundReturnMagazineLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("aroundReturnMagazineLoggingAdvice: В библиотеку пытаются возвратить журнал");

        Object targetReturnMethod = proceedingJoinPoint.proceed();

        System.out.println("aroundReturnMagazineLoggingAdvice: В библиотеку успешно возвращают журнал");

        return targetReturnMethod;
    }
}
