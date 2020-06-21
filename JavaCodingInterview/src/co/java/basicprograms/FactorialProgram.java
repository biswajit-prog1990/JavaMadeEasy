/*
 * Implementation - Check Factorial of a number !1 =1 and !0 =1, then implement it iteratively and Recursively
 * Developer - Biswajit Dutta
 */

package co.java.basicprograms;

public class FactorialProgram {
   static int checkFactorial (int number) {
	   int fact = 1;
	   if(number == 0 || number == 1)
		   return 1;
	   else
	   {		   
		   while(number!=0) {
			   fact*=number;
			   number --;			   
		   }
	   }
	   
	   return fact;
   }
   
   static int checkFactorialRecursion(int number) {
	   if(number == 0 || number == 1)
		   return 1;
	   else
	   {
		   return number * checkFactorialRecursion(number - 1);
	   }
   }
   
   public static void main(String[]args) {
	   System.out.println("Factorial = "+ checkFactorial(12));
	   System.out.println("Factorial Recursion = "+checkFactorialRecursion(5));
   }
}
