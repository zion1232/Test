		Scanner scan = new Scanner(System.in);
		int arr[]=new int[SIZE];
		int i,max;
		System.out.println("Please enter " + SIZE + " numbers : ");
		for (i = 0; i < SIZE; i++)
			arr[i]=scan.nextInt();	
		max=0;
		for (i = 0; i < SIZE; i++) {
			
			if (arr[i] > arr[max])
			max = i;
		
		}
			System.out.print("The max is at index " +max +" and its value is "  +arr[max]);
			
	}

}


		Scanner scan = new Scanner(System.in);
		int arr[]=new int[SIZE];
		int i,min;
		System.out.println("Please enter " + SIZE + " numbers : ");
		for (i = 0; i < SIZE; i++)
			arr[i]=scan.nextInt();	
		min=0;
		for (i = 0; i < SIZE; i++) {
			
			if (arr[i] < arr[min])
			min = i;
		
		}
			System.out.print("The max is at index " +min +" and its value is "  +arr[min]);
			
	}

}

