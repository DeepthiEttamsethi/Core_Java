package Collections;
import java.util.*;
public class Array_list {

	public static void main(String[] args) {
	ArrayList al = new ArrayList();
		
		int i, n;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("How many elements ");
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter "+ i + " Element ");
			al.add(sc.nextInt());
		}
		
		System.out.println("Array elements "+ al);
		
		System.out.println("Enter an element to find frequency ");
		int element = sc.nextInt();
		
		
		
		int freq=0, value;
		
		for(i=0;i<n;i++)
		{
			Object obj= al.get(i);
			value= (int)obj;
			if(value==element)
				freq++;
		}
		
		System.out.println("Frequency of " + element + " is " + freq);


	}

}
