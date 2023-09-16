package String_Tokenizer;
import java.util.regex.*;
import java.util.*;
public class EmployeData {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name consists of 5 charecters");
		System.out.println("Enter a ID number");
	    String id=sc.next();
	    
	    System.out.println("Enter a Name ");
		String name=sc.next();
	    
	    System.out.println("Enter Mobile number");
	    String mobile=sc.next();
	    	
	    System.out.println(Pattern.matches("\\d\\d\\d\\d\\d",id));
	    System.out.println(Pattern.matches("^[a-z,A-Z]+$",name));
	    
	    if(Pattern.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d", mobile)) 
	    	System.out.println("valid mobile number"); 
	    
	    else 
	    	System.out.println("Invalid mobile number"); 

		}
}