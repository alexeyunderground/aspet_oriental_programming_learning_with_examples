package com.zubcov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {

    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Person(Pet pet) {
        System.out.println("Person's constructor");
        this.pet = pet;
    }

    /*@Autowired
    public Person(@Qualifier("dogBean") Pet pet) {
        System.out.println("It's a person constructor");
        this.pet = pet;
    }*/

    public Person() {
        System.out.println("Person's constructor");
    }

    /*@Autowired
    @Qualifier("dogBean")
    public void setPet(Pet pet) {
        this.pet = pet;
    }*/

    public void callMyPet() {
        System.out.println("Hello my lovely Pet!");
        pet.say();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
