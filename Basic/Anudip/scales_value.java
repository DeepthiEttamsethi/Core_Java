package Anudip;
import java.util.*;
public class scales_value {

	public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
		
		int day;
		String salesman_id, percentage;
		double salesval, comm;
		System.out.println("Enter date in this Month");
		day = key.nextInt();
		System.out.print("Enter salesman Id  ");
		salesman_id= key.next();
		System.out.print("Enter sale Value  ");
		salesval= key.nextDouble();
		if(day<=1&day>=15) {
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
		}
		else {
			if(salesval<=50000)
			{
				percentage="0%";
				comm=0;
			}
			else if(salesval>50000 & salesval<=100000)
			{
				percentage="6%";
				comm=salesval*8/100;
			}
			else
			{
				percentage="12%";
				comm=salesval*15/100;
			
			
		}
		System.out.println(salesman_id);
		System.out.println("Commission Percentage "+ percentage);
		System.out.println("Commission Payable "+comm);
key.close();
	}
	
	

	}

}
