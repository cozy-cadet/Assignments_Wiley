package org.animals;

public class Monkey extends Animal {

	public Monkey(String color, int age, double weight){
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
		return true;
	}

	@Override
	String soundType() {
		// TODO Auto-generated method stub
		return "Chatter";
	}

}
