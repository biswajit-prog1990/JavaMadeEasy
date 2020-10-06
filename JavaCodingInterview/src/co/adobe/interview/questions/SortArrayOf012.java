package co.adobe.interview.questions;

import java.util.Arrays;

/*
 * Program - To Sort Array of 0's 1's and 2's
 */

public class SortArrayOf012 {

	private static int[] getOccurence(int[] inputArray) {
		int[] outputArray = new int[inputArray.length];
		int cntr0 = 0, cntr1 = 0, cntr2 = 0;
		for (int i = 0; i < inputArray.length; i++) {
			cntr0 += inputArray[i] == 0 ? 1 : 0;
			cntr1 += inputArray[i] == 1 ? 1 : 0;
			cntr2 += inputArray[i] == 2 ? 1 : 0;
		}

		int loopCntr = 0;
		while (cntr0 > 0) {
			outputArray[loopCntr++] = 0;
			cntr0--;
		}

		while (cntr1 > 0) {
			outputArray[loopCntr++] = 1;
			cntr1--;
		}

		while (cntr2 > 0) {
			outputArray[loopCntr++] = 2;
			cntr2--;
		}

		return outputArray;
	}

	public static void main(String[] args) {
		int[] x = getOccurence(new int[] { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 });
		System.out.println(Arrays.toString(x));
	}

}
