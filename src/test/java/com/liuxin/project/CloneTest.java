package com.liuxin.project;

import com.liuxin.project.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class CloneTest {

    @Test
    void cloneTest() throws CloneNotSupportedException {

        Employee employee = new Employee("liuxin",12.0,LocalDate.now());
        Employee clone = (Employee) employee.clone();
        employee.setHireDay(LocalDate.of(2011,1,1));
//        System.out.println(employee == clone); // false
        System.out.println(employee.getHireDay() == clone.getHireDay()); //false
    }
}
