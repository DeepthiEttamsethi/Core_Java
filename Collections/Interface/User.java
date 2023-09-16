package Interface;
import java.util.*;
public class User {

	public static void main(String[] args) {
		String userid,pwd;
		try (Scanner key = new Scanner(System.in)) {
			System.out.println("Enter userid and password");
			
			userid=key.next();
			pwd=key.next();
		}
		String uid="AF01311771Deepthi";
		String password="ven@123";
		System.out.println(userid);
		System.out.println(pwd);
		if(userid.equalsIgnoreCase(uid) & pwd.equalsIgnoreCase(password)) 
		{
			System.out.println("Successfully login");
		}
		else
		{
			System.out.println("Login failed");
		}
  }
}