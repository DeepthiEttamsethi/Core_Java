package Loop;
import java.util.*;
public class Reverse {

	   public static void main(String[] args) {
	   try (Scanner obj = new Scanner(System.in)) {
		
		int num, num1, r, reverse=0;
		
		System.out.println("Enter your number to Check for Armstrong");
		
		num = obj.nextInt();
		num1=num;
		while(num>0)
		{
			r=num%10;
			reverse= (reverse*10) +r;
			System.out.print(r);
			num/=10;
		}
		System.out.println("reverse of the digits "+ reverse);
		
		if(reverse==num1)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
  }
}
