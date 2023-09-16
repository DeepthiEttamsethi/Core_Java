package class1;
import java.util.*;
public class Ternary4 {
	public static void main(String[] args) {
		String s1=":";
		String s2="java :is :an :platform :independent :language";
		
		StringTokenizer st=new StringTokenizer(s2,s1);
		
		int count=st.countTokens();
		System.out.println("number of tokens:"+count);
		
		for (int i = 0; i < count; i++)
            System.out.println(st.nextToken());
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());

		}
}