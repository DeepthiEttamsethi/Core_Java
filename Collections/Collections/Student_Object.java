package Collections;
import java.util.*;
public class Student_Object {

	public static void main(String[] args) {
		Student[] sobj = new Student[5];
		
		sobj[0]= new Student("1", "Arun", "BE");
		sobj[1]= new Student("2", "Kiran", "BSc");
		sobj[2]= new Student("3", "Kumar", "BTech");
		sobj[3]= new Student("4", "Krishna", "ME");
		sobj[4]= new Student("5", "Kishore", "BSc");
		
		//Generic type
		
		ArrayList<Student> stu = new ArrayList <Student>();
		stu.add(sobj[0]);
		stu.add(sobj[1]);
		stu.add(sobj[2]);
		stu.add(sobj[3]);
		stu.add(sobj[4]);
		
		// Now iterate and display all the Student data.
		 for(Student st:stu)
		 {
		
			 System.out.println("Rollno "+ st.roll);
			 System.out.println("Student's name: " +st.sname);
		 System.out.println("Course : " + st.course);
		  }
	}
}
