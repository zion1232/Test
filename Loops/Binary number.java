binary number
	

	Scanner s = new Scanner(System.in);
	int num, loc = 1, binary = 0;
	System.out.println("Enter number ");
	num=s.nextInt();
	while (num>0)
	{
		int numleft = num % 2;
		num /= 2;
		binary += loc*numleft;
		loc *= 10;
	}
	System.out.println( binary);
	}
}
