package Collections;
import java.util.*;
public class Vector_demo {

	public static void main(String[] args) {
		Vector v = new Vector(10,2);
		
		v.addElement("Hari");
		v.addElement("Shwetha");
		v.addElement("Jegan");
		v.addElement("Miller");
		v.addElement("Scott");
		v.addElement("Fred");
		v.addElement("Trail");
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		Enumeration e = v.elements();
		while (e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}