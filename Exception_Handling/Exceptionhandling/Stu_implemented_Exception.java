package Exceptionhandling;

public class Stu_implemented_Exception {

	public static void main(String[] args) {
		
		
		Students s = new Students();
		
		try {
			s.getdata();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Invalid input type, Expected is integer");
		}

	}

}