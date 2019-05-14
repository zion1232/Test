
	final static double PRICE_FOR_PAPER = 5;
	final static double taxes  =1.18;
	final static double EXTRA_SIZE= 1.12;

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		double Box_width,Box_depth, Box_height,Box_size;
		double price, total_price;
		
		System.out.println("enter price");
		price=s.nextDouble();
		System.out.println("enter Box_width");
		Box_width=s.nextDouble();
		System.out.println("enter Box_depth");
		Box_depth=s.nextDouble();
		System.out.println("enter Box_height");
		Box_height=s.nextDouble();
		
		Box_size =  (Box_width*Box_height + Box_width*Box_depth + Box_height*Box_depth) * 2 * EXTRA_SIZE;/*You have to double it twice because it's a box with 6 corners*/
		total_price = price + Box_size * PRICE_FOR_PAPER;
		System.out.println("You need to pay " + total_price + " NIS");


	}

}
/*Calculate the price of a packaging product box and consider bottles including taxes*/
