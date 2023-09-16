package Collections;
import java.util.*;
public class Vector_implementation {

	public static void main(String[] args) {
	Book obj[] = new Book[5];
		
		obj[0]= new Book("1","java programming", "james",550f);
		obj[1]= new Book("2","C progrmming", "Dennis",2000f);
		obj[2]= new Book("3","Mysql ","william",600f);
		obj[3]= new Book("4","AI","Jegan", 952f);
		obj[4]= new Book("5","java programming", "Gosling", 670f);
		
		Vector<Book> v = new Vector<Book>();
		
		v.add(obj[0]);
		v.add(obj[1]);
		v.add(obj[2]);
		v.add(obj[3]);
		v.add(obj[4]);
		
		
		
		for(Book b : v) {
			
			System.out.println(b.bkid +" : "+ b.bktitle + " : "+b.author +" : "+b.price);
		}
	}

}
