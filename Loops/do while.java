		Scanner scan = new Scanner(System.in);

		do
		{
			System.out.print("enter 3 numbers");
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();

			d = a + b + c;
			System.out.print("sum = " + d + " , To continue press 1 to finish press negative number");
			k=scan.nextInt();
			System.out.print(k);

		} while (k>=0);

}
}
