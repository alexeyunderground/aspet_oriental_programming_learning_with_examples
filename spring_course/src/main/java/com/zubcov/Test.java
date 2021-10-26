package com.zubcov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext2.xml");

        Dog dog = context.getBean("myPet", Dog.class);
        dog.say();
        ;
        context.close();
    }
}
