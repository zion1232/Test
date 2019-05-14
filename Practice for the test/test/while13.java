package test;

import java.util.Scanner;

public class while13 {

	public static void main(String[] args) {
		int count = 1, num;
		Scanner s = new Scanner(System.in);
		int x = (int) (Math.random() * 1000);
		System.out.println("נחש את המספר");
		//System.out.println(x);

		while (true) {
			num = s.nextInt();
			if (num == x) {
				System.out.println("כל הכבוד ניחשת את המספר" + x);
				System.out.println("מספר הניחושים שנשחשת הוא - " + count);
				break;

			} else {
				count++;
				if (num >= x) {
					System.out.println("תנסה מספר קטן יותר");

				}
				if (num <= x) {
					System.out.println("תנסה מספר גדול יותר");

				}
			}

		}

	}
}

/* משחק נחש מספר */





