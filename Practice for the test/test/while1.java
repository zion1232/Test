package test;

import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int num, c=0,sum=0;
System.out.println("enter grade - , -1 stop");
num=s.nextInt();
while(num!=-1) {
	sum +=num;
	c++;
	System.out.printf("enter grade - " );
	num=s.nextInt();
}
System.out.printf("averg of %d grade is %f , ",c,(float)sum/c);
	}

}

/*while חישבו ממוצע -1 לעצירת מספרים*/
