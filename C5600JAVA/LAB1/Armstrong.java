package LAB1;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
			
	int num, sum=0, r, num1,num2, count=0, multiply;
			
	System.out.println("Enter your number to Check for Armstrong");
			
	num = obj.nextInt();
			
	num2=num1 =num;
			
	while(num1>0)
	{
		num1=num1/10;
		count++;
	}
			
	while(num>0)
	{
		r=num%10;
				
		multiply=1;
		for(int j=1;j<=count;j++)
		multiply = multiply * r;
		sum=sum+multiply;
		num=num/10;
				
	}
			
	//System.out.println("sum="+sum);
	if(sum==num2)
	System.out.println("Given number is Armstrong");
	else
	System.out.println("Given number is NOT Armstrong");
			
		}
}