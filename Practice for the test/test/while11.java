package test;

import java.util.Scanner;

public class while11 {

	public static void main(String[] args) {
		int num, maxdigit = 0, digitmax = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		num = s.nextInt();
		while(num>0) {
			digitmax=num%10;
			if(digitmax>maxdigit)
			{
				maxdigit=digitmax;
			}
			num/=10;
		}
		System.out.println(maxdigit);

	}
}
/*לקלוט מספר בעל מספר ספרות ולראות מה הספרה הכי גדולה */