package targilim;

import java.util.Scanner;

public class targil5 {

	public static void main(String[] args) {

		 int n, sum = 0,total=0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	            sum = sum + a[i];
	        	total = total +a[i];
	        }
	        double average = total / a.length;

	        System.out.println("Sum:"+sum);
	        System.out.println("ave:"+average);

	    }
	}

/*חישבו סכום וממוצע מערך*/