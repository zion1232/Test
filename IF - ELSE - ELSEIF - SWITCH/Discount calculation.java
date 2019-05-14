	Scanner s = new Scanner(System.in);
	int Sum, Products, Dis1, Dis2;
	System.out.println("Enter the sum of the products");
	Sum=s.nextInt();
	System.out.println("Enter the products");
	Products=s.nextInt();
	Dis1 = Sum - (Sum / 300) * 50;
	if (Products >= 3)
		Dis2 = (int) (0.8 * Sum);
	else
	{
		Dis2 = Sum;
	}
	if (Dis1 < Dis2)
		System.out.println("please pay " + Dis1 + "NIS after dicount 1\n");
	else
	{
		System.out.println("please pay " + Dis2 + "NIS after dicount 2\n");

	}
	}
	
}
