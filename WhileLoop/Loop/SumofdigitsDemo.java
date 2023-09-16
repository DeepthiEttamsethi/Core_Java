package Loop;

import java.util.Scanner;

public class SumofdigitsDemo {

	public static void main(String[] args) {
	
		
		int num, sum=0, r;
				
		try (Scanner obj = new Scanner(System.in)) {
				
		System.out.println("Enter a number to find sum of Digits");
		num=obj.nextInt();
				
		while(num>0)
		{
			r=num%10;  
			sum+=r; 
			num=num/10;   
		}
				
		System.out.println("Sum of Digits "+ sum);
				
				
		}
	}
}



