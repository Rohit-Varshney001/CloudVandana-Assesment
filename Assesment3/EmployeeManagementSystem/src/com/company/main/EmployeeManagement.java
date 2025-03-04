package com.company.main;

import com.company.models.Employee;
import java.util.*;

public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating employee objects
        Employee emp1 = new Employee(101, "Rohit", 50000);
        Employee emp2 = new Employee(102, "Ram", 60000);
        Employee emp3 = new Employee(103, "Shyam", 55000);

        // Storing employees in a list
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        // Displaying employee details
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}