package LAB1;
import java.util.*;
public class PowerValue {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int base,expo;
	long power=1;
		
	System.out.println("Enter the value base");
	base=sc.nextInt();
	System.out.println("Enter the value exponent");
	expo=sc.nextInt();
		 
	while(expo!=0)
	{
		power=power*base;
		--expo;
	}
	System.out.println(base+" to the power "+expo+"is "+power);
    System.out.println("The value of the power : "+power);

  }
}