package co.java.basicprograms;

/*
 * Program - Fibonacci Series 0 1 1 2 3 5 8 ...
 * Author - Biswajit Dutta
 * 
 */
import java.util.*;
public class FibonacciSeries {
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
   
   public static void main(String[]args) {
	   Scanner in = new Scanner(System.in);
	   System.out.println("Enter a limit:");
	   int n= in.nextInt();
	   FibonacciSeries.printSeries(n);
   }
}
