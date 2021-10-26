package com.aop;

import org.springframework.stereotype.Component;

@Component
public class CityLibrary {

    public void getBook() {
        System.out.println("Берем книгу из CityLibrary");
        System.out.println("----------------------------------");
    }

    public void getMagazine() {
        System.out.println("Берем журнал из CityLibrary");
        System.out.println("----------------------------------");
    }

    public void addBook(String person_name,Book book) {
        System.out.println("Добавляем книгу в CityLibrary");
        System.out.println("----------------------------------");
    }

    public void addMagazine() {
        System.out.println("Добавляем журнал в CityLibrary");
        System.out.println("----------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Возвращаем журнал в CityLibrary");
    }

    public String returnBook() {
        System.out.println("Возвращаем книгу в CityLibrary");
        return "Война и мир";
    }
}
