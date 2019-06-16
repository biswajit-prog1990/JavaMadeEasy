/*
 * Program - Fibonacci Series 0 1 1 2 3 5 8 ...
 * Implementation - Normal Implementation via Loops and implementation by Recursion
 * Developer - Biswajit Dutta
 * 
 */

package co.java.basicprograms;

import java.util.*;
public class FibonacciSeries {
   private static Scanner in;

public static void printSeries(int limit) {
	   int a = 0, b=1, c;
	   System.out.print(a+" "+b+" ");
	   int i=0;
	   while(i<limit) {
		   c=a+b;
		   a=b;
		   b=c;
		   System.out.print(c+" ");
		   i++;
	   }
	   System.out.println();
   }
   
   public static int FibonacciRecursion(int limit) {
	   if(limit == 0 || limit == 1)
		    return 1;
	   else
		   return FibonacciRecursion(limit-1)+FibonacciRecursion(limit-2);
   }
   
   public static void main(String[]args) {
	   in = new Scanner(System.in);
	   System.out.println("Enter a limit:");
	   int n= in.nextInt();
	   FibonacciSeries.printSeries(n);
	   System.out.print(FibonacciRecursion(n)+" ");
   }
}
