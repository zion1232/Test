package test;

import java.util.Scanner;

public class while9 {

public static void main(String[] args) {
	int newnum=0;
	Scanner s = new Scanner (System.in);
	System.out.println("enter number");
	int num=s.nextInt();
	
	while(num>0){
		newnum*=10;
		newnum+=num%10;
		num/=10;
		
	}
	System.out.println(newnum);

}

}

/*לקחת מספר ולהפוח אותו*/
