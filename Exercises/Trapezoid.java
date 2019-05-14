package mmn11;


import java.util.Scanner; /*Name of the expansion pack. In case of receiving input from the user
*/

public class Trapezoid {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);/*This initializes a variable called the Scanner scan, through which we can get information from the user.*/
		System.out.println("enter 6 integers");/*Ask a user to give us 6 entries*/
		System.out.println("enter Ax");
		int Ax=scan.nextInt();
		System.out.println("enter Ay");
		int Ay=scan.nextInt();
		System.out.println("enter Length of section");
		int AB=scan.nextInt();
		System.out.println("enter Dx");
		int Dx=scan.nextInt();
		System.out.println("enter Dy");
		int Dy=scan.nextInt();
		System.out.println("enter Length of section");
		int DC=scan.nextInt();
		int h=Math.abs(Dy-Ay);
		System.out.println("The area of the trapezoid is = " + ((AB+DC)*h)/2);/*We will find the height of the trapezius and is considered the area
*/
		double AD= (double) (Math.sqrt(Math.pow(Ax-Dx,2) + Math.pow(Ay-Dy,2))) ; /*We will find the missing points using the existing data*/
		int Cx = Dx+DC ,  Cy=Dy ,  Bx= Ax+AB , By=Ay;
		double CB= (double) (Math.sqrt(Math.pow(Cx-Bx,2) + Math.pow(Cy-By,2))) ;
		System.out.println("The perimeter of the trapezoid is = " + (AD+CB+DC+AB));/*We will perform the mathematical operations and help MATH methods*/
		

		
						
			

			}

		}

	