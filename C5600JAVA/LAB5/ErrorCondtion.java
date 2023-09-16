package LAB5;
import java.util.*;
public class ErrorCondtion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,z;
		try {
			System.out.println("Enter 2 integer values ");
			x=sc.nextInt();
			y=sc.nextInt();
			
			if(y==0)
			{
				Exception eobj = new Exception("divisor must be non zero value ");
				throw(eobj);
				
			}
			else
			{
				z=x/y;
				System.out.println("dvivison "+ z);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
}