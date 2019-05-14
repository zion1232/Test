package test2;

import java.util.Scanner;

public class arr10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final int NUM_CLASSES = 2, STUDENT_IN_CLASS = 2;
		int[][] grades = new int[NUM_CLASSES][STUDENT_IN_CLASS];
		float[] average = new float[grades.length];
		for (int i = 0; i < grades.length; i++) {
			System.out.printf("ples enter grade for  %d student in class #%d : \n", grades[i].length, i + 1);
			int sum = 0;
			for (int j = 0; j < grades[i].length; j++) {
				grades[i][j] = s.nextInt();
				sum += grades[i][j];
			}
			average[i] = (float) sum / grades[i].length;
		}
		System.out.println("the averg for class : ");
		for (int i = 0; i < average.length; i++) {
			System.out.printf("avergg for ckass #%d :  %f \n", i + 1, average[i]);

		}
		System.out.println();
		System.out.println("the grade in all class : ");
		for (int i = 0; i < grades.length; i++) {
			System.out.printf("class #%d : ", i + 1);
			for (int j = 0; j < grades[i].length; j++)
				System.out.printf(grades[i][j] + " ");
			System.out.println();
		

		}
	}

}

/* קליתת מספרים למער דו */