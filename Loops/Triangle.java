		
		Triangle rtl
    
		Scanner s = new Scanner(System.in);
		int i, j, base;
		System.out.println("enter base");
		base=s.nextInt();
		for (i = 1; i <= base; i++)
		{
			for (j = 1; j <= i; j++)
				System.out.print("*");
			System.out.print("\n");

		}
	}
}		
		
	
Triangle ltr		

Scanner s = new Scanner(System.in);
int i, j, base;
System.out.println("enter base");
base=s.nextInt();
for (i = 1; i <= base; i++)
{
	for (j = 1; j <= base-i; j++)
		System.out.print(" ");
	for (j = 1; j <= i; j++)
		System.out.print("*");
	System.out.print("\n");

    }
  }			
}	
		
		
	
