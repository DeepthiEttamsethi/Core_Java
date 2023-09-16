package MultiThreading;

public class Third3 implements Runnable
{
    public void run() 
    {
            for (int k=1;k<=5;k++)
            {
                    System.out.println("k = " + k);
                    try
                    {
                            Thread.sleep(1000);
                            }
                    catch(Exception e)
                    {
                            System.out.println(e);                                
                            }
                    }
            System.out.println("End of Third");
        }

}
