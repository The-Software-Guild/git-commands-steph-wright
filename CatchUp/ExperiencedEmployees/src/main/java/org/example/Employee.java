package org.example;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Employee implements Comparable<Employee> {
    private String id;
    private String name;
    private int experience;
    private String designation;
    private String department;
    private int salary;

    @Override
    public int compareTo(Employee emp) {
        if(experience > emp.experience)
            return 1;
        else if(experience < emp.experience)
            return -1;
        else if(this.equals(emp))
            return 0;
        return 1;
    }
}


