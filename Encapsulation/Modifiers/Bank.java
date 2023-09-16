package Modifiers;
import java.util.*;
public class Bank {
	private long acno;
	private String cname, actype;
	private float deposit, withdraw, balance;
	
	public Bank() {} //default constructor
	
	
	public void addnewaccount()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter A/c Number ");
		acno=obj.nextLong();
		System.out.println("Enter customer Name");
		cname=obj.next();
		System.out.println("Enter Account Type (Savings/Current)");
		actype=obj.next();
		balance=0;
	}
	
	public void getDeposits()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("\nDeposit Entry\nEnter A/c Number ");
		acno=obj.nextLong();
		System.out.println("Enter customer Name");
		cname=obj.next();
		System.out.println("Enter Account Type (Savings/Current)");
		actype=obj.next();
		System.out.println("Enter Deposit amount");
		deposit=obj.nextFloat();
		
		balance = balance + deposit;
		
				
	}
	
	public void getwithdraw()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("\nWithdraw Entry\nEnter A/c Number ");
		acno=obj.nextLong();
		System.out.println("Enter customer Name");
		cname=obj.next();
		System.out.println("Enter Account Type (Savings/Current)");
		actype=obj.next();
		System.out.println("Enter customer Name");
		cname=obj.next();
		System.out.println("Enter Withdraw amount");
		withdraw=obj.nextFloat();
		if(withdraw<balance)
		{
			balance-=withdraw;
			System.out.println("Transaction completed...");
		}
		else
			System.out.println("Insufficient Balance!!!!");
		
	}
	
	public void checkbalance()
	{
		System.out.println("\nCheck balance\naccount number "+ acno);
		System.out.println("Customer Name "+ cname);
		System.out.println("Account Type "+ actype);
		System.out.println("Balance amount "+ balance);
	}

}