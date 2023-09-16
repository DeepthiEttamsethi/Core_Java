package Modifiers;
import java.util.*;
public class Student {
	private int idno;  //data members
	private String stuname, course;
	private float avgmarks; // class variables
	
	
	public void Addstudent() // member fuctions or method method
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter rollno ");
		idno = obj.nextInt();
		System.out.println("Enter Student Name ");
		stuname = obj.next();
		System.out.println("Enter Course Name ");
		course = obj.next();
		System.out.println("Enter Average Marks ");
		avgmarks = obj.nextFloat();
		
		
	}
	public void ViewStudent()
	{
		System.out.println("Enter rollno\t"+ idno);
		System.out.println("Enter Student Name\t" + stuname);
		System.out.println("Enter Course Name\t"+ course);
		System.out.println("Enter Average Marks\t"+avgmarks);
	}
	
	public String Findgrade()
	{
		String gr;
		
		if(avgmarks>=80)
			gr="A+";
		else if(avgmarks>=60 & avgmarks<80)
		gr="A";
		else if(avgmarks>=50 & avgmarks<60)
			gr="B";
		else
			gr="C";
		
		
		return(gr);
		
	}
	
	public static void main(String[] args) {
		
		Student s = new Student(); 
		//s is the object for student class
		
		s.Addstudent(); // method invoking
		s.ViewStudent();
		String grade= s.Findgrade();
		System.out.println("Student garde " + grade);
		
		
		
		
		Student s1 = new Student(); 
		//s is the object for student class
		
		s1.Addstudent(); // method invoking
		s1.ViewStudent();
		
		System.out.println("Student garde " +s1.Findgrade());
	}

}
