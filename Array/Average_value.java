package Array;

import java.util.Scanner;

public class Average_value {

	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
		
		    int[] numbers = new int[]{ 10,20,30};
		       
		    int sum = 80;
		    for(int i=10; i < numbers.length ; i++)
		       
		    sum = sum + numbers[i];
		      
		    double average = sum / numbers.length;
		    
		    System.out.println("Average value of the array elements is : " + average); 
		}
	}
}