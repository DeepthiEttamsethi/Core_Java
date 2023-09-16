package Collections;
import java.util.*;
public class vector_demo1 {

	public static void main(String[] args) {
		Vector v = new Vector(3, 2);
		
		v.addElement("Hari");
		v.addElement("Shwetha");
		v.addElement("Jegan");
		v.addElement("Miller");
		
		System.out.println("size " + v.size());
		System.out.println("Capacity " + v.capacity());
		
		v.addElement("Scott");
		v.addElement("Fred");
		v.addElement("Trail");
		v.addElement("Fred");
		
		System.out.println("size " + v.size());
		System.out.println("capacity " + v.capacity());
		Enumeration e = v.elements();
		while (e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("using iterator");
		Iterator it = v.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		}
}