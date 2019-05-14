package test;

public class powers {

	public static void main(String[] args) {
int num = (int)(Math.random()*20);
System.out.printf("all 2 powers till %d : '\n" , num);
for(int i=1, j=0;i<=num;i*=2,j++) {
	System.out.printf("2^%d = %d\n",j,i);
}
	}
}
/*הדפסת חזקות*/