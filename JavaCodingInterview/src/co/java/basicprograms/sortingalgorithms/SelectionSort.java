package co.java.basicprograms.sortingalgorithms;

/**
 * Purpose : To find the selection sort algorithm for an Array How To's:
 * Definition: The selection sort algorithm sorts an array by repeatedly finding
 * the minimum element (considering ascending order) from unsorted part and
 * putting it at the beginning. The algorithm maintains two sub arrays in a
 * given array.
 * 
 * 1) The sub array which is already sorted. 2) Remaining sub array which is
 * unsorted.
 * 
 * In every iteration of selection sort, the minimum element (considering
 * ascending order) from the unsorted sub array is picked and moved to the
 * sorted sub array.
 * 
 * Example : arr[] = 64 25 12 22 11
 * 
 * // Find the minimum element in arr[0...4] // and place it at beginning 11 25
 * 12 22 64
 * 
 * // Find the minimum element in arr[1...4] // and place it at beginning of
 * arr[1...4] 11 12 25 22 64
 * 
 * // Find the minimum element in arr[2...4] // and place it at beginning of
 * arr[2...4] 11 12 22 25 64
 * 
 * // Find the minimum element in arr[3...4] // and place it at beginning of
 * arr[3...4] 11 12 22 25 64
 * 
 * @author bisu9
 *
 */

public class SelectionSort {

	private static int[] getSortedArray(int[] inputArray) {
		for (int i = 0; i < inputArray.length - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < inputArray.length; j++)
				if (inputArray[j] < inputArray[minIdx])
					minIdx = j;

			// Swap Elements
			int temp = inputArray[minIdx];
			inputArray[minIdx] = inputArray[i];
			inputArray[i] = temp;
		}

		return inputArray;
	}

	public static void main(String[] args) {
		int[] inputArr = { 11, 24, 10, 9, 65, 87, 5, 3, 99, 12, 6, 8 };
		int[] sortedArr = getSortedArray(inputArr);
		for (int x : sortedArr) {
			System.out.print(x + " ");
		}
	}
}
