package com.liuxin.project.entity;

import java.time.LocalDate;

public class Employee implements Cloneable  {
    private String name;
    private double salary;
    private LocalDate hireDay;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    //一个方法不需要访问对象状态，其所需参数都是通过显式参数提供
    //一个方法只需要访问类的静态域

    //所有实例将共享nextId域
    private static int nextId = 1;

    public static int getNextId(){
        return nextId;
    }

    public Employee(String name, double salary, LocalDate hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
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

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }
}
