package test;

import java.util.Scanner;
/*לקלוט 10 מספר וחפספור כמה אי זוגיים*/
public class for7 {
	public static void main(String[] args) {
	int number,c=0;
	Scanner s = new Scanner (System.in);
	System.out.println("enter 10 number");
	for(int i = 1; i<=10;i++) {
	number=s.nextInt();
	if(number%2==1)
		c++;
	}
	System.out.println(c);

	}

}