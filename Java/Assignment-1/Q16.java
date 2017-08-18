//Harshad Number
//Accepting a number from the user and check whether it is Harshad Number

/*
Author: Kushal Katta
Date Created: 27 Jul 2017
Date Last Modified: 27 Jul 2017
*/

import java.util.Scanner;
class Q16
{
    static boolean harshadNo(int number)
    {
        int no=number;
        int sum = 0;
        while(no!=0)
        {
            sum += no%10;
            no/=10;
        }
        //System.out.println("Sum of Digits: " + sum);
        //System.out.println("Entered Number: " + number);

        //If Number is Divisible by Sum of Its Digits And Remainder is 0 Then It is Harshad Number
        if (number%sum==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String []a)
    {
        //Accepting User Input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int number = scan.nextInt();
        scan.close();

        if (harshadNo(number) == true)
        {
            System.out.println(number + " is a Harshad No");
        }
        else
        {
            System.out.println(number + " is not a Harshad No");
        }
    }
}