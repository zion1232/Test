	final static int SIZE  = 5;


	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int arr[]=new int[SIZE];
		int i;
		System.out.println("Please enter " + SIZE + " numbers : ");
		for (i = 0; i < SIZE; i++)
			arr[i]=scan.nextInt();		
		System.out.println("The numbers are : ");
		for (i = 0; i < SIZE; i++)
			System.out.print(","+ arr[i]);

		System.out.println("\nThe numbers from the end to the beginning : ");
		for (i = SIZE-1; i >=0 ; i--)
			System.out.print("," + arr[i]);
		
		
		

	}

}
