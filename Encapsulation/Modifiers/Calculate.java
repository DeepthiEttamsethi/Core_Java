package Modifiers;

public class Calculate {
	private long num;
	
	//constructor
	public Calculate(long val)
	{
		num=val;
	}
	
	public long findFactorial()
	{
		long f=1;
		
		for(int i=1;i<=num;i++)
		{
			f=f*i;
		}
		return(f);
	}
	
	
	public boolean isPrime()
	{
		boolean b=true;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				b=false;
				break;
			}
		}
		
		return(b);
		
	}
	
	public void sumofDigits()
	{
		long sum=0, r;
		
		while(num>0)
		{
			r=num%10;
			sum+=r;
			num=num/10;
		}
		System.out.println("SUm of digits "+ sum);
	}

}
