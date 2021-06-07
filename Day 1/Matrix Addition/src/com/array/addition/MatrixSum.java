package com.array.addition;

public class MatrixSum {
	
	Matrix arrobj1 = new Matrix();
	Matrix arrobj2 = new Matrix();
	Matrix arrobj3 = new Matrix();
	
	public MatrixSum(Matrix arr1, Matrix arr2) {
		this.arrobj1=(arr1);
		this.arrobj2=(arr2);
	}
	
	public void addArrays() {
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
				arrobj3.setArrVal(i, j, (arrobj1.getArr(i, j)+arrobj1.getArr(i, j)));
	}
	
	public void Display() {
		System.out.println("Added Matrix:");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++)
				System.out.print(arrobj3.getArr(i, j)+" ");
			System.out.println(" ");
		}
	}
}

