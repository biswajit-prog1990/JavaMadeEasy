/*
 * Program - To print String is palindrome or not. A palindrome String is the one which is equal to its reverse
 * Implementation - To implement the program, I will be doing it in the below method :
 *     Method: Convert the string into character array and check the characters from reverse, if they are equal true
 * Developer - Biswajit Dutta
 */

package co.java.basicprograms;

public class StringPalindrome {

	static boolean checkPalindrome(String checkString) {
		char[] palString = checkString.toCharArray();
		String reverseString = "";
		for(int i=checkString.length()-1;i>=0;i--) {
			//reverseString += checkString.charAt(i); --- Method 1 : directly checking charAt
			reverseString += palString[i]; //Method 2 : adding characters from char[] array
		}
		
		if(checkString.equals(reverseString))
			return true;
		else
			return false;
	}
	
	public static void main(String[]args) {
		boolean flag = StringPalindrome.checkPalindrome("radar");
		if(flag == true)
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}
}
