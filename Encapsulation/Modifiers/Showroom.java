package Modifiers;
import java.util.*;
public class Showroom {
	String name;
	long mobno;
	double cost, dis, amt;
	
	Showroom() //default constructor
	{}
	
	void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter customer name ");
		name=in.next();
		System.out.println("Enter Mobile number ");
		mobno=in.nextLong();
		System.out.println("Enter Cost of purchase ");
		cost=in.nextDouble();
	}
	
	void calculate()
	{
		if(cost<=10000)
			dis=cost*5/100;
		else if(cost>10000 & cost<=20000)
			dis=cost*10/100;
		else if(cost>20000 & cost<=35000)
			dis=cost*15/100;
		
		amt=cost-dis;
	}
	
	void display()
	{
		System.out.println("Name of the Customer "+ name);
		System.out.println("Mobile number "+ mobno);
		System.out.println("Amount payable after discount "+ amt);
	}
	public static void main(String[] args) {
	
	Showroom obj = new Showroom();
	obj.input();
	obj.calculate();
	obj.display();
	
	}

}
