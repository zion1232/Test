import java.util.Scanner;

public class Triangle {/*Pick up numbers and check what kind of triangle*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y,z;
		System.out.println("enter the number :");/*Ask to receive 3 numbers to triangular */
		x = scan.nextInt();
		System.out.println("enter the number :");
		y = scan.nextInt();
		System.out.println("enter the number :");
		z = scan.nextInt();
		if(x+y>z&&x+z>y&&y+z>x)
		{
			if(x==y&&x==z&&y==z) 
					System.out.println("The numbers : " + x +" , " + y + " and " + z + " represent an equilateral triangular");/*if equilateral triangular*/
			if((x==y||x==z||y==z)&&!(x==y&&x==z&&y==z))
					System.out.println("The numbers : " + x +" , " + y + " and " + z + " represent an isoseles triangular");/*if isoseles triangular*/
			if(x>y&&x>z)
				if(z*z+y*y==x*x) 
					System.out.println("The numbers : " + x +" , " + y + " and " + z + " represent an right angle triangle");/*if right angle triangle*/
			if(y>x&&y>z)
				if(z*z+x*x==y*y) 
					System.out.println("The numbers : " + x +" , " + y + " and " + z + " represent an right angle triangle");/**/
			if(z>x&&z>y)
				if(x*x+y*y==z*z) 
					System.out.println("The numbers : " + x +" , " + y + " and " + z + " represent an right angle triangle");	/**/
				else
				System.out.println("The numbers : " + x +" , " + y + " and " + z + " represent an common triangle");	/*if common triangle*/
		}
		
		else {
			System.out.println("The numbers : " + x +" , " + y + " and " + z + " cannot represent a common  triangle");/*if cannot represent a common  triangle*/
		
		}
	
	}
}

		


