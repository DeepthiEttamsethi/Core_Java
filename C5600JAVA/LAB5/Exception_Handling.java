package LAB5;
public class Exception_Handling {
	public static void main(String[] args) {
		int[] a = new int[10]; int i;
		try{ 
			for(i=0;i<args.length;i++)
		{
				a[i]=Integer.parseInt(args[i]);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Final Block is Executed Succesfully");
		}
	}
}