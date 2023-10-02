package Operators;

public class Assignment {
	public static void main (String[] args) {
		int i = 20;
		int j = 6;
		
		i += 5;
		
		System.out.println(i);
		
		int k = i++ + ++i +i-- - --i;
		
	}
}
