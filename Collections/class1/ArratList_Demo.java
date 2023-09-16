package class1;
import java.util.*;
public class ArratList_Demo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println("Array List Size : " + al.size());
		//add(Object o)
		al.add("sam");
		al.add("ram");
		al.add("raju");
		al.add("mohan");
		al.add("sundar");
		//al.add(new Integer(10));
		//al.add(new Double(90l));
		System.out.println("Array List Size : " + al.size());
		System.out.println("Array List Content : " + al);
		al.remove("ram");
		al.remove(3);
		System.out.println("Array List Size : " + al.size());
		System.out.println("Array List Content : " + al);
		al.add(1,"venkat");
		System.out.println("Array List Content : " + al);
		al.set(1,"Java");
		al.sort(null);
		for (int i=0;i<al.size();i++)
		System.out.println(al.get(i));
		al.clear();
		System.out.println("Array List Content : " + al);	

	}

}
