package Anudip;
import java.util.*;
public class Switch_Demo{

	public static void main(String[] args) {
		while(true)
		{
		System.out.println("\n\n*********");
		System.out.println("1. +ve/-ve");
		System.out.println("2. odd/even");
		System.out.println("3. divisable by 5 and 7");
		System.out.println("4. Eligible for vote");
		System.out.println("5. Exit");
		System.out.println("*********\n\n");
		
		int choice;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter your choice with 1..5 ");
		
		choice = obj.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter an integer ");
			int num = obj.nextInt();
			if(num>0)
				System.out.println("postive number");
			else
				System.out.println("negative number");
			break;
			
		}
		case 2:
		{
			System.out.println("Enter an integer ");
			int num = obj.nextInt();
			if(num%2==0)
				System.out.println("Even number");
			else
				System.out.println("Odd number");
			break;
		}
		case 3:
		{
			System.out.println("Enter an integer ");
			int num = obj.nextInt();
			if(num%5==0 && num%7==0)
				System.out.println("number / by 5 and 7");
			else
				System.out.println("number not / by 5 adn 7");
			break;
		}
		case 4:
		{
			System.out.println("Enter your age ");
			int num = obj.nextInt();
			if(num>=18)
				System.out.println("Eligible for vote");
			else
				System.out.println("Not eligible for vote");
			break;
		}
		case 5:
		{
			System.out.println("program ending....");
			System.exit(0); // exit from the program
		}
		default:
		{
			System.out.println("Invalid choice...");
		}
		}
		}
	}
}