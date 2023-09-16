package String_Tokenizer;
import java.util.*;
public class Token {
	public static void main(String[] args) {
		
        String s = "Java is platform independent";
        StringTokenizer st = new StringTokenizer(s," ");
        while(st.hasMoreTokens()) {
        	System.out.println(st.nextToken());
        }
        while (st.hasMoreTokens()) {
			String key = (String)st.nextToken();
			System.out.println("Key: " + key);

        }
	}
}
