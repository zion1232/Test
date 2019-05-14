package test;

import java.util.Scanner;

public class matriza {

	public static void main(String[] args) {
		int [][]mat1 = new int [3][4],mat2=new int[4][4];
		setMatrix(mat1);
		setMatrix(mat2);
		System.out.println("mat 1");
		printMatrix(mat1);
		System.out.println("mat 2");
		printMatrix(mat2);
}

	private static void setMatrix(int mat[][]) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++)
				mat[i][j]=(int)(Math.random()*10);
		}
		
	}
	
	private static void printMatrix(int mat[][]) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++)
				System.out.printf("%4d",mat[i][j]);
			System.out.println("");
/*הצגת מטריצות פונקציה*/
	}
	}
}