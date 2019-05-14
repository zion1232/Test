public static int numberodsamedigit(int number,int d) 
	{
		int c=0;
		while(number>0) {
			if(number%10==d)
				c++;
			number/=10;
		}
		return c;
	}
public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter number");
		int number =s.nextInt();
		System.out.println("enter digit");
		int d =s.nextInt();
		System.out.println(
		String.format("the digit %d apears in the number %d , %d tims" , d,number,numberodsamedigit(number,d)));

			}

		
}
