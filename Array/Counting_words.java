package Array;

import java.util.Scanner;

public class Counting_words {

	public static void main(String[] args) {
		try (Scanner key = new Scanner(System.in)) {
			System.out.println("Enter your text ");
			String text = key.nextLine();
			
			
			int count=0;
			
			for(int i=0;i<text.length();i++)
			{
				if(text.charAt(i)==' ')
				count++;
			}
			
			System.out.println("no. of words "+ ++count);
			
			
		}
	}

	
}