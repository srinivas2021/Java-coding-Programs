package com.user.test.employee;


import java.time.LocalDate;
import java.util.*;

public class Employee {
    private final int id;
    private final String name;
    private final String department;
    private final double salary;
    private final LocalDate dateOfJoining;
    private final boolean active;
    private final List<String> skills; // e.g., ["Java", "Spring", "AWS"]

    public Employee(int id, String name, String department, double salary,
                    LocalDate dateOfJoining, boolean active, List<String> skills) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
        this.active = active;
        this.skills = skills == null ? Collections.emptyList() : skills;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public LocalDate getDateOfJoining() { return dateOfJoining; }
    public boolean isActive() { return active; }
    public List<String> getSkills() { return skills; }

    @Override
    public String toString() {
        return String.format("Employee{id=%d, name='%s', dept='%s', salary=%.2f}", id, name, department, salary);
    }
}

