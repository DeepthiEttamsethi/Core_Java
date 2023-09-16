package LAB1;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
				
	 int num, r, reverse=0;
				
	 System.out.println("Enter a number");
				
	 num = obj.nextInt();
	 
	 while(num>0)
	 {
		r=num%10;
		reverse= (reverse*10) +r;
		System.out.print(r);
		num/=10;
	 }
				
	 System.out.println("reverse of the digits "+ reverse);
	}
}