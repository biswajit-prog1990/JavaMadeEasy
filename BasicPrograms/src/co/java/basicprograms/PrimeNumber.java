package co.java.basicprograms;

public class PrimeNumber {
   public static boolean getPrime(int number) {
	   if(number<=1)
		   return false;
	   for (int i=2;i<number;i++) {
		   if(number%i==0) {
			   return false;
		   }
	   }
	   return true;
   }
   
   public static void main(String[]args) {
	   new PrimeNumber();
	boolean flag = PrimeNumber.getPrime(11);
	   if(flag==true)
		   System.out.println("Number is Prime");
		   else System.out.println("Number is not prime");
   }
}
