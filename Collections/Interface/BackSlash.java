package Interface;
import java.util.regex.*;
public class BackSlash {

	public static void main(String[] args) {
	System.out.println("metacharacters d....");//d means digit
		
		System.out.println(Pattern.matches("\\d", "6"));//false (non-digit)
		System.out.println(Pattern.matches("\\d\\d\\d", "122"));//true (digit and comes once)
		System.out.println(Pattern.matches("\\d", "40"));//false (digit but comes more than once)
		System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)
		
		System.out.println("metacharacters D....");//D means non-digit
		
		System.out.println(Pattern.matches("\\D", "_"));//false (non-digit but comes more than once)
		System.out.println(Pattern.matches("\\D\\D", "@y"));//false (digit)
		System.out.println(Pattern.matches("\\D", "4443"));//false (digit)
		System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)
		System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)
		
		//any no. of non-digits character
		System.out.println("metacharacters D with quantifier....");
		System.out.println(Pattern.matches("\\D*", "#d@#@#SDFSDFSDd"));//true (non-digit and may come 0 or more times)
	}
}


