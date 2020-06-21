/*
 * Implementation - To remove Duplicates from an array and print the array in a sorted manner
 * Developer - Biswajit Dutta
 */
package co.java.basicprograms;

import java.util.Arrays;

public class RemoveDuplicatesArray {
	
	static int removeDuplicates(int[]x) {
		int []temp = new int[x.length];
		int j=0;
		for(int i=0;i<x.length-1;i++) {
			if(x[i]!=x[i+1]) {
				temp[j++]=x[i];
			}
		}
		temp[j++]=x[x.length-1];
		for(int i=0;i<j;i++) {
			x[i]=temp[i];
		}
		
		return j;
	}

	public static void main(String[] args) {
		int[]arr = {10,20,20,45,15,36,88,75,15,20,10,1,0,99,66};
		Arrays.sort(arr);
		int n = arr.length;
		n=RemoveDuplicatesArray.removeDuplicates(arr);		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");

	}

}
