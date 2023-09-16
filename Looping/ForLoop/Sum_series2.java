package ForLoop;

import java.util.Scanner;

public class Sum_series2 {

	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int i,n;
			float x,sum=0;
			System.out.println("Program to find of 1/x-2/x+3/x......n/x");
			System.out.println("Enter x value");
			x=obj.nextFloat();
			System.out.println("Enter n value");
			n=obj.nextInt();
			for(i=1;i<=n;i++)
			{
				if(i%2==0)
				sum=sum-(float)i/x;
				else
				sum=sum+(float)i/x;;
			
			}
		
		System.out.println("sum of series: "+sum);
	}

  }
}