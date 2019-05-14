package test;

import java.util.Scanner;

public class while12 {

	public static void main(String[] args) {
		int loc = 1, neunumber = 0, num,num2;
		Scanner s = new Scanner(System.in);
		System.out.println("enter 2 number 2 diget");
		num = s.nextInt();
		num2 = s.nextInt();
		while (num2 > 0) {
			neunumber +=num2%10*loc;
			loc*=10;
			neunumber +=num%10*loc;
			loc*=10;
			num2/=10;
			num/=10;
		}
		System.out.println(neunumber);


	}
}
/* לקלוט 2 מספרים ולהפוך אותם למספר */