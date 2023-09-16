package LAB6;
public class Main4 {
	public static void main(String[] args) {
		Circle circle = new Circle(4.0);
        System.out.println("Circle Area: " + circle.calculateArea());

        Rectangle4 rectangle4 = new Rectangle4(1.0, 3.0);
        System.out.println("Rectangle Area: " + rectangle4.calculateArea());

        Triangle4 triangle4 = new Triangle4(2.0, 6.0);
        System.out.println("Triangle Area: " + triangle4.calculateArea());
       }
}