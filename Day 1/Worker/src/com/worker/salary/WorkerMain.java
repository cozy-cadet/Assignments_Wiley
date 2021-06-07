package com.worker.salary;

import java.util.Scanner;

public class WorkerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter details. \nEnter name, followed by rate, hours, and 1 for DailyWorker and 2 for SalariedWrker");
		String name = sc.nextLine();
		int rate = sc.nextInt();
		int hours = sc.nextInt();
		int ch = sc.nextInt();
		
		if(ch==1) {
			DailyWorker dwobj = new DailyWorker(name, rate);
			dwobj.Pay(hours);
			dwobj.displaySalary();
		}
		else {
			SalariedWorker swobj = new SalariedWorker(name, rate);
			swobj.Pay(hours);
			swobj.displaySalary();
		}
		sc.close();
	}

}
