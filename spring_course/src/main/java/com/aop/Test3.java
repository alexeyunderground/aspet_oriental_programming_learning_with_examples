package com.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

       CityLibrary cityLibrary = context.getBean("cityLibrary",CityLibrary.class);
       //String bookName = cityLibrary.returnBook();
        //System.out.println("В библиотеку вернули книгу " + bookName);
        cityLibrary.returnMagazine();

        context.close();
        System.out.println("Method main ends");
    }
}
