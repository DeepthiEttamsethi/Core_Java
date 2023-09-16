package Inheritance;
//Main class
	public class Main {
	 public static void main(String[] args) {
	     Car car = new Car("Toyota", "Camry", 2023, "Red");
	     car.drive(); // Call the drive() method from the parent class
	     car.honk(); // Call the honk() method from the child class
	 }

}
