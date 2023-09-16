package Loop;
import java.util.Scanner;
public class Menudriven{

	public static void main(String[] args) {
		while(true) {
			System.out.println("1.find factorial");
			System.out.println("2.check for Armstrong");
			System.out.println("3.check for perfect number");
			System.out.println("4.Exit");
			int choice;
			
			try (Scanner obj = new Scanner(System.in)) {
			System.out.println("Enter your choice 1...4");
			choice=obj.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					int i,fact=1;  
					  int number=5;//It is the number to calculate factorial    
					  for(i=1;i<=number;i++){    
					      fact=fact*i;    
					  }    
					  System.out.println("Factorial of "+number+" is: "+fact);    
	                break;

				}
				case 2:
				{
					int n,rem,sum=0,a = 0;
					System.out.println("Enter a number");
					Scanner sc=new Scanner(System.in);
					n= sc.nextInt();
					while(n>0)
					     {
					        rem=n%10;
					        sum=sum+ rem*rem*rem;
					        n=n/10;
					     }
					           if(a==sum)
					              System.out.println("Armstrong Number");
					            
					            else
					            System.out.println("Not an Armstrong Number");
					            break;
					 
			   }
				case 3:
				{
					Scanner sc=new Scanner(System.in);
	        		int num,i,sum=0;
	        		
	        		System.out.println("Enter the number");
	        		num=sc.nextInt();
	        		
	        		for(i=1;i<num;i++)
	        		{
	        		   if(num%i==0)
	        		   {
	        			   System.out.println(i);
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
	        		break;
				}
				case 4:
				{
					System.out.println("Program ended");
					System.exit(0);
				}
				default:
				{
					System.out.println("Invalid Choice");
				}
			}
		   }
		}
	}
}