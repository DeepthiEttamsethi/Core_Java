package MultiThreading;

public class Third extends Thread
{
    public void run() 
    {
            for (int k=1;k<=5;k++)
            {
                    System.out.println("k = " + k);
                    try
                    {
                            sleep(1000);
                            }
                    catch(Exception e)
                    {
                            System.out.println(e);                                
                            }
                    }
            System.out.println("End of Third");
            }
    }