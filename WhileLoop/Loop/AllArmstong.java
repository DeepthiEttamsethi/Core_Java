package Loop;
import java.util.Scanner;
public class AllArmstong {

	public static void main(String[] args) {
	try (Scanner obj = new Scanner(System.in)) {
		
		int i, num, r, sum;
		
		for(i=1;i<=100000;i++)
		{
			sum=0;
			num=i;
			
			while(num>0)
			{
				r=num%10;
				sum=sum+(r*r*r);
				num/=10;
				
			}
			if(sum==i)
				System.out.println(i);
			
		}
		
		
	}
}
}
