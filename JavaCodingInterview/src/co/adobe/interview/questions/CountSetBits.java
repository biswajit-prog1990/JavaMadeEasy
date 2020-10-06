package co.adobe.interview.questions;
/*
 * Program to count set bits in an Integer
 * Set Bits are 1 bits for an Integer, e.g., 6 -> 110 , so the output should be 2
 */

public class CountSetBits {

	private static int countSetBits(int x) {
		int setBits = 0;
		while (x > 0) {
			if (x % 2 != 0)
				setBits += 1;
			x /= 2;
		}

		return setBits;
	}

	public static void main(String[] args) {
		System.out.println(countSetBits(13));
	}

}
