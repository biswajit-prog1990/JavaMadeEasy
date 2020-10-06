package co.adobe.interview.questions;
/*
 * Program - To check if a number is palindrome or not. A palindrome number is same as its reverse, e.g.., 101, 1331, etc.
 */

public class PalindromeNumber {

	private static boolean checkPalindromeNumber(long number) {
		boolean checkPalindrome = false;
		long originalNumber = number;
		String reverseNumber = "";
		while (number > 0) {
			long temp = number % 10;
			reverseNumber += temp;
			number = number / 10;
		}

		checkPalindrome = (originalNumber == Long.parseLong(reverseNumber)) ? true : false;
		return checkPalindrome;
	}

	public static void main(String[] args) {
		System.out.println(checkPalindromeNumber(1331));
	}

}
