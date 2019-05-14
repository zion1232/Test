package test;

import java.util.Scanner;

public class while7 {

public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("enter number 3 digit only diveision 7");
int num = 0;
while(num >= 0) {
     num = s.nextInt();
 if(num>99 && num<1000) {
	 if(num%7==0) {
	System.out.println("good nuber");
	break;
	 }
 }
}
}
}

/*כל עוד לא הוקדל מספר 3 ספרות שמתחלק ב7 התוכנה לא עוצרת*/
