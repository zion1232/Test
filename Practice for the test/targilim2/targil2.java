package targilim2;

import java.util.Scanner;

public class targil2 {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("how many lines:?");
		int lines=s.nextInt();
		int[][]number=new int[lines][];
		for(int i=0 ; i<number.length;i++) {
			System.out.println("how many  elemnt in lines " + (i+1) + "?");
			int colos=s.nextInt();
			number[i]=new int[colos];

			
		}
		
		
		
		
		
	}
	

}