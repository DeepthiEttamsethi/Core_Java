package LAB4;
public class First4 implements Runnable {
public void run()
{
for(int i=1;i<=100000;i++)
{
int n=i;
int sum=0,factor=1;
while(factor<n)
{
if((n%factor)==0)
{
sum=sum+factor;
}
factor++;
}
if(sum==i)
{
System.out.println("perfect number is: ");
System.out.println(i+" ");
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);                                
}
}
// System.out.println("End of First");
}   
}
} 
