package targilim;

import java.util.Scanner;

public class targil3 {

	public static void main(String[] args) {
		/*
		 Scanner in = new Scanner(System.in);
	        System.out.print("Input the number: ");
	        int n = in.nextInt();
	        for (int i = n; i > 0; i--) 
	        {
	            for (int spc = n - i; spc > 0; spc--) 
	            {
	                System.out.print(" ");
	            }
	            for (int j = 0; j < i; j++) 
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        /*לקלוט מספר ולהדפיס כוכביות למטה
		
		*/
		
		
		/*
		  int no_row,c=1,blk,i,j;
		    System.out.print("Input number of rows: ");
		    Scanner in = new Scanner(System.in);
				    no_row = in.nextInt();
		    for(i=0;i<no_row;i++)
		    {
		        for(blk=1;blk<=no_row-i;blk++)
		        System.out.print(" ");
		        for(j=0;j<=i;j++)
		        {
		            if (j==0||i==0)
		                c=1;
		            else
		               c=c*(i-j+1)/j;
		            System.out.print(" "+c);
		        }
		        System.out.print("\n");
		    }
		}
		}
		
		
		
		
		  
		{
		   int i,j,r;
		   System.out.print("Input number of rows (half of the diamond) : ");
		   Scanner in = new Scanner(System.in);
				    r = in.nextInt();
		   for(i=0;i<=r;i++)
		   {
		     for(j=1;j<=r-i;j++)
		     System.out.print(" ");
		     for(j=1;j<=2*i-1;j++)
		       System.out.print("*");
		     System.out.print("\n");
		   }
		 
		   for(i=r-1;i>=1;i--)
		   {
		     for(j=1;j<=r-i;j++)
		     System.out.print(" ");
		     for(j=1;j<=2*i-1;j++)
		       System.out.print("*");
		     System.out.print("\n");
		   }
		 
		}
	}/*להדפיס יהלומים
		}
		
		*/
		
		
		
		{
			   int i,j,n,p,q;
			  System.out.print("Input number of rows : ");
			   Scanner in = new Scanner(System.in);
					    n = in.nextInt();

			   for(i=1;i<=n;i++)
			   {
			     if(i%2==0)
			     { p=1;q=0;}
			     else
			     { p=0;q=1;}
			      for(j=1;j<=i;j++)
				 if(j%2==0)
				    System.out.print(p);
				 else
				    System.out.print(q);
			     System.out.println("");
			   }
			}
			}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		