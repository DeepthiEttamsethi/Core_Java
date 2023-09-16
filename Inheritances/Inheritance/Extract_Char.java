package Inheritance;
public class Extract_Char {
	public static void main(String[] args) {
	      
		String wd="India is my country";
		
		System.out.println("length "+ wd.length() );
		
		
		char ch = wd.charAt(wd.length()-2);
				
		System.out.println("second last char is "+ ch);
		
		
		if(ch>='A' & ch<='Z')
			System.out.println("second last char is UPPER case");
		else
			System.out.println("second last char is lower case");
		
		
		if(Character.isUpperCase(ch))
			System.out.println("second last char is UPPER case");
		else
			System.out.println("second last char is lower case");

	}
}
