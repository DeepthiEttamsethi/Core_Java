package Array;

import java.util.Scanner;

public class Array_Prime {

			public static void main(String[] args) { 
				try (Scanner obj = new Scanner(System.in)) {
				
				
				int[] prime = new int[10]; 
				
				int i,c,j;
				
				System.out.println("Enter 10 integer value to array ");
				
				for(i=0;i<10;i++)
				{
					System.out.print("prime["+i+"]: ");
					prime[i]= obj.nextInt();
				}
				
				System.out.println("List of prime numbers in the Array\n");
				
				for(i=0;i<10;i++)
				{
					
					c=0;
					
					for(j=2;j<prime[i];j++)
					{
						if(prime[i]%j==0) {
							c++;
						break;}
					}
					
					if(c==0)
						System.out.print(prime[i]+"  ");
				}

	    }

    }
}