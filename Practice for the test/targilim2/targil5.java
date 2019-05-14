package targilim2;

import java.util.Scanner;

public class targil5 {

	public static void main(String[] args) {
		int[][] matrix = new int[2][2];
		int value = 1;
		for (int i = 0; i < matrix.length; i++) {
			if (i % 2 == 0)
				for (int j = 0; j < matrix[i].length; j++)
					matrix[i][j] = value++;

			else {
				for (int j = 0; j < matrix[i].length - 1; j++)
					matrix[i][j] = value++;
			}

		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.printf("%4d",matrix[i][j]);
			System.out.println();


		}
	}
}
