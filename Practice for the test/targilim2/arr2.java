package targilim2;

import java.util.Scanner;

public class arr2 {

	private static final int SIZE = 5;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int arr[]=new int[SIZE];
		int i,max;
		System.out.println("Please enter " + SIZE + " numbers : ");
		for (i = 1; i < SIZE; i++)
			arr[i]=scan.nextInt();	
		max=0;
		for (i = 1; i < SIZE; i++) {
			
			if (arr[i] > arr[max])
			max = i;
		
		}
			System.out.print("The max is at index " +max +" and its value is "  +arr[max]);
			
	}

}

/*באיזה אינדקס נמצא המספר הכי גדול*/