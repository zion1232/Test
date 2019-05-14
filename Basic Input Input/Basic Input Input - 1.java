import java.util.Scanner; /*Command to use the SCAN command*/

public class a1 {
	final static int PRICE_FOR_TICKET = 35;/*constant variable*/

	public static void main(String[] args) {
		int t,p;
		Scanner scan = new Scanner(System.in);
		System.out.println("hiw mach tickets you buy? ");
		t=scan.nextInt();
		p=t*PRICE_FOR_TICKET;
		System.out.println("You need to pay " + p + " NIS");

		
		/*Exercise to buy tickets*/

	}

}
