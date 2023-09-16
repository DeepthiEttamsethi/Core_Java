package Interface;
import java.util.*;
import java.util.regex.*;
public class Validation {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 10 digit number");
			String mobile= sc.next();
			
			if(Pattern.matches("\\d\\d\\d\\d\\d", mobile))
				System.out.println("valid mobile number");
			else
				System.out.println("Invalid mobile number");
		}		
	}
}
