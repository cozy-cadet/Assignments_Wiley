package org.animals;

public class Deer extends Animal {

	public Deer(String color, int age, double weight){
		super.setColor(color);
		super.setAge(age);
		super.setWeight(weight);
		// TODO Auto-generated constructor stub
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
		return "Bellow";
	}

}
