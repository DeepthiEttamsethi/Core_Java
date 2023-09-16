package LAB1;
public class Count_Digits {

	public static void main(String[] args)
	{
		 int count=0, num=92584302;

	    while (num != 0) 
	    {
	      num /= 10;
	      ++count;
	 }

	 System.out.println("Number of digits: " + count);
  }
}