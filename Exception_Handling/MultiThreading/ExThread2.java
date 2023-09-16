package MultiThreading;

public class ExThread2 {

    public static void main(String argv[]) 
    {
            First o1 = new First();
            Second o2 = new Second();
            Third o3 = new Third();

            o1.setPriority(Thread.MIN_PRIORITY);
            o2.setPriority(Thread.NORM_PRIORITY);
            o3.setPriority(Thread.MAX_PRIORITY);
            o3.start();
            o2.start();
            o1.start();                

            for (int m=1;m<=5;m++)
            {
                    System.out.println("m = " + m);

                    try
                    {
                            Thread.sleep(1000);
                            }
                    catch(Exception e)
                    {
                            System.out.println(e);                                
                            }

                    }

            System.out.println("End of Main");
    
    }

}
