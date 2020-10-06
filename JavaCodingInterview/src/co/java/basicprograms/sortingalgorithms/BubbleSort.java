package co.java.basicprograms.sortingalgorithms;

/**
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly
 * swapping the adjacent elements if they are in wrong order. Example: First
 * Pass: ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two
 * elements, and swaps since 5 > 1. ( 1 5 4 2 8 ) –> ( 1 4 5 2 8 ), Swap since 5
 * > 4 ( 1 4 5 2 8 ) –> ( 1 4 2 5 8 ), Swap since 5 > 2 ( 1 4 2 5 8 ) –> ( 1 4 2
 * 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does
 * not swap them.
 * 
 * Second Pass: ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ) ( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ),
 * Swap since 4 > 2 ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) ( 1 2 4 5 8 ) –> ( 1 2 4 5 8
 * ) Now, the array is already sorted, but our algorithm does not know if it is
 * completed. The algorithm needs one whole pass without any swap to know it is
 * sorted.
 * 
 * Third Pass: ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) ( 1
 * 2 4 5 8 ) –> ( 1 2 4 5 8 ) ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
 * 
 * @author bisu9
 *
 */

public class BubbleSort {

	private static int[] getSortedArray(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] > inputArray[j]) {
					int temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
		return inputArray;
	}

	public static void main(String[] args) {
		int[] inputArr = { 5, 1, 4, 2, 8 };
		int[] sortedArr = getSortedArray(inputArr);
		for (int x : sortedArr) {
			System.out.print(x + " ");
		}
	}
}
