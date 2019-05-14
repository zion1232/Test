package fonction;

import java.util.Scanner;

public class fonction1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int base;
		char ch;
		System.out.println("enter base ans cahr");
		base = s.nextInt();
		ch = s.next().charAt(0);
		printtri(base, ch);

	}

	private static void printtri(int base, char ch) {
		for (int i = 1; i <= base; i++)
			printLine(i, ch);
	}

	private static void printLine(int leng, char ch) {
		for (int i = 1; i <= leng; i++)
			System.out.print(ch);
		System.out.println();

	}

}
