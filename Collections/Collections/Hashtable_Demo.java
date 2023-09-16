package Collections;
import java.util.*;
public class Hashtable_Demo {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put("Sam","1001");
		ht.put("Ram","1002");
		ht.put("Tam","1003");
		ht.put("Balu","1004");
		ht.put("Arun","1005");
		ht.put("Tharun","1006");
		// System.out.println(ht.get("Ram"));
		Enumeration keys = ht.keys();
		while (keys.hasMoreElements())
		{
			String key = (String) keys.nextElement();
			Object value = ht.get(key);
			System.out.println(key + "-" + value);
		}
		Enumeration values = ht.elements();
		while (values.hasMoreElements())
		{
			Object value = values.nextElement();
			System.out.println(value);
		}
	}
}