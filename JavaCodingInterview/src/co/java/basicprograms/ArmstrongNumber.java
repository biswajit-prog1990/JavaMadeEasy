/*
 * Implementation - Armstrong number is the one where 153 = 1^1^1 + 5^5^5 + 3^3^3
 * Developer - Biswajit Dutta
 */

package co.java.basicprograms;

public class ArmstrongNumber {
    static void getArmstrongOrNot(int number) {
    	int temp = number;
    	int check=0,unitDigit;
    	
    	while(number!=0) {
    		unitDigit = number % 10;
    		number = number / 10;
    		check = check + (unitDigit*unitDigit*unitDigit);
    	}
    	
    	if(temp == check)
    		System.out.println("Number is armstrong");
    	else
    		System.out.println("Number is not armstrong");
    }
    
    public static void main(String[]args) {
    	ArmstrongNumber.getArmstrongOrNot(153);
    }
}
