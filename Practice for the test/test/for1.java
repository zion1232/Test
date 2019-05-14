package test;

import java.util.Scanner;

public class for1 {

	public static void main(String[] args) {
		int number = (int) (Math.random()*20);
		System.out.printf("%d \n", number);
		for(int i=number;i>=1;i--)
		{
			System.out.print(i + " ");
		}
		System.out.println();

		/*הדפסת מספרים בסדר יורד*/
	}
	

}