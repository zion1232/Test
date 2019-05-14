package test2;

import java.util.Scanner;

public class arr8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num, numbers[] = new int[10];
		System.out.print("enter number");
		num = s.nextInt();
		while (num > 0) {
			numbers[num % 10]++;
			num /= 10;
		}
		int max = 0;
		for (int i = 0; i < 10; i++)
			if (numbers[i] > numbers[max])
				max = i;
		
		System.out.println("the digi that appears most is - " + max);

	}

}
/*הספרה שמוםייע הכי הרבה פעמים*/