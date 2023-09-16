package Loop;
import java.util.Scanner;
public class AllArmstrong_No {

	public static void main(String[] args) {
	try (Scanner obj = new Scanner(System.in)) {
		
		int i, num, r, sum, count=0, multiply;
		
		for(i=10;i<=100000;i++)
		{
			sum=0;
			num=i;
			count=0;
			
			while(num>0) 
				
			{
				num=num/10;
				count++;
			}
			num=i;
			while(num>0)
			{
				r=num%10;
				
				multiply=1;
				for(int j=1;j<=count;j++)
					multiply = multiply * r;
				
				sum=sum+(multiply);
				num/=10;
				
				
			}
			if(sum==i)
				System.out.println(i);
			
		}
		
	}
  }
}