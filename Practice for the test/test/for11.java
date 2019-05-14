package test;

import java.util.Scanner;
/*לקלוט 10 מספר וחפספור כמה אי זוגיים*/
public class for11 {
	public static void main(String[] args) {
	int number;
	System.out.println("enter  number");
	Scanner s = new Scanner (System.in);
	number=s.nextInt();
	System.out.println("\n\nDivided by 3 & 5: ");			
	for (int i=1; i<=number; i++) {
		if (i%3==0 && i%5==0 ) System.out.print(i +", ");			
	}
	System.out.println("\n");
	}
}

/*כפולות 3ו5*/
