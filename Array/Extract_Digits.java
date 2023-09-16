package Array;

import java.util.Scanner;

public class Extract_Digits {

	public static void main(String[] args) {
		String text, digits="", string="", symbols="";
		char ch;
		int i;
		
		
		try (Scanner key = new Scanner(System.in)) {
		System.out.println("Enter your text ");
		text = key.next();
		
		System.out.println("length of the string "+text.length());
		
		for(i=0;i<text.length();i++)
		{
			ch = text.charAt(i);
			
			if(ch>='0' & ch<='9')
				digits=digits +ch;
			else if(ch>='a' & ch<='z' | ch>='A' & ch<='Z')
			string=string + ch;
			else if(ch!=' ')
				symbols=symbols + ch;
		}
		
		System.out.println("extracted digits "+ digits);
		System.out.println("extracted string "+ string);
		System.out.println("extracted Symbols "+ symbols);
		
	}
   
	}

}