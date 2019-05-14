package test2;

import java.util.Scanner;

public class maxminarr {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	    System.out.println("how many number you want to enter");
		int num = s.nextInt();
	    System.out.printf("enter %d numer => \n",num);

		int[] a = new int[num];
		for (int i = 0; i < a.length; i++)
			a[i] = s.nextInt();
		int max = a[0];
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			 if (a[i] < min) {
		        	min = a[i];
		        }

		}

	    System.out.println("the largest is:" + max);
	    System.out.println("Smallest no is : " + min);
/*מינום מקסימום מערך*/

	}
}