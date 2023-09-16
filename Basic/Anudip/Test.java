package Anudip;

import java.util.*;
public class Test {

	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int Rollno;
			 
			String Name,Course;
			float Avg;
			
			System.out.println("Enter your rollno");
            Rollno=obj.nextInt();
            System.out.println("Enter your name");
            Name=obj.next();
            System.out.println("Enter your course");
            Course=obj.next();
            System.out.println("Enter your Average Marks");
            Avg=obj.nextFloat();
		} 
		

	}

}
