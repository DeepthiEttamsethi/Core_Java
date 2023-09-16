package class1;
import java.util.*;
public class ExIterator {

	public static void main(String[] args) {
        ArrayList al = new ArrayList();
        
        al.add("sam");
        al.add("ram");
        al.add("raju");
        al.add("mohan");
        al.add(new Integer(200));

        for(Object s: al)
        	System.out.println(s);

        	Iterator it = al.iterator();

        	while (it.hasNext())
        	{
        		// String s = (String) it.next();
        		//System.out.println(s);
                System.out.println(it.next());
             }
       }
}