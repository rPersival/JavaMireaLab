package com.mirea.lab.third_assignment.task_three;

import java.util.List;

public class Report {

    public static void generateReport(List<Employee> employees) {
        employees.forEach(System.out::println);
    }
}
