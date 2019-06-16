/*
 * Program - To check if a number is prime or not
 * Implementation - Through Square Root and normal checks if a number % i ==0, where i ranges from 2 to number -1
 * Developer - Biswajit Dutta
 */
package co.java.basicprograms;

import java.math.*;
public class PrimeNumber {
   static boolean getPrime(int number) {
	   if(number<=1)
		   return false;
	   for (int i=2;i<number;i++) {
		   if(number%i==0) {
			   return false;
		   }
	   }
	   return true;
   }
   
   static boolean getPrimeusingSqrt(int number) {
	   int sqrt = (int)Math.sqrt(number)+1;
	   if(number <=1)
		   return false;
	   else
	   {
		   for(int i=2;i<=sqrt;i++) {
			   if(number%i==0)
				   return false;
		   }
	   }
	   return true;
   }
   
   public static void main(String[]args) {
	   new PrimeNumber();
	boolean flag = //PrimeNumber.getPrime(11);
			PrimeNumber.getPrimeusingSqrt(18);
	   if(flag==true)
		   System.out.println("Number is Prime");
		   else System.out.println("Number is not prime");
   }
}
