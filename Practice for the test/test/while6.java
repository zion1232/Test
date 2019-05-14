package test;

import java.util.Scanner;

public class while6 {

public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("enter number 2 digit icvel");
int num = 0;
while(num >= 0) {
     num = s.nextInt();
 if(num/10==num%10) {
	System.out.println("good nuber");
	break;
 }
    else  
    	System.out.println("no good - enter number 2 digit icvel only");
}
}
}

/*כל עוד לא הוקדל מספר שספריות זהות התוכנית לא עוצרת*/
