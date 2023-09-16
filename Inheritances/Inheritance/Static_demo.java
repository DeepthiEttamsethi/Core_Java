package Inheritance;

public class Static_demo {
	static
	{
		System.out.println("static block");
	}
	    
	     static int s;
	     int s2;
	     
	     public static void msg()
	     {
	    	 System.out.println("Static method call..."+ (++s));
	    	 
	     }
	     
	     public void msg1()
	     {
	    	 System.out.println("Static method call"+ (++s));
	    	 
	     }
	     
	public static void main(String[] args) {
		
		System.out.println("non static ");
		Static_demo.msg();
		Static_demo.msg();
		Static_demo.msg();
		

	}

}
