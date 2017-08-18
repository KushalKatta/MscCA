//Generating 10 random numbers and add their digits.

/*
Author: Kushal Katta
Date Created: 2 Aug 2017
Date Last Modified: 4 Aug 2017
*/

import java.util.Random;

class Q2
{
	public static void main(String[] args)
	{
		//Generate random numbers
		Random random = new Random();
		long fiftyDigitNumber[][] = new long[10][50];
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<50; j++)
			{
				fiftyDigitNumber[i][j] = random.nextInt(9) + 1;
			}
		}

		//Calculating Sum of Digits
		int sum[] = new int[10];
		for(int i=0; i<10;i++)
		{
			sum[i]=0;
			for(int j=0; j<50; j++)
			{
				sum[i]+=fiftyDigitNumber[i][j];
			}
		}

		//Printing Above generated Random Numbers and their sum of digits
		for(int i=0; i<10;i++)
		{
			System.out.print("Sum of ");
			for(int j=0; j<50; j++)
			{
				System.out.print(fiftyDigitNumber[i][j]);
			}
			System.out.println(": " + sum[i]);
		}
	}
}