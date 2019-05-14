package test;

import java.util.Scanner;
/*לקלוט 10 מספר וחפספור כמה אי זוגיים*/
public class for8 {
	public static void main(String[] args) {
	int number,c=0;
	System.out.println("enter  number");
	Scanner s = new Scanner (System.in);
	number=s.nextInt();
	for(int i = 1; i<=number;i++) {
		if (i%3==0) 
		System.out.println(i);

	}
/*להדפיס מספר כפולה של 3 בסדר עולה*/
	}

}