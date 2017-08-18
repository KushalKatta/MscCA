//Accepting a number from the user and finding the double factorial.

/*
Author: Kushal Katta
Date Created: 3 Aug 2017
Date Last Modified: 3 Aug 2017
*/

import java.util.Scanner;
class Q8
{
    public static void main(String []a)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int number = scan.nextInt();
        scan.close();

        int product = 1;

        int i=0;
        //Calculating Double Factorial
        for(i=1;i<=number;i+=2)
        {
            product*=i;
        }
        System.out.println("Double Factorial of " + number + " is " + product);
    }   
}