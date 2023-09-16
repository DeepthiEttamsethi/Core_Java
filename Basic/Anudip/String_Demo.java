package Anudip;
import java.util.*;
public class String_Demo {

	public static void main(String[] args) {
		final String userid="user1",pwd="Welcome";
		String username,password,msg;
		try (Scanner key = new Scanner(System.in)) {
		System.out.println("Enter username");
		username=key.next();
		System.out.println("Enter password");
		password = key.next();
		msg=(username.equals(userid) & password.equals(pwd)) ? "login successfull !!! " :" Invalid username or password";
		System.out.println(msg);

	}

}
}
