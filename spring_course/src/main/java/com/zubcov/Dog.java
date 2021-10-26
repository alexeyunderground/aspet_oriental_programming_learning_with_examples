package com.zubcov;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("dogBean")
public class Dog implements Pet{

    public Dog() {
        System.out.println("It's a dog constructor");
    }

    public void say() {
        System.out.println("Gav-gav");
    }
/*    @PostConstruct
    public void init() {
        System.out.println("Init method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Destroy method");
    }*/
}
