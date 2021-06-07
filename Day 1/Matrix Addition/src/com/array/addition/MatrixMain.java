package com.array.addition;

import java.util.Scanner;

public class MatrixMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Matrix 1");
		Matrix mat1 = new Matrix();
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
				mat1.setArrVal(i, j, sc.nextInt());
		System.out.println("Matrix 2");
		Matrix mat2 = new Matrix();
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
				mat2.setArrVal(i, j, sc.nextInt());
		
		MatrixSum sumObj = new MatrixSum(mat1, mat2);
		sumObj.addArrays();
		sumObj.Display();
		sc.close();
	}

}
