package targilim2;

import java.util.Scanner;

public class targil3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter The Number Of Matrix Rows");

		int matrixRow = scan.nextInt();

		System.out.println("Enter The Number Of Matrix Columns");

		int matrixCol = scan.nextInt();
		int[][] matrix = new int[matrixRow][matrixCol];
		// Enter Matrix Data
		enterMatrixData(scan, matrix, matrixRow, matrixCol);

		// Print Matrix Data
		printMatrix(matrix, matrixRow, matrixCol);
	}

	public static void enterMatrixData(Scanner scan, int[][] matrix, int matrixRow, int matrixCol) {

		for (int i = 0; i < matrixRow; i++) {
			for (int j = 0; j < matrixCol; j++) {
				System.out.printf("Enter Matrix Data %d %d = >", i + 1, j + 1);

				matrix[i][j] = scan.nextInt();
			}
		}
	}

	public static void printMatrix(int[][] matrix, int matrixRow, int matrixCol) {
		System.out.println("Your Matrix is : ");

		for (int i = 0; i < matrixRow; i++) {
			for (int j = 0; j < matrixCol; j++) {
				System.out.print(matrix[i][j] + "\t");
			}

			System.out.println();
		}
	}
}


/*קליטת מספרים למטריצה*/