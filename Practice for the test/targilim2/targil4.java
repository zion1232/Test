package targilim2;

import java.util.Scanner;

public class targil4 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 1, 1, 1 ,2}, { 2, 2, 2, 2 ,3}, { 2, 4, 4, 2,4 }, { 7,5, 6, 5, 4 }, { 4,2, 6, 8, 7 } };

		System.out.println("The matrix is:");

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++)

				System.out.printf("%d\t", matrix[i][j]);

			System.out.println();

		}
		System.out.println();

		for (int i = 0; i < matrix[0].length; i++) {

			int sum = 0;

			for (int j = 0; j < matrix.length; j++)

				sum += matrix[i][j];

			System.out.printf("The sum of elements in rows #%d %d\n", i + 1, sum);
			

			

		}
		System.out.println();

		
		for (int i = 0; i < matrix[0].length; i++) {

			int sum = 0;

			for (int j = 0; j < matrix.length; j++)

				sum += matrix[j][i];

			System.out.printf("The sum of elements in column #%d %d\n", i + 1, sum);
		}

	}
}


/*לחשב שורות ועמדות במטריצה*/









