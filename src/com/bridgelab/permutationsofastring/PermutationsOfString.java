package com.bridgelab.permutationsofastring;

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
	//finding string possible permutation using recursion method.
	public static void recursion(String question, String asnwer)
	{	
		if(question.length() == 0)
		{
			System.out.print(asnwer + "\t");
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
				
				System.out.print(sb.charAt(r));
				sb.deleteCharAt(r);
				
				temp = q;
			}
			System.out.print("\t");
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
	
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Enter The String : ");
		String userString = scannerObject.next();
		System.out.print("Recurssion output : \t");
		recursion(userString,"");
		System.out.print("\nItertive output : \t");
		iterative(userString);
		scannerObject.close();
	}
}
