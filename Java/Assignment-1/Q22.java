/*
Accepting a string from user which is having different tokens as well as separators.
Also accepting one token from user. Separating the tokens from the given string and displaying the count of tokens in the string.
Also checking whether the given token exists or not in the string.
a.	For example: Input string: Hello, World! This is; first lesson        	
b.	Input token: World
c.	Output: Number of tokens = 6
d.	World token exists
*/

/*
Author: Kushal Katta
Date Created: 29 Jul 2017
Date Last Modified: 31 Jul 2017
*/

import java.util.Scanner;

class Tokens{
	//final array of all valid seperators
	static final char[] seperators={',','!',':',';','?','.'};

	//method to calculate the number of tokens in a string
	int numberOfTokens(String input){
		String temp=input;
		for(int i=0;i<seperators.length;i++){
			temp=temp.replace(seperators[i],' ');
		}

		String[] split_count=temp.split(" ");

		return (split_count.length);
	}

	public static void main(String[] args) {
		//Scanner object for input from the user
		Scanner scan=new Scanner(System.in);

		//object of the class
		Tokens tokens=new Tokens();

		//takng input from the user for the first string
		System.out.print("Enter any string : ");
		String input=scan.nextLine();

		//taking input from the user for the second string
		System.out.print("Enter a token word : ");
		String token=scan.next();
		scan.close();
		
		if(input.contains(token))
			System.out.println(token + " is present in " + input + ".");
		else
			System.out.println(token + " is not present in " + input + ".");

		//displaying the total number of tokens
		System.out.println("The number of tokens is : " + tokens.numberOfTokens(input));
	}
}