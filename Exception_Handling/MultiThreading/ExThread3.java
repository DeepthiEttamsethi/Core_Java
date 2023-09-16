package MultiThreading;
public class ExThread3 {
	public static void main(String argv[]) 
    {
            First3 o1 = new First3();
            Second3 o2 = new Second3();
            Third3 o3 = new Third3();
			

            Thread t1 = new Thread(o1);
            Thread t2 = new Thread(o2);
            Thread t3 = new Thread(o3);

            t1.start();
            t2.start();
            t3.start();                

            for (int m=100;m<=250;m++)
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
