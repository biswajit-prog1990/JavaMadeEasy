/*
 * Implementation - We will be implementing it as number/2
 * Developer - Biswajit Dutta
 */

package co.java.basicprograms;

public class SquareRootWithoutUsingMathFunction {

	static float squareRoot(int number) {
		float temp;
		
		float sr = number/2;
		do
		{
			temp = sr;
			sr=(temp + (number/temp))/2;
		} while(temp-sr !=0);
		
		return sr;
	}
	public static void main(String[] args) {
		System.out.println(squareRoot(18));
	}

}
