package org.animals;

public class Lion extends Animal {
	
	public Lion(String color, int age, double weight){
		super.setColor(color);
		super.setAge(age);
		super.setWeight(weight);
	}

	@Override
	boolean isVegetarian() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean canClimb() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	String soundType() {
		// TODO Auto-generated method stub
		return "Roars";
	}

}
