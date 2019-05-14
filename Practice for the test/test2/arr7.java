package test2;

import java.util.Scanner;

public class arr7 {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3 };
		int[] arr2 = new int[3];
		System.out.print("number in arr 2 now => ");
		System.out.println();

		for (int i = 0; i < arr2.length; i++)
			System.out.printf("%d ", arr2[i]);
		System.out.println();

		for (int i = 0; i < arr2.length; i++)
			arr2[i] = arr1[i];
		System.out.println("number in arr 2 now =>");
		for (int i = 0; i < arr2.length; i++)
			System.out.printf("%d ", arr2[i]);
		System.out.println();

	}

}
