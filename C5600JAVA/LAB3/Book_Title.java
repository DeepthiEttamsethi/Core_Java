package LAB3;
import java.util.Enumeration;
import java.util.Hashtable;
public class Book_Title {

	public static void main(String[] args) {
		Hashtable<String, String> hashtable = new Hashtable<>();
		
		// Adding elements to the hashtable
		hashtable.put("Phython ", " IT ");
		hashtable.put("Ramayan", "Epic poetry");
		hashtable.put("Nightingale of India","LyricPoetry");
		hashtable.put("Shinchan", "Cartoon");
		hashtable.put("As You Like It ", "Drama");
		hashtable.put("charlie chaplin", "Autobiography ");
		hashtable.put("Harry Potter", "Fantasy");
		hashtable.put("Fiction ", "Novel");
		hashtable.put("Troy", "Epic historical  ");
		hashtable.put("Bhagavad Githa", "Hindu scripture");
		
		// Getting values from the hashtable
		String valueA = hashtable.get("As You Like It ");
		System.out.println("As You Like It: " + valueA);
		System.out.println();
		
		// Enumerating the elements of the hashtable
		Enumeration<String> keys = hashtable.keys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
		}

	}

}
