package Inheritance;
//Child class
	class Car extends Vehicle {
	 public String color;

	 public Car(String brand, String model, int year, String color) {
	     super(brand, model, year);
	     this.color = color;
	 }

	 public void honk() {
	     System.out.println("Honking the car");
	 }
}