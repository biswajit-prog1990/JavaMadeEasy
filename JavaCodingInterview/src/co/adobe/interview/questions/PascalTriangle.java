package co.adobe.interview.questions;

/*
 * Program - To print Pascal Triangle
 * 						1
 * 					   1  1
 * 					  1  2  1
 * 					 1  3  3  1
 * 					1  4  6  4  1
 * 				   1  5  10  10 5  1
 * 				  1  6  15  20  15 6 1
 */
public class PascalTriangle {

	private static int factorial(int n) {
		if (n == 0 || n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	private static int nCr(int n, int r) {
		return factorial(n) / (factorial(r) * factorial(n - r));
	}

	private static void createPascalTriangle(int levels) {
		for (int i = 0; i < levels; i++) {
			for (int j = 0; j < levels - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + nCr(i, j));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		createPascalTriangle(10);
	}

}
