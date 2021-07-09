package com.bridgelab.guessthenumber;

import java.util.Scanner;

public class GuessTheNumber
{
	int gussedNo;
	public static int count = 0;

	void search(int lowerBound, int upperBound, int num)
	{
		gussedNo = (upperBound + lowerBound) / 2;
		count();
		if (gussedNo == num)
		{
			System.out.println(count);
		}
		else if (gussedNo > num)
		{
			upperBound = gussedNo - 1;
			search(lowerBound, upperBound, num);
		}
		if (gussedNo < num)
		{
			lowerBound = gussedNo + 1;
			search(lowerBound, upperBound, num);
		}
	}
	int count()
	{
		count = count + 1;
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		GuessTheNumber guessObject = new GuessTheNumber();
		System.out.print("Enter the number between range 0 to 100 : ");
		int userNumber = scanner.nextInt();
		
		guessObject.search(0, 100, userNumber);
		scanner.close();
	}
}
