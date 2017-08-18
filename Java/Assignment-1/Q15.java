//Add two Numbers without carry 

/*
Author: Kushal Katta
Date Created: 28 Jul 2017
Date Last Modified: 28 Jul 2017
*/

import java.util.Scanner;

class Q15
{
    public static void main(String [] args)
    {
        //Created an object of Scanner Class and taking input from user.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        int number1 = scan.nextInt();

        System.out.print("Enter second Number: ");
        int number2 = scan.nextInt();

        scan.close();

        //Variable To Store Result
        String strResult="";

        //Finding Which Number is Smaller and Larger
        int smallNumber=0;
        int largeNumber=0;

        if (number1<number2)
        {
            smallNumber=number1;
            largeNumber=number2;
        }
        else
        {
            smallNumber=number2;
            largeNumber=number1;
        }

        //Adding The Number Digit By Digit
        while(smallNumber!=0)
        {
            int lastDigit1 = smallNumber%10;
            smallNumber/=10;
            int lastDigit2 = largeNumber%10;
            largeNumber/=10;
            int lastDigit = lastDigit1+lastDigit2;
            //Ignore Carry
            if (lastDigit>9)
            {
                lastDigit=lastDigit%10;
            }
            //Store in Result String
            strResult=(lastDigit) + strResult;
        }
        strResult=(largeNumber) + strResult;

        //Printing the output
        System.out.println("Addition of 2 Numbers Without Considering Carry: " + Integer.parseInt(strResult));
    }
}