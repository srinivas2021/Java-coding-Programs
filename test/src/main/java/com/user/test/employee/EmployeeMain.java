package com.user.test.employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
		    new Employee(1, "Asha", "IT", 95000, LocalDate.of(2018, 5, 10), true, Arrays.asList("Java", "Spring")),
		    new Employee(2, "Rahul", "Finance", 120000, LocalDate.of(2015, 3, 1), true, Arrays.asList("Excel", "SQL")),
		    new Employee(3, "Neha", "IT", 70000, LocalDate.of(2020, 8, 20), false, Arrays.asList("Python", "AWS")),
		    new Employee(4, "Vikram", "HR", 65000, LocalDate.of(2019, 1, 15), true, Arrays.asList("Communication")),
		    new Employee(5, "Priya", "IT", 130000, LocalDate.of(2012, 11, 30), true, Arrays.asList("Java", "Microservices", "AWS")),
		    new Employee(6, "Anil", "Finance", 90000, LocalDate.of(2021, 6, 1), true, Arrays.asList("SQL", "PowerBI"))
		);
		
		//Filter & Map: active IT employee names
		
		List<String> names = employees.stream()
								.filter(Employee::isActive)
								.filter(e -> "IT".equals(e.getDepartment()))
								.map(Employee::getName)
								.sorted()
								.collect(Collectors.toList());
//		System.out.println("active IT employee names: " + names);
		
		//Top N salaries in a IT department
		int N = 2;
		List<Employee> topSalary = employees.stream()
//				.filter(e -> "IT".equals(e.getDepartment()))
				.sorted(Comparator.comparingDouble(Employee::getSalary))
				.limit(N)
				.collect(Collectors.toList());
		
//		System.out.println("Top 2 Salaries: " + topSalary);
		
		//Grouping by department
		Map<String, List<Employee>> groupByDept = employees.stream()
									.collect(Collectors.groupingBy(Employee::getDepartment));
//		System.out.println("groupByDept: " + groupByDept);
									
		//Grouping + aggregation (average salary per department)
		Map<String, Double> averageSalary = employees.stream()
										  .collect(Collectors.groupingBy(Employee::getDepartment, 
												  Collectors.averagingDouble(Employee::getSalary)));
//		System.out.println("averageSalary: " + averageSalary);
										  
		//Map department → highest paid employee
		Map<String, Employee> highestPaidEmpByDept = employees.stream()
				                                     .collect(Collectors.groupingBy(Employee::getDepartment,
				                                    		 Collectors.collectingAndThen(
				                                    				 Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)));
//		System.out.println("highestPaidEmpByDept: " + highestPaidEmpByDept);
		
		//Joining strings (CSV of employee names)
		String empNames = employees.stream()
						  .map(Employee::getName)
						  .sorted()
						  .collect(Collectors.joining(","));
//		System.out.println("empNames: " + empNames);
		
		Optional<Double> secondHighestSalary = employees.stream()
										//.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
										.map(Employee::getSalary)
										.distinct()
										.sorted(Comparator.reverseOrder())
										.skip(1)
										.findFirst();
				
//		System.out.println("2ndHighestSalary: " + secondHighestSalary);		
		
		//maxSalary of Employee
		Optional<Double> maxSalary = employees.stream()
										.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))
										.map(Employee::getSalary);
		System.out.println("maxSalary: " + maxSalary);

	}

}
