package com.baizhi.entity;

import java.io.Serializable;

public class User implements Serializable {
    private String id;
    private String name;
    private double salary;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {

    }

    public User(String id, String name, double salary, int age) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
}
