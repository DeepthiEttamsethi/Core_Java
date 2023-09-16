package Files;
import java.lang.*;
import java.util.Scanner;
public class Thread2 extends Thread {
	public void run()
	{
	Scanner obj = new Scanner(System.in);
	int n;
	long fact=1;
	long sum=0;
	System.out.println("The Factorials are:");
	for(int i=1;i<=10;i++)
	{
	fact=1; 
	for(int j=1;j<=i;j++)
	{
	fact=fact*j;
	}
	sum=sum+fact;
	System.out.println(fact+" ! ");
	}
}
}