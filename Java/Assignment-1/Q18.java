//Accepting the Number in words and counting the consonants from that string.

/*
Author: Kushal Katta
Date Created: 27 Jul 2017
Date Last Modified: 27 Jul 2017
*/

import java.util.Scanner;
class Q18
{
    public static void main(String [] args)
    {
        //Created an object of Scanner Class and taking input from user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String inputStr = scan.nextLine();
        inputStr.toLowerCase();
        scan.close();

        int count=0;

        for(int i=0;i<inputStr.length()-1;i++)
        {
            //Check Each Character If Vowel Or Consonant
            int ch = inputStr.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
            }
            else
            {
                count++;
            }
        }

        System.out.println("There are "+count+" consonants in the Entered String.");


    }
}