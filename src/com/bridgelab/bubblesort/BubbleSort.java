package com.bridgelab.bubblesort;

/********************************************************************************
 * @author mihir
 * 
 * @since 07-July-2021
 * Sorting integers using bubble sort technique.
 * Generating random integers numbers from random.math() function.
 * storing them inside an array and sorting the array using bubble sort technique. 
 ********************************************************************************/

public class BubbleSort
{
	//generic type of method that sort array using bubble sort technique.
	private<T extends Comparable<T>>T[] sortingUsingBubbleSort(T[] integerArray)
	{
		for (int i = 0; i < integerArray.length-1 ; i++)
		{
			for (int j = 0; j < integerArray.length-i-1; j++)
			{    
				if (integerArray[j].compareTo(integerArray[j+1]) > 0 )
				{
                    T temp = integerArray[j];
                    integerArray[j] = integerArray[j+1];
                    integerArray[j+1] = temp;
                }
			}
		}
		//This method print sorted array.Calling here.
		printSortedArray(integerArray);
		return integerArray;
	}
	
	//Method to print sorted array.
	private<T> void printSortedArray(T[] integerArray)
	{
		System.out.println("Following array is sorted using bubble sort technique :");
		System.out.print("[ ");
		for(T iterator : integerArray)
		{
			System.out.print(iterator + " ");
		}
		System.out.print("]");
	}
	
	
	public static void main(String[] args)
	{
		//Integer object type of array.
		Integer[] integerArray = {75, 33, 10, 4, 7, 35, 78, 54, 29, 1};
		
		BubbleSort bubbleSortObject =  new BubbleSort();
		bubbleSortObject.sortingUsingBubbleSort(integerArray);
	}
}
