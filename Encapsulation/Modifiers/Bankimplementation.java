package Modifiers;
import java.util.*;
public class Bankimplementation {

	public static void main(String[] args) {
		Bank obj = new Bank();
		
		int choice;
		Scanner ob = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. New Account");
			System.out.println("2. Get Deposits");
			System.out.println("3. Withdraw");
			System.out.println("4. Check balance");
			System.out.println("5. Exit");
			
			System.out.println("\n\nEnter your choice between 1 to 5");
			choice=ob.nextInt();
			
			switch(choice)
			{
				case 1:
					obj.addnewaccount();
					break;
				case 2:
					obj.getDeposits();
					break;
				case 3:
					obj.getwithdraw();
					break;
				case 4:
					obj.checkbalance();
					break;
				default:
					System.out.println("\nInvalid choice! enter between 1 to 5");
					break;
				case 5:
					System.exit(0); // to terminate the execution of a program
			}
			
		}
		
	}
}