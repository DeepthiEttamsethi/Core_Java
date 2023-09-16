package String_Tokenizer;
import java.util.StringTokenizer;
public class String_Tokenizer {
	public static void main(String[] args) {
		String s1 = " : ";
		String s2 = "JAVA : Code : String : Tokenizer : Geeks";
		StringTokenizer st = new StringTokenizer(s2, s1);
		while (st.hasMoreTokens())          
		System.out.println(st.nextToken());
	}

}
