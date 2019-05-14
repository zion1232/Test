	@@@Print a number from the end to the beginning@@@

	Scanner s = new Scanner(System.in);
	int num, temp, newnumber=0;
	System.out.println("Enter number ");
	num=s.nextInt();
	temp = num;
	while(temp!=0)
	{
		newnumber *= 10;
		newnumber += temp % 10;
		temp /= 10;
	}
	System.out.println("the reversed of " +num + " is \n" +  newnumber);
	
}
}
	
		###add the number$$$
		
		Scanner s = new Scanner(System.in);
		int num,addnumber , newnumber = 0;
		System.out.println("Enter number ");
		num=s.nextInt();
		System.out.println("Enter a digit you want to add to the end of the number ");
		addnumber=s.nextInt();
		newnumber=num * 10 + addnumber;
		System.out.println("Your number is " + num + ". You have chosen to add the number " + addnumber +". Your final number is \n" + newnumber);
		
	}
	}
		$$$only the odd  number$$$
		
		int num, temp, newnumber = 0, location = 1;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter number ");
		num=s.nextInt();
		temp = num;
		while (temp>0)
		{
			int digit = temp % 10;
			if (digit % 2 == 1)
			{
				newnumber += digit*location;
				location *= 10;
			}
			temp /= 10;
		}
		System.out.println("orgin number is" + num + ". and only the odd  number are \n " + newnumber);

	}
}
		
		
		
		###only the even  number###
		
		int num, temp, newnumber = 0, location = 1;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter number ");
		num=s.nextInt();
		temp = num;
		while (temp>0)
		{
			int digit = temp % 10;
			if (digit % 2 == 0)
			{
				newnumber += digit*location;
				location *= 10;
			}
			temp /= 10;
		}
		System.out.println("orgin number is" + num + ". and only the even number are \n " + newnumber);

	}
}
