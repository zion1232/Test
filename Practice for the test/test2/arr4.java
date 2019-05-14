package test2;

import java.util.Scanner;

public class arr4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("enter  number of digit you wont \n");

		int x=s.nextInt();
		int[] arr =new int[x];
		int left,right;
		boolean isSymetric=true;
		System.out.printf("enter %d number \n",x);

		for(int i=0;i<arr.length;i++ ) 
			arr[i]=s.nextInt();
			
		for(left=0,right=arr.length-1;left<right && isSymetric;left++,right-- ) {
			if(arr[left]!=arr[right]) 
				isSymetric=false;
		}
			if(isSymetric)
				System.out.println("arry symtric");
			else 
				System.out.println("arry no symtric");


			
			
			
		}	
	

	
}
/*בדיקת האם מספר סימטרי*/


