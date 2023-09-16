package Anudip;
import java.util.*;
public class Area {

	public static void main(String[] args) {
		System.out.println("1.enter of triangle");
		System.out.println("2.enter of rectangle");
		System.out.println("3.enter of circle");
		System.out.println("4.enter your choice");
		int choice;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter your choice with 1...4");
choice=s.nextInt();

switch(choice)
{
  case 1:
  {
     System.out.println("enter Width of triangle:");
     double b=s.nextDouble();
     
     System.out.println("enter height of triangle");
     double h=s.nextDouble();
     
     double area=(b*h)/2;
     System.out.println("enter of triangle:"+area);
     break;
   }
  case 2:
  {
     System.out.println("enter width of a rectangle:");
     double b=s.nextDouble();
     
     System.out.println("enter height of rectngle");
     double h=s.nextDouble();
     
     double area=b*h;
     System.out.println("enter of rectangle"+area);
     break;
   }
  case 3:
  {
     System.out.println("enter radius of circle:");
     double r=s.nextDouble();
     
     double area=22/7*r*r;
     System.out.println("enter radius of circle:"+area);
     break;
   }
  
  default:
      System.out.println("wrong choice");
}
		}
	}


	}

