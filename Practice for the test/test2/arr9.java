package test2;

import java.util.Scanner;

public class arr9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		char[] str = new char[10];
		boolean hasAppear;
		
		System.out.printf("enter %d chars", str.length);
		for (int i = 0; i < str.length; i++) 
			str[i] = s.next().charAt(0);
			
			
			System.out.println("chars = ");
			for (int i = 0; i < str.length; i++) {
				hasAppear = false;
				for (int j = 0; j < i && !hasAppear; j++) {
					if (str[i] == str[j])
						hasAppear = true;
				}
				if (!hasAppear) {
					System.out.println(str[i]);
					count++;
				}
			}

			System.out.printf("the wera difrent leters - %d  " , count);

		
	}
}

/* כמה תווים שונים יש במערך */