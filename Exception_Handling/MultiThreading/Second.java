package MultiThreading;
public class Second extends Thread
{
    public void run() 
    {
            for (int j=1;j<=5;j++)
            {
                    System.out.println("j = " + j);
                    try
                    {
                            sleep(1000);
                            }
                    catch(Exception e)
                    {
                            System.out.println(e);                                
                            }
                    }
            System.out.println("End of Second");
            }
    }