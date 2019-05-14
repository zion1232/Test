import java.util.Scanner;

public class Calculator {/*The program asks the user to pick up 4 numbers to make them fracture and calculate
*/

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);/*import Scanner*/
		System.out.println("Please enter 4 integers");
		System.out.println("Please enter the numerator of fraction 1 :");/*Ask to receive 4 numbers*/
		int num1 = scan.nextInt();
		System.out.println("Please enter the denominator of fraction 1 :");
		int den1 = scan.nextInt();
		System.out.println("Please enter the numerator of fraction 2 :");
		int num2 = scan.nextInt();
		System.out.println("Please enter the denominator of fraction 2 :");
		int den2 = scan.nextInt();
		System.out.println(num1+"/"+den1+"+"+num2+"/"+den2+"="+(den1*den2/den1*num1+den1*den2/den2*num2)+"/"+den1*den2);/*Perform a connection operation*/
		System.out.println(num1+"/"+den1+"-"+num2+"/"+den2+"="+(den1*den2/den1*num1-den1*den2/den2*num2)+"/"+den1*den2);/*Perform subtraction*/
		System.out.println(num1+"/"+den1+"*"+num2+"/"+den2+"="+num1*num2+"/"+den1*den2);/*Perform a division operation*/
		System.out.println(num1+"/"+den1+":"+num2+"/"+den2+"="+num1*den2+"/"+num2*den1);/*Perform a multiplication operation*/


	}

}
