package Modifiers;
public class TestCalc {

	public static void main(String[] args) {
	Calculate obj = new Calculate(11);
		
		if (obj.isPrime())
			System.out.println("given number is prime");
		else
			System.out.println("given number is not prime");
		
		System.out.println("factorial  "+ obj.findFactorial());
		
		
		obj.sumofDigits(); //calling the function
		
		
Calculate obj1 = new Calculate(12356);
		
		
		
		
		obj1.sumofDigits(); //calling the function
	}
}