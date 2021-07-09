package com.bridgelab.primepalindrome;

/*************************************************************
 * @author mihir
 * 
 * @since 09-July-2021
 * In this class we are printing from a given range of numbers.
 * which are prime as well as palindrome also. 
 *************************************************************/

public class PrimePalindRome
{
	/**
	 * @param number
	 * @return
	 * 
	 * Function that takes number from a defined range on by one.
	 * and checks if the number is prime number or not.
	 * if prime number returns true else false.
	 */
	private boolean isPrime(int number)
	{
		int counter = 0;
		for(int i = 2; i < number; i++)
		{
			if(number % i == 0)
			{
				counter ++;
			}
		}
		if(counter == 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * @param number
	 * @return
	 * 
	 * Function that takes number from a defined range and checks one by one
	 * if the number is palind rome or not is yes returns true.
	 */
	private boolean isPalindRome(int number)
	{
		int temp = number;
		int reverse = 0;
		while(temp != 0)
		{
			reverse = reverse * 10 + temp % 10;
			temp = temp / 10;
		}
		if(number == reverse)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args)
	{
		PrimePalindRome primePRObject =  new PrimePalindRome();
		System.out.println("Following are the prime as well as palind rome numbers.\n");
		for(int i = 0; i <= 1000; i++)
		{
			if(primePRObject.isPrime(i) && primePRObject.isPalindRome(i))
			{
				System.out.print(i + " ");
			}
		}
	}
}
