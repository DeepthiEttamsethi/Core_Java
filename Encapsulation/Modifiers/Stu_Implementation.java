package Modifiers;
public class Stu_Implementation {

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