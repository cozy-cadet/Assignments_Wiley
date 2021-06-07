package com.directory.records;

public class OneRecord {
	
	//Map<String, ArrayList<Long>> records = new HashMap<String, ArrayList<Long>>();
	private String name;
	private int number;
	
	public void setRecord(String name, int num)
	{
		this.name = name;
		this.number = num;
	}
	public String getName(){
		return this.name;
	}
	public int getNumber(){
		return this.number;
	}
//	public void addRecord(String name, long num) {
//		ArrayList<Long> temparr = new ArrayList<Long>();
//		boolean isKeyPresent = records.containsKey(name);
//		if(isKeyPresent)
//			temparr = records.get(name);
//		else
//			temparr.add(num);
//		records.put(name, temparr);
//	}
	
//	public ArrayList<Long> showNumbers(String name) {
//		return records.get(name);
//	}
//	
//	public String showName(long num) {
//		
//	}
}
