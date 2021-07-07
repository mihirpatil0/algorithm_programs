package com.bridgelab.anagramdetection;

import java.util.Scanner;

/**********************************************************************************
 * @author mihir
 * 
 * @since 07-July-2021
 * In this class we are checking if two given strings are anagram or not.
 * Length of both the string and character occurrences in the string should be same.
 * Then it is said to be both the strings are anagram.
 **********************************************************************************/

public class AnagramDetection
{
	int[] asciiArray = new int[256];
	boolean isAnagram = true;
	
	private void checkAnagramOrNot(String firString, String seconString)
	{
		//if repeated character found in first string increasing the count in array against that character.
		for(char charecter : firString.toCharArray())
		{
			int index = (int) charecter;
			asciiArray[index] ++;
		}
		//if repeated character found in second string decreasing the count in an array against the same character.
		for(char charecter : firString.toCharArray())
		{
			int index = (int) charecter;
			asciiArray[index] --;
		}
		//checking if character from both the string count in array is zero then it is anagram else it is not a anagram.
		for(int i = 0; i < 256; i ++)
		{
			if(asciiArray[i] != 0)
			{
				isAnagram = false;
				break;
			}
		}
		//printing anagram is not message.
		if(isAnagram)
		{
			System.out.println("Strings " + firString + " and " + seconString + " are Anagram.");
		}
		else
		{
			System.err.println("Strings " + firString + " and " + seconString + " are NOT Anagram.");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.println("Check if both the strings are Anagram Or Not.\n");
		System.out.print("Enter First String : ");
		String firstString = scannerObject.next();
		System.out.print("Enter Second String : ");
		String secondString = scannerObject.next();
		scannerObject.close();
		
		AnagramDetection anagramObject = new AnagramDetection();
		anagramObject.checkAnagramOrNot(firstString, secondString);
	}
}
