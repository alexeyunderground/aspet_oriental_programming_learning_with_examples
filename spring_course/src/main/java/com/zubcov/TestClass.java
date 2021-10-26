package com.zubcov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson",Person.class);

        person.callMyPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
