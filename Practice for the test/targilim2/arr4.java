package targilim2;

import java.util.Scanner;

public class arr4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("How many numbers do you want to receive\n");

		int x = s.nextInt();
		System.out.printf("enter %d number \n", x);

		int[] arr = new int[x];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();

		}

		System.out.printf("the numbers are => ");
		for (int i = 0; i < arr.length; i++)
			System.out.printf("%d,", arr[i]);
		System.out.println();
		System.out.printf("the even numbers are => ");
		for (int i = 0; i < arr.length; i++)
			if (arr[i] % 2 == 0) {
				System.out.printf("%d,", arr[i]);

			}
		System.out.println();

		System.out.printf("the even numbers  are => ");
		for (int i = 0; i < arr.length; i++)
			if (arr[i] % 2 == 0) {
				arr[i]++;
				if (arr[i] % 3 == 0) {
					arr[i]--;
					System.out.printf("%d,", arr[i]);

				}

			}
	}
}
/* קךיטת מספרים למערך והדפסת זוגי ואי זוגי */