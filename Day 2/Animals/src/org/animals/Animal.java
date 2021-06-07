package org.animals;

public abstract class Animal {
	
	private String color;
	private int age;
	private double weight;
	
	abstract boolean isVegetarian();
	abstract boolean canClimb();
	abstract String soundType();
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	

}
