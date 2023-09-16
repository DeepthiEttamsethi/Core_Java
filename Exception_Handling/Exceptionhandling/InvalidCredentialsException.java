package Exceptionhandling;
import java.util.*;
public class InvalidCredentialsException extends Exception {
	
	//member variable to store our custom message
	String msg;
	InvalidCredentialsException(String msg)
	{
		//passing the parameter to the super class constructor
		super(msg);
		this.msg=msg;
	}
	//overriding with our custom message
	@Override
	public String toString() 
	{
		return msg;
	}
	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
	String id = sc.next();
	String password = sc.next();
	try 
	{
		if(id.equals("user1") && password.equals("1234"))
		System.out.println("valid username");
		else
		{
			throw new InvalidCredentialsException("no such user with username - "+id);
		}
	}
	catch(InvalidCredentialsException ex)
	{
		//calls override toString() method
		System.out.println(ex);
		//prints message passed to the super constructor
		// System.out.println(ex.getMessage());
				 }
			}
	}
}