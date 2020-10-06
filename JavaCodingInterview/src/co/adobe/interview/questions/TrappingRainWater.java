package co.adobe.interview.questions;

/*
 * Description - This will be a trapping rain water issue
 * Explanation - Suppose you have an array {3,0,2,0,4} -> 7 units of water can be stored
 * 			     3-0 = 3 units stored -> 2 units of array -> 1 unit stored as water is flowing, then 3 units will flow as height is higher
 */

public class TrappingRainWater {

	private static int fetchRainWaterUnits(int[] input) {
		int rainWaterStored = 0;
		int left = 0, right = input.length - 1;
		int maxLeft = input[left];
		int maxRight = input[right];
		while (left < right) {
			if (input[left] <= input[right]) {
				left++;
				maxLeft = Math.max(maxLeft, input[left]);
				rainWaterStored += (maxLeft - input[left]);
			} else {
				right--;
				maxRight = Math.max(maxRight, input[right]);
				rainWaterStored += (maxRight - input[right]);
			}
		}

		return rainWaterStored;
	}

	public static void main(String[] args) {
		System.out.println(fetchRainWaterUnits(new int[] { 7, 0, 4, 2, 5, 0, 6, 4, 0, 5 }));
	}

}
