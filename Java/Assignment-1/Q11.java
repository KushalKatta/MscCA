//Accepting two numbers in Binary Coded Decimal (BCD) format and performing the addition of them.

/*
Author: Kushal Katta
Date Created: 30 Jul 2017
Date Last Modified: 30 Jul 2017
*/

import java.util.Scanner;

class Q11
{
    //Decimal to Binary
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


    //Binary to Decimal
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
        //Accepting Two Binary Numbers From User
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first Binary Number : ");
        int binNumber1 = scan.nextInt();
        System.out.print("Enter second Binary Number : ");
        int binNumber2 = scan.nextInt();
        scan.close();
        
        //Convert Binary To Decimal
        int number1=ConvertNumber(binNumber1,2,10);
        int number2=ConvertNumber(binNumber2,2,10);
        
        //Add Those Decimal Numbers
        int sumNumber=number1+number2;

        //Convert Sum of the Decimal Number To Binary Again
        String binSumNumber = ConvertNumber(sumNumber, 2);

        //Printing the Binary Number Accepted and their Sum
        System.out.println("Sum of "+binNumber1+"("+number1+") and "+binNumber2+"("+number2+") number is : " + binSumNumber + "("+ sumNumber +")");
    }
}