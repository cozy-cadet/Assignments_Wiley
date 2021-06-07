package com.directory.records;

import java.util.ArrayList;

public class AllRecords {

	ArrayList<OneRecord> records = new ArrayList<OneRecord>();
	
	public void insertRecord(String name, int nums) {
		OneRecord obj = new OneRecord();
		obj.setRecord(name, nums);
		records.add(obj);
	}
	 public void displayAll() {
		 for(OneRecord obj:records) {
			 System.out.println("\nName: "+obj.getName());
			 System.out.println("Numbers: "+obj.getNumber());
			 System.out.println("---------------------------------------------");
		 }
	 }
	 public void IshowNumbers(String name) {
		int number=0;
		for(OneRecord obj:records) {
			if(obj.getName().equals(name))
				number = obj.getNumber();
		}
		if(number!=0)
		System.out.println("Known Number: "+number);
		else
			System.out.println("Record does not exist.");
	 }
	 
	 public void getName(int num) {
		 int number=0;
		 String name="Not Found";
		 boolean flag=false;
		 for(OneRecord obj:records) {
			 number = obj.getNumber();
			 name = obj.getName();
			 if(num==number)
				flag=true;
			 if(flag)
				 break;
		 }
		 if(flag==true)
			 System.out.println("Name: "+name);
		 else
			 System.out.println("Record does not exist.");
	 }
}
