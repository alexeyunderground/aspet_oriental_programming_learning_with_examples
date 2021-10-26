package com.zubcov;

import org.springframework.stereotype.Component;

//@Component
public class Cat implements Pet{

    public Cat() {
        System.out.println("Cat's constructor");
    }

    public void say() {
        System.out.println("Meow-meow");
    }
}
