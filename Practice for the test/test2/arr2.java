package test2;

import java.util.Scanner;

public class arr2 {

	public static void main(String[] args) {
		int[] arr = { 3, 15, 8, 10 };
		System.out.printf("there are %d number in arr \n", arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + ":");
			for(int j=0;j<arr[i];j++) 
				System.out.print("*");
			System.out.println();

		}

	}
}

/*הדפסץ היטוגרמה מערך*/