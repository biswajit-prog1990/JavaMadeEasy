package co.adobe.interview.questions;
/*
 * Program - To convert Binary to Decimal
 */

public class BinaryDecimalConversion {

	private static int convertBinaryToDecimal(long binary) {
		int decimalNumber = 0;
		int power = 0;
		while (binary > 0) {
			long temp = binary % 10;
			decimalNumber += temp * Math.pow(2, power);
			binary = binary / 10;
			power++;
		}

		return decimalNumber;
	}

	public static void main(String[] args) {
		System.out.println(convertBinaryToDecimal(1101));
	}

}
