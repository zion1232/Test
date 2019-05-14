package test;

import java.util.Scanner;
/*לקלוט 10 מספר וחפספור כמה אי זוגיים*/
public class for10 {
	public static void main(String[] args) {
	int number;
	System.out.println("enter  number");
	Scanner s = new Scanner (System.in);
	number=s.nextInt();
	for(int i =1;i<=number;i++) {
		System.out.println(i);

		if(i%7==0) {
			System.out.println("boom =>"+i);
		}

	}
	}

}


/*להדפיס מספר כפולה של 7 בBOOM*/
