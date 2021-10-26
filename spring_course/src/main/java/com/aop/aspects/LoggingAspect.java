package com.aop.aspects;

import com.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class LoggingAspect {

    @Before("com.aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingReturnAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj:arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информаций о книге название - "+
                            myBook.getName() +". Автор - "+myBook.getAuthor()+", год издания - "+
                            myBook.getYearOfPublication());
                }
                else if (obj instanceof String) {
                    System.out.println("книгу в библиотеку добавляет " + obj);
                }
            }
        }
        System.out.println("beforeLoggingReturnAdvice: Log #1");
        System.out.println("----------------------------------");
    }
    @Before("com.aop.aspects.MyPointCuts.returnBookMethod()")
    public void returnMagazineAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature)  joinPoint.getSignature();
        System.out.println("methodSignature.getName() " + methodSignature.getName());
        System.out.println("methodSignature.getMethod() " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() "+ methodSignature.getReturnType());
        Object[] arguments = joinPoint.getArgs();

        for(Object o: arguments) {
            if (o instanceof Book) {
                System.out.println("Возвращаем обратно книгу - "+ ((Book) o).getName()+". Автор - "
                        + ((Book) o).getAuthor()+". Год публикации книги - " + ((Book) o).getYearOfPublication());
            } else if (o instanceof String) {
                System.out.println("Книгу вернул - "+o);
            }
        }
        System.out.println("returnMagazineAdvice : Log #4");
        System.out.println("----------------------------------");
    }


}