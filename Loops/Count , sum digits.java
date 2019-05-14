/*Count digits in a number*/
	public static void main(String[] args) {
		int num, c=0;
		Scanner s= new Scanner(System.in);
		num=s.nextInt();
		while(num!=0)
		{
			
			num=num/10;
			c++;
		}
		System.out.println(c);
	}
}


/*sum the digits*/
	public static void main(String[] args) {
		int num, sum=0,temp;
		Scanner s= new Scanner(System.in);
		num=s.nextInt();
		while(num>0)
		{
			temp=num%10;
			sum=sum+temp;
			num=num/10;
			
		}
		System.out.println(sum);
	}
}

