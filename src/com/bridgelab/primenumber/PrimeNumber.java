package com.bridgelab.primenumber;

/***************************************************
 * @author mihir
 * @param endPoint 
 * @param startpoint 
 * 
 * @since 07-July-2021
 * This class finds prime number between given range.
 * If the number only divisible by 1 and itself then it is said to be prime number.
 ***************************************************/
public class PrimeNumber
{
	private void findPrimeNumbers(int startpoint, int endPoint)
	{
		for (int i = startpoint; i <= endPoint; i++)
		{
			// Skip 0 and 1 as they are
            // neither prime nor composite
            if (i == 1 || i == 0)
            {
                continue;
            }
            // flag variable to tell if i is prime or not
            int flag = 1;
            for (int j = 2; j <= i / 2; ++j)
            {
                if (i % j == 0)
                {
                    flag = 0;
                    break;
                }
            }
            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
            {
                System.out.println(i);
            }
        }
	}
	
	public static void main(String[] args)
	{
		PrimeNumber primeNumberObject = new PrimeNumber();
		//Finding prime numbers between 0 to 1000.
		int startpoint = 0, endPoint = 1000;
		
		primeNumberObject.findPrimeNumbers(startpoint,endPoint);
	}
}
