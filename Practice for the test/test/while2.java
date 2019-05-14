package test;

import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int num,sum=0;
System.out.println("enter numer - ");
num=s.nextInt();
while(num!=0) {
	sum +=num%10;
	num/=10;
}
System.out.println(sum);
	}

}

/*while חישוב סכום ספרות*/
