package test;

import java.util.Scanner;

public class while4 {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int num,sum=0,c=0;		    
double even = 0;
double odd = 0;

System.out.println("ho nuber to ceak");
num=s.nextInt();
System.out.println("Now enter " + num + " integers:    --- 0 to stop");
while(num >= 0) {
     num = s.nextInt();
    if(num > 0) {
       if (num % 2 == 0)
         even++;
       else  
         odd++;
   }
   num--;
  }

  System.out.println("You entered " + odd + " odd numbers and " + even + " even numbers.");
	}
}
/*כמה הוקדל זוגי וכמה אי זוגי*/
