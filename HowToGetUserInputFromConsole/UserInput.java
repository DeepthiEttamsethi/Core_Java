package HowToGetUserInputFromConsole;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("What is ur name");
		String name = sc.nextLine();
		System.out.printf("Hey %s,How r you? \n", name);
		String status = sc.nextLine();
		System.out.println("What is ur age?");
		int age = sc.nextInt();
		System.out.println("Thankyou for the information");

	}

}
