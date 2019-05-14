package test;

import java.util.Scanner;

public class distance {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		double x1,y1,x2,y2;
		System.out.println("4 number");
		x1=s.nextDouble();
		y1=s.nextDouble();
		x2=s.nextDouble();
		y2=s.nextDouble();
		float dist=dis(x1,y1,x2,y2);
		System.out.printf("the distans %f",dist);
		
	}
	public static float dis(double x1,double y1,double x2,double y2) {
		double xd;
		double yd;
		float result;
		xd=Math.pow(x2-x1,2);
		yd=Math.pow(x2-x1,2);
		result=(float) Math.sqrt(xd+yd);
		return result;

}
	/*חישוב מרחק בין 2 נקדות פונקתיה*/

}