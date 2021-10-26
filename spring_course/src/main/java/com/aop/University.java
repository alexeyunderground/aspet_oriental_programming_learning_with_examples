package com.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<Student>();

    public void addStudents() {
        Student st1 = new Student("Aleksey Zubcov",4, 10);
        Student st2 = new Student("Maksim Zdamirov",2, 8.2);
        Student st3 = new Student("Elena Golovach",1, 7.9);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы методы getStudents()");
       // System.out.println(students.get(3));
        System.out.println("Information from method: getStudents()");
        System.out.println(students);
        return students;
    }
}
