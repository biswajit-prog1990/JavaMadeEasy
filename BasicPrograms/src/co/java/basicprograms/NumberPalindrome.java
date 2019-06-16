/*
 * Program - To check whether a number is palindrome or not
 * Implementation - To get the unit digit, try modulo%10 and then subsequently divide the number by 10
 * Developer - Biswajit Dutta
 */

package co.java.basicprograms;

public class NumberPalindrome {
    static boolean isNumberPalindrome(int number) {
    	
    	int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
    	
    	if(number == reverse)
    		return true;
    	else
    		return false;
    }
    
    public static void main(String[]args) {
    	boolean flag=NumberPalindrome.isNumberPalindrome(1221);
    	if(flag == true) {
    		System.out.println("Number is palindrome");
    	}
    	else
    		System.out.println("Number is not palindrome");
    }
}
