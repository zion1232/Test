package test;

import java.util.Scanner;

public class azert {

	public static void main(String[] args) {
		int fa=1;
		/*חישבו עצרת*/
		int num = (int)(Math.random()*10);
		System.out.println("tje random nuber is " + num);
		for(int i=1;i<=num;i++) {
			fa *=i;
		}
		System.out.printf("%d! = %d " , num,fa);
	}

}