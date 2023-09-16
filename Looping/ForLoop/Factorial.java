package ForLoop;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
	     
	    int i,j,n;
        long fact=1;
	    long sum=0;

	     System.out.print("Enter n value");
	     n= obj.nextInt();

	      for(i=1;i<=n;i++)
	      {
	    	 fact=1; 
	         for(j=1;j<=i;j++)
	         {
	             fact=fact*j;
	         }
	          sum=sum+fact;
	          System.out.print(fact+" ! + ");
	     }
	    System.out.println("\n sum of above series"+sum);
	}

	}
}

