package Inheritance;
//Parent class
class Vehicle {
public String brand;
public String model;
public int year;

 public Vehicle(String b, String m, int y) {
     brand = b;
     model = m;
     year = y;
 }

 public void drive() {
     System.out.println("Driving the vehicle");
 }
}