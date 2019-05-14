package test;

import java.util.Scanner;

public class while10 {

	public static void main(String[] args) {
		int loc = 1, neunumber = 0, num;
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		num = s.nextInt();
		int temp = num;
		while (temp > 0) {
			if(temp%10%2==1) /*0*/
			{
				neunumber = neunumber+temp%10*loc;
				loc*=10;
			}
			temp/=10;
		}
		System.out.println(neunumber);


	}
}
/*לקלוט מספר כלשהו ולהציג רק את הזוגי או האי*/