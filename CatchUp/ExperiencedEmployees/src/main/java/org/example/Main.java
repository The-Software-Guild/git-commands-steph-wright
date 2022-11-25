package org.example;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("001", "AAA", 1, "Trainee", "Finance", 0);
        Employee emp2 = new Employee("002", "BBB", 5, "Senior", "IT", 50000);
        Employee emp3 = new Employee("003", "CCC", 5, "Senior", "Finance", 60000);
        Employee emp4 = new Employee("004", "DDD", 4, "Developer", "Finance", 39000);
        Employee emp5 = new Employee("004", "DDD", 4, "Developer", "Finance", 39000);

        Set<Employee> employeeSet = new TreeSet<Employee>();
        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp3);
        employeeSet.add(emp4);
        employeeSet.add(emp5);


        for (Employee employee: employeeSet) {
            System.out.println(employee);
        }
    }
}