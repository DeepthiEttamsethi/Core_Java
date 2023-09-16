package String;
import java.util.*;
public class Registration {

	public static void main(String[] args) {
	String stuname, rollno, mailid, mobile, qualification;
		
		
	try (Scanner obj = new Scanner(System.in)) {
		
		System.out.println("Enter rollno ");
		rollno = obj.next();
		System.out.println("Enter Your name ");
		stuname = obj.next();
		System.out.println("Enter Mobile number ");
		mobile= obj.next();
		System.out.println("Enter MailID ");
		mailid = obj.next();
		System.out.println("Enter Qualification");
		qualification = obj.next();
		
		int c=0;
		if(mobile.length()==10)
		{
			for(int i=0;i<mobile.length();i++)
			{
				if(mobile.charAt(i)>='0' & mobile.charAt(i)<='9')
					 c=0;
				else
				{
					c=1;
					break;
				}
			}
		}
		if(mailid.contains("@gmail.com") & c==0)
			{
				System.out.println("Your registration successfully completed...");
					
			}
		
			else
				System.out.println("Incomplete data to complete registration...");
			
	    }
    }
}