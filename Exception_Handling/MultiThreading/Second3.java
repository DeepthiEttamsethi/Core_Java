package MultiThreading;

public class Second3  implements Runnable
{
    public void run() 
    {
            for (int j=1;j<=5;j++)
            {
                    System.out.println("j = " + j);
                    try
                    {
                            Thread.sleep(1000);
                            }
                    catch(Exception e)
                    {
                            System.out.println(e);                                
                            }
                    }
            System.out.println("End of Second");
            }


}
