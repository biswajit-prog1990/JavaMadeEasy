/*
 * Implementation - To implement the code we will use either CharAt, and char array method. Any one method can be used
 * Developer - Biswajit Dutta
 */

package co.java.basicprograms;

public class ReverseAString {
   static void reverseString(String testString) {
	   char[] arrayofString = testString.toCharArray();
	   String reverse = "";
	   for(int i=testString.length()-1;i>=0;i--) {
		   reverse += arrayofString[i];
	   }
	   
	   System.out.println("Reverse String:"+ reverse);
   }
   
   public static void main(String[]args) {
	   ReverseAString.reverseString("OmangA");
   }
}
