package mmn11;

import java.util.Scanner;/*Name of the expansion pack. In case of receiving input from the user
*/

public class Line {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in); /*This initializes a variable called the Scanner scan, through which we can get information from the user.*/
		System.out.println("enter 4 integers");/*Ask a user to give us 4 entries*/
		System.out.println("enter x1");
		int x1=scan.nextInt();
		System.out.println("enter y1");
		int y1=scan.nextInt();
		System.out.println("enter x2");
		int x2=scan.nextInt();
		System.out.println("enter y2");
		int y2=scan.nextInt();
		System.out.println("A point = " + x1 + ","  + y1 	);/*We will represent the points*/
		System.out.println("B point = " + x2 + ","  + y2 	);
		System.out.println("The length of the line between the points " + ((x1 + "," +y1)) + " and " + (x2 + "," + y2) + " is " + Math.sqrt( Math.pow(x1-x2,2) + Math.pow(y1-y2,2) )  );
/*We will perform the mathematical operations and help MATH methods
*/

	}

}