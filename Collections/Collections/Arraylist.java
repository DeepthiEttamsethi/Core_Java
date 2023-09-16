package Collections;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		int Second=0;
		 ArrayList<Integer> list = new ArrayList<Integer>();
	        list.add(300);
	        list.add(200);
	        list.add(7);
	        list.add(4);
	        list.add(129);
	        list.add(39);
	 
	        System.out.println("Before Sorting : " + list);

	        Collections.sort(list);
	 
	        System.out.println("After Sorting : " + list);
	        
	        Second=list.get(list.size()-2);
	        System.out.println("Second Largest: " +Second); 

	}
}