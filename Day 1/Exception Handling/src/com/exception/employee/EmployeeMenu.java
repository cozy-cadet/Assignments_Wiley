package com.exception.employee;

import java.util.HashMap;

public class EmployeeMenu {
	
	public static HashMap<String, Integer> employees = new HashMap<String, Integer>();
	public void showMenu()
	{
		System.out.println("\n1. Create Record");
		System.out.println("2. Display Record");
		System.out.println("3. Exit");
	}
 
	
	public void addEmployee(Employee emp) {
		if(employees.containsKey(emp.getName()))
			throw new NameExistsUnCheckedException("Employee with same name exists");
		else if(emp.getAge()<18||emp.getAge()>60)
			throw new AgeUncheckedException("Age cannot be less then 18 and greater than 60");
		else
			employees.put(emp.getName(),emp.getAge());
	}
	
	public void remEmployee(Employee emp) {
		employees.remove(emp.getName());
	}
}