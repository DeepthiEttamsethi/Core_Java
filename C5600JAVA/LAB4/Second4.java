package LAB4;
import java.util.Scanner;
public class Second4 implements Runnable{
public void run() {
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
// System.out.println("The Factorial is:");
try
{
Thread.sleep(2000);
}
catch(Exception e)
{
System.out.println(e);                                
}
//System.out.println("End of Second");
}
}