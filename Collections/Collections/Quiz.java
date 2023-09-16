package Collections;
import java.util.*;
public class Quiz {

	public static void main(String[] args) {
		String stuname;
		Random r = new Random();
		
		int tableno, multiply, answer, score=0, i;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Quiz with Multiplication Table\n");
			System.out.println("Enter your Name");
			stuname = sc.next();
			System.out.println("Enter Table number 1 to 15 ");
			tableno = sc.nextInt();
			
			for(i=1;i<=10;i++)
			{
				multiply = r.nextInt(20);
				System.out.print(multiply + " x "+ tableno + " = ");
				answer = sc.nextInt();
				
				if(answer == (multiply * tableno))
					score++;
				
			}
		}
		
		System.out.println("Hello, "+ stuname + " your score is "+ score+"/"+ 10);
		
		
		
		
	}
}