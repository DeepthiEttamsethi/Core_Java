package MultiThreading;

public class First3 implements Runnable
{
    public void run() 
    {
            for (int i=100;i<=500;i++)
            {
                    System.out.println("i = " + i);
                    //sleep(int milliseconds)
                    try
                    {
                            Thread.sleep(1000);
                            }
                    catch(Exception e)
                    {
                            System.out.println(e);                                
                            }
                    }
            System.out.println("End of First");
            }

}