package Anudip;
import java.util.*;
public class Prime_no {

	public static void main(String[] args) {
		int num,i,flag=0;
        try (Scanner obj = new Scanner(System.in)) {
        System.out.println("Enter uour number to check for prime or not");
        num=obj.nextInt();
        for(i=2;i<num;i++)
        {
        	if(num%i==0)
        	{
        	flag=1;
        	break;
        	}
        }
        if(flag==0)
        System.out.println("Given number is prime number");
        	else
        	System.out.println("Given number is not aprime number");
        }
        }

}