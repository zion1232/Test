package targilim2;

import java.util.Scanner;

public class arr5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		char[] str = new char[3];
		System.out.printf("enter  char");
		char a = s.next().charAt(0);
		System.out.printf("char => %c",a);
		System.out.println();

		System.out.println("enter chars");
		System.out.println();

		for (int i = 0; i < str.length; i++) 
			str[i] = s.next().charAt(0);
			System.out.println("chars = ");
			for (int i = 0; i < str.length; i++)

		if(a==str[i]) {
			count++;
				System.out.println(count);

}
	}
}