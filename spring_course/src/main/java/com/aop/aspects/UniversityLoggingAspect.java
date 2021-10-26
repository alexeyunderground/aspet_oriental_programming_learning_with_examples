package com.aop.aspects;

import com.aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    /*@Before("execution(* getStudents())")
    public void beforeGetStudentsLogigngAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов " +
                "перед методом getStudents()");
    }

    @AfterReturning(pointcut = "execution(* getStudents())",
    returning = "students")
    public void afterReturningStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);

        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. "+ nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double avgGrade = firstStudent.getAvgGrade();
        avgGrade +=1;
        firstStudent.setAvgGrade(avgGrade);

        System.out.println("afterReturningStudentsLoggingAdvice: логируем получение списка студентов " +
                "после методом getStudents()");
    }*/
    @AfterThrowing(pointcut = "execution(* getStudents())",
                   throwing = "exception")
    public void afterExceptionStudentAdvice(Throwable exception) {
        System.out.println("afterExceptionStudentAdvice: Метод сработал после исключения. " +
                "\n Исключение "+exception);
    }
    @After("execution(* getStudents())")
    public void afterStudentLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("afterStudentLoggingAdvice: method after "+methodSignature.getMethod() );
    }
}