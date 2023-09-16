package Anudip;
import java.util.*;
public class Student_Grade {

	private static String stu_name;

	public static void main(String[] args) {
		try (Scanner key = new Scanner(System.in)) {
		
		float avgmarks;
		
		System.out.print("Enter Student Name  ");
		stu_name= key.next();
		System.out.print("Enter Average marks of the Semester  ");
		avgmarks= key.nextFloat();
		
		if(avgmarks>80)
			System.out.println("Student scored A+ Grade");
		else if(avgmarks>=60 & avgmarks<=80)
			System.out.println("Student scored A Grade");
		else if(avgmarks>=50 & avgmarks<=59)
			System.out.println("Student scored B Grade");
		else
			System.out.println("Student Need Improvement");


	}

}
}
