package org.animals;

public class DisplayDetails {
	
	public void Display(Animal obj){
		String name = obj.getClass().getName();
		String[] res= name.split("[.]",0);
		System.out.println(res[2]);
		if(obj.isVegetarian())
			System.out.println("Vegetarian.");
		else
			System.out.println("Non Vegetarian.");
		
		if(obj.canClimb())
			System.out.println("Can Climb.");
		else
			System.out.println("Cannot Climb.");
		
		System.out.println("Weight: "+obj.getWeight());
		System.out.println("Color: "+obj.getColor());
		System.out.println("Age: "+obj.getAge());
	}

}
