package Interface;
import java.util.*;
public class Person {
	private int id;
	private String name, mobile, address;
	
	public void addPerson()
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter idno, name, mobileno and address of a person");
			id= sc.nextInt();
			name=sc.next();
			mobile=sc.next();
			address=sc.next();
		}
	}
	
	public void addPerson(int id, String name, String mobile, String address) {
		
		this.id=id;
		this.name=name;
		this.mobile=mobile;
		this.address=address;
	}
	
public void addPerson(int id, String name, String mobile) {
		
		this.id=id;
		this.name=name;
		this.mobile=mobile;
		this.address="xxxx";
	}
	
	public void addPerson(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
	
	public void showPerson()
	{
		System.out.println("Idno "+ id);
		System.out.println("Name "+ name);
		System.out.println("address "+ address);
		System.out.println("contact number "+ mobile);
	}
	public static void main(String[] args) {
		
		Person P1, P2;
		
		P1= new Person();
		P1.addPerson(101, "Rakesh", "43545345345");
		
		P2=new Person();
		P2.addPerson();
		
		P1.showPerson();
		P2.showPerson();
		
		
		
	}
}
