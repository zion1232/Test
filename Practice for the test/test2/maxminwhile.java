package test2;

import java.util.Scanner;

public class maxminwhile {

	public static void main(String[] args) {
	    int min = 0;
	    int max = 0;
	    int num;
	    Scanner input = new Scanner(System.in);
	    System.out.println("how many number you want to enter");
	    int n = input.nextInt();
	    System.out.printf("enter %d numer => \n",n);
	    System.out.printf("enter numer 1 => \n");

	    num = input.nextInt();
	    min = num;
	    for (int i = 2; i <=n; i++) {
		    System.out.printf("enter %d numer \n",i);

	        num = input.nextInt();
	        if (num > max) {
	        	max = num;
	        }
	        if (num < min) {
	        	min = num;
	        }
	    }
	    System.out.println("the largest is:" + max);
	    System.out.println("Smallest no is : " + min);
	 }
	}
/*מציאת מינימום ומקסימום     אנחנו מתחיל לספור בלולאה ממספר שתיים כי ה1 זה המספר שאנחנו רוצים לדעת כמה אנחנו מחפשים*/