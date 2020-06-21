/*
 * To print pattern of pyramid -
 *   1.        *
 *            *  *
 *           *  *  *
 *          *  *  *  *
 *   2.  *
 *       * *
 *       * * *
 *       * * * *
 *   3.  * * * *
 *        * * *
 *          *
 */

package co.java.basicprograms;

public class PyramidProblem {

	static void pattern1() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	static void pattern2() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern3() {
		for(int i=5;i>=0;i--) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern1();
		System.out.println();
		pattern2();
		System.out.println();
		pattern3();
	}

}
