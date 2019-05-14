package test;

import java.util.Scanner;
/*לקלוט 10 מספר וחפספור כמה אי זוגיים*/
public class for9 {
	public static void main(String[] args) {
	int number;
	System.out.println("enter  number");
	Scanner s = new Scanner (System.in);
	number=s.nextInt();
	for(int i=number;i>=1;i--) {
		if(i%3==0)
		System.out.println(i);
	}
/*להדפיס מספר כפולה של 3 בסדר יורד*/
	}

}