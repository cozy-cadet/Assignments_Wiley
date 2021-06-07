package com.vandalur.zoo;
import java.util.ArrayList;
import java.util.Scanner;
import org.animals.*;

public class VandalurZoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> animals = new ArrayList<Animal>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			Animals.showMenu();
			System.out.println("Enter choice.");
			int ch = sc.nextInt();
			if(ch<7) {
				System.out.println("Enter details of Animal.");
				String color = sc.next();
				int age = sc.nextInt();
				double weight = sc.nextDouble();
				
				Animals obj = new Animals(age,weight,color);
				obj.setAnimal(ch);
				animals.add(obj.getAnimal());
			}
			else
				break;
		}
		
		DisplayDetails displayobj = new DisplayDetails();
		System.out.println("\n Animals");
		for(Animal x:animals) {
			displayobj.Display(x);
			System.out.println("=================");
		}
	}
}
