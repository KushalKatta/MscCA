//Converting Octal Number to Decimal and Decimal Number to Octal.

/*
Author: Kushal Katta
Date Created: 31 Jul 2017
Date Last Modified: 31 Jul 2017
*/

import java.util.Scanner;

class Q27
{
    //Decimal to Octal
    static String ConvertNumber(int number, int toBase)
    {
        int no1= number;
        String strBase="";
        while (no1 !=0)
        {
            strBase=(no1%toBase)+strBase;
            no1=no1/toBase;
        }
        return strBase;
    }


    //Octal to Decimal
    static int ConvertNumber(int number, int noBase, int toBase)
    {
        int no1= number;
        int strBase=0;
        int expo = 0;
        while (no1 !=0)
        {
            strBase+=(no1%toBase)*Math.pow(noBase,expo);
            no1=no1/toBase;
            expo++;
        }
        return strBase;
    }

    public static void main(String []a)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select a choice");
        System.out.println("1 For Decimal To Octal");
        System.out.println("2 For Octal To Decimal");
        int choice = scan.nextInt();

        System.out.print("Enter a Number : ");
        int number = scan.nextInt();
        scan.close();
        
        switch(choice)
        {
            case 1:
            {
                System.out.println("Octal number of Entered Decimal Number ("+ number +") is " + ConvertNumber(number,8));
                break;
            }
            case 2:
            {
                System.out.println("Decimal number of Entered Octal Number ("+ number +") is " + ConvertNumber(number,8,10));
                break;             
            }
            default:
            {
                System.out.println("Enter Correct Input.");
                break;
            }
        }
    }
}