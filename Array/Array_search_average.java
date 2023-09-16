package Array;

import java.util.Scanner;

public class Array_search_average {

	public static void main(String[] args) {
				
				
			try (Scanner obj = new Scanner(System.in)) {
				
				int[] arr;
				int i, size, sum=0;
				float avg;
				
				System.out.println("how many elements? ");
				size = obj.nextInt();
				
				arr= new int[size]; //memory allocation for array
				
				System.out.println("Enter "+ size + " Elements ");
				for(i=0;i<size;i++)
				{
					arr[i]=obj.nextInt();
					sum=sum+arr[i];
				}
				
				
				avg=sum/size;
				System.out.println("SUM of the elements "+ sum);
				System.out.println("Average of the elements "+ avg);
				System.out.println("Elements which are above average ");
				
				for(i=0;i<size;i++)
				{
					if(arr[i]>avg)
						System.out.println(arr[i]);
				}
				
				
				
				
			}
		}
}
