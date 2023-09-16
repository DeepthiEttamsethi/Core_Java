package Inheritance;
import java.util.Scanner;
public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a  String to check palindrome or not");

		String str = Sc.nextLine(); 

		if (isPalindrome(str)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}
	}

	public static boolean isPalindrome(String str) {
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray.length - 1;

		while (left < right) {
			if (charArray[left] != charArray[right]) {
				return false; // Characters don't match, not a palindrome
			}
			left++;//3
			right--;//2
		}

		return true; // All characters matched, it is a palindrome
	}
}