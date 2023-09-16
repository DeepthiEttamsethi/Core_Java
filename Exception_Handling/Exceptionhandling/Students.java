package Exceptionhandling;
import java.util.*;
public class Students {
	private int id;
	private String sname;
	
	
	public void getdata ()throws Exception
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter id and Name of a student ");
		id=obj.nextInt();
		sname= obj.next();
	
	}

}