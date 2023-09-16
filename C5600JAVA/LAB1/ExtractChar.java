package LAB1;
import java.util.Scanner;
public class ExtractChar {

	public static void main(String[] args) {
		
	String text,  string="";
	char ch;
	int i;
				
	Scanner key = new Scanner(System.in);
		
	System.out.println("Enter your text ");
	text = key.next();
				
	for(i=0;i<text.length();i++)
	{
		ch = text.charAt(i);
					
		if(ch>='a' & ch<='z' | ch>='A' & ch<='Z')
		string=string + ch;
			
	}
	System.out.println("Extracted string "+ string);
		
	}
}