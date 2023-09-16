package LAB1;
import java.util.*;
public class All_Perfect_Nos {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
			
	System.out.println("Enter Start and End Range ");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
			 
	System.out.println("perfect numbers are: ");
			 
	for(int i=num1;i<=num2;i++)
	{
		int n=i;
		int sum=0,factor=1;
		while(factor<n)
		{
			if((n%factor)==0)
			{
				sum=sum+factor;
			}
		    factor++;
					
	    }
		if(sum==i)
		{
		   System.out.println(i+" ");
		}
	}
  }
}