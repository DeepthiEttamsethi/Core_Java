package LAB6;
public class Main {
	public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Deepthi", 25);
        
        // Display Person attributes
        System.out.println("Person Details:");
        person.display();
        
        // Create a Student object
        Student student = new Student("Keerthi", 21, 1603);
        
        // Display Student attributes
        System.out.println("\nStudent Details:");
        student.display();
    }
}