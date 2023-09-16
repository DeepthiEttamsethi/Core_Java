package Interface;
import java.util.regex.*;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("? quantifier ....");
		//any one the character can appear only once
		System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)
		System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)
		System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)
		System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)
		System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)
		
		//only given character can appear more than once
		System.out.println("+ quantifier ....");
		System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
		System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
		System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)
		System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)
		
		//only given character appears more than once
		System.out.println("* quantifier ....");
		System.out.println(Pattern.matches("[ab]+", "ababkj"));//true (a or m or n may come zero or more

	}

}
