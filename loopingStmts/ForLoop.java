package loopingStmts;

public class ForLoop {
	public static void main(String[] args) {
		
		//with in the loop
		
//		for(int i = 0; i<10; i++) {
//			System.out.println(i);
//		}
		

		//Outside the for loop
		
		int i;
		
//		for(i = 0;i<10; i++) {
		       //or
//		for(i =1; i<10; i*=2) {
//			
//		System.out.println(i);
//		}
//		System.out.println("Loop executed for "+ i + " times " );		
		
		
															//OR
	    
		for(i = 1; ;)
			if(i<10) {
			System.out.println(i);
			i*= 2;
		}
		else
			break;
	
	System.out.println(i);
		}
}
