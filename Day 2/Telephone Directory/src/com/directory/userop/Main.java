package com.directory.userop;

import com.directory.records.AllRecords;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllRecords newbook = new AllRecords();
		
		newbook.insertRecord("Sourav",123);
		newbook.insertRecord("Kriti", 234);
		newbook.insertRecord("Anushka", 345);
		newbook.insertRecord("Shivam", 456);
		newbook.insertRecord("Kunal", 567);
		
		System.out.println("==============================================");
		newbook.displayAll();
		System.out.println("==============================================");
		newbook.IshowNumbers("Sourav");
		System.out.println("==============================================");
		newbook.getName(456);
		System.out.println("==============================================");
		
	}

}
