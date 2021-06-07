package com.vandalur.zoo;

import org.animals.*;

public class Animals {
	
	Animal thisanimal;
	
	private int age;
	private String color;
	private double weight;
	
	public Animals(int age, double weight, String color) {
		this.age = age;
		this.weight = weight;
		this.color = color;
	}
	
	public static void showMenu() {
		System.out.println("1 for Lion, 2 for Deer, 3 for Elephant, 4 for Giraffe, 5 for Monkey, 6 for Tiger.");
	}
	
	public void setAnimal(int ch) {
		switch(ch)
		{
		case 1 : thisanimal = new Lion(color, age, weight); break;
		case 2 : thisanimal = new Deer(color, age, weight); break;
		case 3 : thisanimal = new Elephant(color, age, weight); break;
		case 4 : thisanimal = new Giraffe(color, age, weight); break;
		case 5 : thisanimal = new Monkey(color, age, weight); break;
		case 6 : thisanimal = new Tiger(color, age, weight); break;
		default: thisanimal = null;
		}
	}
	
	public Animal getAnimal() {
		return thisanimal;
	}
}
