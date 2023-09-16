package String_Tokenizer;
//Importing required classes
import java.util.StringTokenizer;
//Importing required classes
public class StringToken {

    // Main driver method
	public static void main(String[] args) {
        // Input strings
		String s=("Deepthi is a programmer");
		StringTokenizer st= new StringTokenizer(s," ");
		// checks for more tokens using hasMoreTokens() method
        // which holds true till there is single element remaining
		while(st.hasMoreTokens())
			// Returning the next token
            // using nextToken() method
			System.out.println(st.nextToken());
	}

}
