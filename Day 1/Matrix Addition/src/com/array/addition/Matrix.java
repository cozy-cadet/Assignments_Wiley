package com.array.addition;

public class Matrix {
	
	private int[][] arr = new int[10][10];
	public int getArr(int i, int j) {
		return arr[i][j];
	}

	public void setArrVal(int i, int j, int element) {
		this.arr[i][j] = element;
	}
	
}