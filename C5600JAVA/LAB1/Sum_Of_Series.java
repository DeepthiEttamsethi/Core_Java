package LAB1;
import java.util.*;
public class Sum_Of_Series {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int i,n;
		float x,sum=0;
	    System.out.println("Program to find of x-1/x+2/x-3/x….n/x");
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