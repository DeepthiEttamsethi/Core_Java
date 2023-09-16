package Interface;
import java.util.*;

public class Sting_Manuplation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	 
		System.out.println("Enter a String");
		
		String str = sc.nextLine();
		char ch;
		int alpha, digit, symbol, space, word;
			
		alpha=digit=symbol=space=word=0;
			
		for(int i=0;i<str.length();i++)
		{
		   ch=str.charAt(i);
			 
		   if(Character.isAlphabetic(ch))
			alpha++;
		   else if(Character.isDigit(ch))
			 digit++;
		   else if(Character.isWhitespace(ch))
			 space++;
		   else
			  symbol++;
		}
			
		word=space+1;
			
		System.out.println("No.of alphabets" + alpha);
		System.out.println("No.of digits" + digit);
		System.out.println("No.of spaces" + space);	
		System.out.println("No.of symbols" + symbol);
		System.out.println("No.of words" + word);
			
		System.out.println("Enter a sub string");
			
		String str1=sc.nextLine();
			
		if(str.contains(str1))
			System.out.println("Substring present in main string");
		else
			System.out.println("Substring is not present in the main sting");
	}
}