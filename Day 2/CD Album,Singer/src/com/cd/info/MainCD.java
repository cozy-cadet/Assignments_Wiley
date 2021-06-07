package com.cd.info;

import java.util.*;
public class MainCD {
	
	public static void main(String[] args) {
		
		List<CD> mySet=new ArrayList<CD>();

		mySet.add(new CD("Perfect","Ed Sheeran"));
		mySet.add(new CD("Positions","Ariana Grande"));
		mySet.add(new CD("Intentions","Justin Beiber"));
		mySet.add(new CD("Deja Vu","Olivia Rodrigo"));
		mySet.add(new CD("Photograph","Ed Sheeran"));
		mySet.add(new CD("Better","Anaya Birla"));
		
		Collections.sort(mySet, new SortBySingerName());
		
		Iterator<CD> iterator=mySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}