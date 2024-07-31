package com.spring.orm;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        Student s = new Student(321, "Neha Kumari", "Mumbai");

//        int insert = studentDao.insert(s);
//        System.out.println("Inserted with id " + insert);

//        Student student = studentDao.getStudent(123);
//        System.out.println(student);

//        List<Student> allStudents = studentDao.getAllStudents();
//        for(Student st : allStudents){
//            System.out.println(st);
//        }
//        studentDao.update(s);

        studentDao.delete(321);


    }
}