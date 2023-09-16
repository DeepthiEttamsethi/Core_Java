package Array;

public class String_Methods {

	public static void main(String[] args) {
		String str="java is an robust language.";
		String str1 ="JRTS SUPPORT MUTITHREADING";
		
		String s="java", s1="Java";
		
		System.out.println("Upper case ==>"+ str.toUpperCase());
		System.out.println("Lower case ==>"+ str1.toLowerCase());
		System.out.println("substring/part of the string ==>"+ str.substring(11, 16));
		System.out.println("substring/part of the string ==>"+ str.substring(1, 4));
		
		System.out.println("String comparison ==>"+ s.equals(s1));
		
		System.out.println("String comparison ==>"+ s.equalsIgnoreCase(s1));
		
		System.out.println("verifiy a character availabilty in string ==>"+ s1.indexOf('v'));
		
		System.out.println("String that contains ==>"+ str.contains("robust"));
	}
}