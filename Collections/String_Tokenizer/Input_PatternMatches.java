package String_Tokenizer;
import java.util.regex.*;
import java.util.*;
public class Input_PatternMatches {

	public static void main(String[] args) {
		//boolean b3 = Pattern.matches("AF....", s);
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter your string only 5 characters");
			String s = sc.next();
			boolean b3 = Pattern.matches(".....", s);
			if(b3==true)
			System.out.println("Valid Input");
			else
			System.out.println("Invalid Input");
		}
}