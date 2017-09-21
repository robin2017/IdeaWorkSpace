package com.robin.bean;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Copyright : com.robin
 * Author : Robin
 * Date : 2017/9/22
 * Time : 上午12:36
 * Version : 1.0
 * Description : desc
 */

@XmlRootElement(name = "data")
public class Student implements Serializable{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
