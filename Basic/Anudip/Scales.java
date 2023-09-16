package Anudip;
import java.util.*;
public class Scales {
	
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			String percentage,salesman_id;
			double salesval,comm;
			
			System.out.print("Enter salesman Id  ");
			salesman_id=sc.next();
			System.out.print("Enter sale Value  ");
			salesval=sc.nextDouble();
			
			if(salesval<=50000)
			{
				percentage="0%";
				comm=0;
			}
			else if(salesval>50000 & salesval<=100000)
			{
				percentage="8%";
				comm=salesval*8/100;
			}
			else
			{
				percentage="15%";
				comm=salesval*15/100;
			}	
			
			System.out.println("Commission Percentage "+ percentage);
		}
			
			System.out.println("Commission Payable ");


		}

}	