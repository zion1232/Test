package test2;

import java.util.Scanner;

public class arr3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("How many numbers do you want to receive\n");

		int x=s.nextInt();
		System.out.printf("enter %d number \n",x);

		int[] arr =new int[x];

		for(int i=0;i<arr.length;i++ ) {
			arr[i]=s.nextInt();
		}		System.out.printf("there are %d number in arr \n", arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + ":");
			for(int j=0;j<arr[i];j++) 
				System.out.print("*");
			System.out.println();

		}

	}
}

/*הדפסת היטוגרמה עם קלט*/