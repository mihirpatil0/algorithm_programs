package com.bridgelab.mergesort;

import java.util.Arrays;

/*******************************************************************************
 * @author mihir
 * 
 * @since 08-July-2021
 * In this class we are sorting String type of array which has random strings.
 * Using merge sort sorting the array in ascending order and printing the result.
 *******************************************************************************/

public class MergeSort
{
	public static void mergeSort(String[] stringArray, int from, int to)
	{
		if (from == to)
		{
			return;
		}
		int mid = (from + to) / 2;
		// sort the first and the second half
		mergeSort(stringArray, from, mid);
		mergeSort(stringArray, mid + 1, to);
		merge(stringArray, from, mid, to);
	}

	public static void merge(String[] stringArray, int from, int mid, int to)
	{
		int n = to - from + 1; // size of the range to be merged
		String[] tempArray = new String[n]; // merge both halves into a temporary array
		int i = from; // next element to consider in the first range
		int j = mid + 1; // next element to consider in the second range
		int k = 0; // next open position in b

		// as long as neither i1 nor i2 past the end, move the smaller into b
		while (i <= mid && j <= to)
		{
			if (stringArray[i].compareTo(stringArray[j]) < 0)
			{
				tempArray[k] = stringArray[i];
				i++;
			}
			else
			{
				tempArray[k] = stringArray[j];
				j++;
			}
			k++;
		}
		// only one of the two while loops below is executed
		// copy any remaining entries of the first half
		while (i <= mid)
		{
			tempArray[k] = stringArray[i];
			i++;
			k++;
		}
		// copy any remaining entries of the second half
		while (j <= to)
		{
			tempArray[k] = stringArray[j];
			j++;
			k++;
		}
		// copy back from the temporary array
		for (k = 0; k < n; k++)
		{
			stringArray[from + k] = tempArray[k];
		}
	}
	
	public static void main(String[] args)
	{
		String[] stringArray = { "naruto", "hinata", "kakashi", "hokage", "leaf", "village" };
		System.out.println("Before sorting " + Arrays.toString(stringArray) + "\n");
		
		mergeSort(stringArray, 0, stringArray.length - 1);
		System.out.println("After sorting " + Arrays.toString(stringArray));
	}
}
