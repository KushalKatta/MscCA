//Accepting the String from the user and checking whether it is Anagram Word

/*
Author: Kushal Katta
Date Created: 2 Aug 2017
Date Last Modified: 3 Aug 2017
*/

import java.util.Arrays;
import java.util.Scanner;

public class Q13
{
    public static void main(String[] args)
    {
        //Getting Input From User
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a String: ");
        String inputStr = scan.nextLine();
        scan.close();
        //Converting String To Upper Case
        inputStr.toUpperCase();
        //Convert String To Array and Sort It And Again Convert to a String
        char[] chars = inputStr.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        //Printing Sorted String
        System.out.println("Anagram Word of "+inputStr+" is " + sorted);
    }
}