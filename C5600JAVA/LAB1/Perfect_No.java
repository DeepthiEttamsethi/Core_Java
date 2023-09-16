package LAB1;
import java.util.Scanner;
public class Perfect_No {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			
	int num,i,sum=0;
		
	System.out.println("Enter the number");
	num=sc.nextInt();
		
	for(i=1;i<num;i++)
	{
		if(num%i==0)
		{
			sum +=i;
		}
	}
	if(sum==num)
	{
		System.out.println("It is a perfect number");
		
	}
	else
	{
		System.out.println("It is not a perfect number");
	}
  }
}