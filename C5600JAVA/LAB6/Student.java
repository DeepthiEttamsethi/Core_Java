package LAB6;
public class Student extends Person {
    private int studentId;

    // Constructor
    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }
    
    // Display method (overrides the display method in Person class)
    
    public void display() {
        super.display();
        System.out.println("Student ID: " + studentId);
    }
}