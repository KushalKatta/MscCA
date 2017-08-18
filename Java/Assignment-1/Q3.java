//Accepting the lower limit and upper limit from the user, generating Fibonacci Series between the limits and finding the sum of even terms in that series

/*
Author: Kushal Katta
Date Created: 28 Jul 2017
Date Last Modified: 28 Jul 2017
*/

import java.util.Scanner;

class Q3
{
    public static void main(String []a)
    {
        //Created an object of Scanner Class and taking input from user.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Lower Limit Number of Fibonacci Series : ");
        int lowerLimit = scan.nextInt();
        System.out.print("Enter a Upper Limit Number of Fibonacci Series : ");
        int upperLimit = scan.nextInt();
        scan.close();

        //Variables for Iteration
        int i=0;
        int j=1;
        int sum = 0;

        //Loop to print fibonacci and calculating the sum of even terms in series
        for(int k=lowerLimit;i+j<=upperLimit;k++)
        {
            j=i+j;
            i=j-i;
            System.out.println(j);
            if (j%2==0)
            {
                sum+=j;
            }
        }
        System.out.println("Sum of Even Numbers of Fibonacci Series Between "+lowerLimit+" and "+upperLimit+" : " + sum);
    }
}