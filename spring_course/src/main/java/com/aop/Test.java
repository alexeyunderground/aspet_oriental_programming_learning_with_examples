package com.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        CityLibrary cityLibrary = context.getBean("cityLibrary", CityLibrary.class);
        Book book = context.getBean("book", Book.class);
        //cityLibrary.getBook();
        cityLibrary.addBook("Aleksey", book);
        //cityLibrary.addMagazine();
        cityLibrary.returnBook();

        //cityLibrary.getMagazine();

        context.close();
    }
}
