package MultiThreading;
public class First extends Thread
{
    public void run() 
    {
            for (int i=1;i<=5;i++)
            {
                    System.out.println("i = " + i);
                    try
                    {
                            sleep(1000);      
                    }
                    catch(Exception e)
                    {
                           System.out.println(e);                                
                            }
                    }
            System.out.println("End of First");
            }
    }