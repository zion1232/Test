package fonction;

import java.util.Scanner;

public class fonction3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1, num2;
		System.out.println("enter 2 nuber");
		num1 = s.nextInt();
		num2 = s.nextInt();
		System.out.println( num1);
		System.out.println( num2);

	


}

	public static int max(int a, int b) {
	if(a>b)
		return a;
	 
		return b;
	}
}


