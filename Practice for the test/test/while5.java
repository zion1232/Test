package test;

import java.util.Scanner;

public class while5 {

public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("enter number 3 digit only");
int num = 0;
while(num >= 0) {
     num = s.nextInt();
 if(num>99 && num<1000) {
	System.out.println("good nuber");
	break;
 }
    else  
    	System.out.println("no good - enter number 3 digit only");
}
}
}

/*כל עוד לא הוקדל מספר 3 ספרות התוכנה לא עוצרת*/
