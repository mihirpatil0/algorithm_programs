package com.bridgelab.permutationsofastring;

import java.util.Arrays;
import java.util.Scanner;

/*******************************************************************
 * @author mihir
 * 
 * @since 08-July-2021
 * In this class we are finding all possible permutation of a string.
 * Using Iterative and Recursion Method.
 *******************************************************************/

public class PermutationsOfString
{
	static String[] recusrsionArray, iterativeArray;
	static int fact = 1, counter = 0, iteCounter = 0;
	
	//finding string possible permutation using recursion method.
	public static void recursion(String question, String asnwer)
	{	
		if(question.length() == 0)
		{
			//storing each permutation in array.
			recusrsionArray[counter] = asnwer;
			counter ++;
			return;
		}
		
		for(int i = 0; i < question.length(); i++)
		{	
			char ch = question.charAt(i);
			String questionLeftPart = question.substring(0, i);
			String questionRightPart = question.substring(i + 1);
			String restOfTheQuestion = questionLeftPart + questionRightPart;
			recursion(restOfTheQuestion, asnwer + ch);//calling method recursively.
		}
	}
	/*****************************************************/
	
	/**
	 * @param str
	 * Finding permutation using iterative method. 
	 */
	public static void iterative(String str)
	{
		int n = str.length();
		int f = factorial(n);
		
		for(int i = 0; i < f; i++)
		{	
			StringBuilder sb = new StringBuilder(str);
			int temp = i;
			for(int div = n; div >= 1; div--)
			{
				int q = temp / div;
				int r = temp % div;
				
				System.out.println(sb.charAt(r));
				iterativeArray[iteCounter] = String.valueOf(sb.charAt(r));
				iteCounter ++;
				sb.deleteCharAt(r);
				
				temp = q;
			}
			System.out.println();
		}
	}
	
	public static int factorial(int n)
	{
		int val = 1;
		for(int i = 2; i <= n; i++)
		{
			val *= i;
		}
		return val;
	}
	
	/**
	 * printing the array that holds permutation of string.
	 */
	public static void printArray()
	{
		System.out.println("Permutation of a string using iterative method : " + Arrays.toString(iterativeArray));
		System.out.println("Permutation of a string using recursive method : " + Arrays.toString(recusrsionArray));
	}
	
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Enter The String : ");
		String userString = scannerObject.next();
		
		/*permutation will always be string lenght factorial i.e n!
		 * factorial number will be the size of an array to store the all permutation.
		 */
		int num = userString.length();
		for(int i = 2; i <= num; i++)
		{
			fact *= i;
		}
		recusrsionArray = new String[fact];
		iterativeArray = new String[fact];
		
		recursion(userString,"");
		iterative(userString);
		scannerObject.close();
		printArray();
	}
}
