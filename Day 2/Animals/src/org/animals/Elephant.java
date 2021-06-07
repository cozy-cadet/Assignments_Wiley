package org.animals;

public class Elephant extends Animal {

	public Elephant(String color, int age, double weight){
		super.setColor(color);
		super.setAge(age);
		super.setWeight(weight);
	}
	@Override
	boolean isVegetarian() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	boolean canClimb() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	String soundType() {
		// TODO Auto-generated method stub
		return "Trumpet";
	}

}
