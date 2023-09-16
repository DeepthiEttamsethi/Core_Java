package MultiThreading;

public class ExThread1 extends Thread {
	
	
	public void run()
	{
		for(int i=1;i<=15;i++)
		{
			System.out.println("Thread A " + i);
			
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		
		ExThread1 obj = new ExThread1();
		
		obj.start();
		
		for(int i=1;i<=15;i++)
		{
			System.out.println("Thread B " + i);
			
			try {
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
