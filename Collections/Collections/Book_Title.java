package Collections;
import java.util.Enumeration;
import java.util.Hashtable;
public class Book_Title {

	public static void main(String[] args) {
		Hashtable<String, String> hashtable = new Hashtable<>();
		// Adding elements to the hashtable
		hashtable.put("C programming", "IT");
		hashtable.put("Bhagavat Geeta", "Religious");
		hashtable.put("Road not Taken", "Literature");
		// Getting values from the hashtable
		String valueA = hashtable.get("Road not Taken");
		System.out.println("Value of Road not Taken: " + valueA);
		
		// Enumerating the elements of the hashtable
		Enumeration<String> keys = hashtable.keys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
		}
	}
}