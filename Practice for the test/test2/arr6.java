package test2;

import java.util.Scanner;

public class arr6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final int EXIT = -1;
		int arrday[] = new int[7], day, maxday;

		do {
			System.out.printf("enter the day you like most (1-7, args), %d to EXIT", EXIT);
			day = s.nextInt();
			if (day != EXIT)
				arrday[day - 1]++;

		} while (day != EXIT);

		System.out.println("each day and number of [erson who likr it most:");
		for (int i = 1; i <= 7; i++)
			System.out.printf("%d : %d\n", i, arrday[i-1]);
		maxday = 0;

		for (int i = 1; i < 7; i++) {
			if (arrday[i] > arrday[maxday])
				maxday = i;
		}
		System.out.println("the favorite day is :  " + (maxday + 1));

	}

}
