//Finding the largest palindrome made from the product of two 4-digit numbers.

/*
Author: Kushal Katta
Date Created: 27 Jul 2017
Date Last Modified: 27 Jul 2017
*/

class Q17
{
	public static void main(String[] args)
	{
		int i, j;
		boolean isPalindrome = false;
		for(i=9999, j=9999; i>0 && j>0;)
		{
			int product = i*j;
			isPalindrome = ifPalindrome(product);
			if(isPalindrome)
			{
				System.out.println("Largest Palindrome No made from product of two 4-digit numbers: ("+i+" * "+j+") = " + product);
				break;
			}
			if(i==1)
			{
				j--;
			}
			else{
				i--;
			}
		}
	}

	//Check If Generated Number is Palindrome
	static boolean ifPalindrome(int product)
	{
		int temp = product;
		String Str = String.valueOf(product);
		String reverse = "";
		while(temp != 0)
		{
			int r = temp % 10;
			reverse = reverse + String.valueOf(r);
			temp = temp / 10;
		}
		if(reverse.equals(Str))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}