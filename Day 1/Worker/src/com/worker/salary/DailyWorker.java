package com.worker.salary;

public class DailyWorker extends Worker {
	
	int salary;
	public DailyWorker(String name, int rate) {
		super.setName(name);
		super.setRate(rate);
	}
	
	public void Pay(int hours) {
		this.salary=(hours/8)*(super.getRate());
	}
	
	void displaySalary() {
		System.out.println("Salary is: "+this.salary);
	}
}