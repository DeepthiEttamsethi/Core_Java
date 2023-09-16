package String_Tokenizer;
import java.util.regex.*;
public class Example {

	public static void main(String[] args) {
		//1st way
		Pattern p = Pattern.compile("a...");//. represents single character
		Matcher m = p.matcher("asam");
		boolean b = m.matches();
		
		//2nd way
		boolean b2=Pattern.compile(".s").matcher("as").matches();
		
		//3rd way
		String s= "AF12349";
		boolean b3 = Pattern.matches("AF....", s);
		
		System.out.println(b+" "+b2+" "+b3);
		System.out.println("------------------");
		System.out.println(Pattern.matches("[amn]*", "girl"));//false (not a or m or n)
		System.out.println(Pattern.matches("[amn]", "normal"));//true (among a or m or n)
		System.out.println(Pattern.matches("[amn]", "e"));//false (m and a comes more than once)

	}

}
