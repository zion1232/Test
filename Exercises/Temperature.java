import java.util.Scanner;

public class Temperature {


	public static void main(String[] args) {/*Check out what kind of degrees*/
		double f=0,c=0,k=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("");/*Choose a type of temperature*/
		char a =  scan.next().charAt(0);	
		if(a=='f'||a=='F') {
		f=scan.nextDouble();
		final double F_T_C = (f-32)*5/9;
		final double F_T_K = f*5/9+255.37;
	    System.out.println(F_T_C+"C");
		System.out.println(f+"F");
		System.out.println(F_T_K+"K");
		}
		if(a=='c'||a=='C') {
		c=scan.nextDouble();
		final double C_T_F = 32+c*9/5;
		final double C_T_K = c+273.15;
		System.out.println(c+"C");
		System.out.println(C_T_F+"F");
		System.out.println(C_T_K+"K");
		}
		if(a=='K'||a=='k') {
		k=scan.nextDouble();
		final double K_T_C = k-273.15;
		final double K_T_F = (k-273.15)*9/5+32;
		System.out.println(K_T_C+"C");
		System.out.println(K_T_F+"F");
		System.out.println(k+"K");
		}
	
	
	
	}

}
