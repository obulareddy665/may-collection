package com.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employees=new LinkedList<>();
		employees.add(new Employee(1, "jaya"));
		employees.add(new Employee(2,"jaya"));
		employees.add(new Employee(1, "jaya"));
		employees.add(new Employee(2,"viswa"));
		employees.add(new Employee(1, "jaya"));
		employees.add(new Employee(2,"jaya"));
		employees.add(new Employee(1, "jaya"));
		employees.add(new Employee(2,"jaya"));
		employees.add(new Employee(1, "manu"));
		employees.add(new Employee(2,"jaya"));
		
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		
	}
	
	
	
}
