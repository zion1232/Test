	final static double PRICE_FOR_START  = 10.20;
	final static double PRICE_FOR_KILOMETER = 1.30;
	final static int PRICE_FOR_BAG  = 2;

	public static void main(String[] args) {
		int b;
		double total,k;
		Scanner scan = new Scanner(System.in);
		System.out.println("How far you have to travel in kilometers?");
		k=scan.nextDouble();
		System.out.println("How many bags do you have?");
		b=scan.nextInt();
		total=b*PRICE_FOR_BAG+k*PRICE_FOR_KILOMETER+PRICE_FOR_START;
		System.out.println("You need to pay " + total + " NIS");

		
		
/*An exercise for calculating a taxi ride*/
