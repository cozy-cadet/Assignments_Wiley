package com.worker.salary;

public abstract class Worker {
	
	private String name;
	private int rate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	public void Pay(int hous) {
		
	}

}
