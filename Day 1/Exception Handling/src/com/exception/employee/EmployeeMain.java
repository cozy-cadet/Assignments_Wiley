package com.exception.employee;

import java.util.Scanner;
import java.util.TreeMap;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee emp = new Employee();
		EmployeeMenu emobj = new EmployeeMenu();
		int flag=0;
		while(true)
		{
		try{
			emobj.showMenu();
			System.out.println("Enter Choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter name");
				   String name=sc.next();
				   emp.setName(name);
				   System.out.println("Enter age");
				   int age=sc.nextInt();
				   emp.setAge(age);
				   emobj.addEmployee(emp);
				   flag=1;
				   break;
			case 2:System.out.println(emobj.employees);
				break;
			case 3:System.exit(0);
			
			}
			
			
		}
		catch(NameExistsUnCheckedException nameException)
		{
			System.out.println(nameException.getMessage());
		}
		catch(AgeUncheckedException exception)
		{
			System.out.println(exception.getMessage());
		}
		finally
		{
			if(flag==1)
				System.out.println("Transaction Complete.");
			else
				System.out.println("Transaction Incomplete.");
		}

	}
}

}