/*
 * Implementation - We will be using Math.floor to check the nearest possible value for the integer
 * Developer - Biswajit Dutta
 */

package co.java.basicprograms;

public class checkPerfectSquare {
	
	static boolean checkPerfectSq(int number) {
		float sqrt = (float)Math.sqrt(number);
		return (sqrt - Math.floor(sqrt) == 0);
	}

	public static void main(String[] args) {
		boolean b= checkPerfectSq(18600);
		if(b==true)
			System.out.println("Perfect Square");
		else
			System.out.println("Not a Perfect Square");
	}

}
