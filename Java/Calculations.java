/*
Author: Kushal Katta
Date Created: 19 July 2017
*/

import java.util.Scanner;

class Calculations
{
    static byte varByte;
    static short varShort;
    static long varLong;
    static char varChar;
    static int varInt;
    static float varFloat;
    static double varDouble;
    static boolean varBoolean;
        
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String []a)
    {
        //ques1();
        //ques2();
        //ques3();

        rangePerfect();
    }
    static void ques1()
    {
        //Write a Java Program to print the default values of primitive data types
        System.out.println("Byte: " + varByte);
        System.out.println("Short: " + varShort);
        System.out.println("Long: " + varLong);
        System.out.println("Char: " + varChar);
        System.out.println("Int: " + varInt);
        System.out.println("Float: " + varFloat);
        System.out.println("Double: " + varDouble);
        System.out.println("Boolean: " + varBoolean);
    }
    static void ques2()
    {
        //Write a Java Program to accept a number from user and check whetger it is perfect number or not.
        //A number is perfect if the sum of divisors of that number is equal to original number eg:- 6=> 1,2,3 & sum= 6
        System.out.print("Enter A Number: ");
        int number = scan.nextInt();

        int sum=0;

        int i=0;
        for(i=1;i<number;i++)
        {
            if(number % i == 0)
            {
                sum+=i;
                //System.out.println(i);
            }
        }
        if (sum==number)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not Perfect Number");
        }
    }
    static void ques3()
    {
        //Write a Java Program To accept a number from user & calculate double factorial.
        //Double factorial is => multiplication of odd numbers between 1 to that number
        //eg Double Factorial of 5 = 1*3*5=15
        System.out.print("Enter A Number: ");
        int number = scan.nextInt();

        int product = 1;

        int i=0;
        for(i=1;i<=number;i+=2)
        {
            product*=i;
        }
        System.out.println("Double Factorial of " + number + " is " + product);
    }
    static void checkPerfect(int number)
    {
        int sum=0;

        int i=0;
        for(i=1;i<number;i++)
        {
            if(number % i == 0)
            {
                sum+=i;
                //System.out.println(i);
            }
        }
        if (sum==number)
        {
            System.out.println(number + " is Perfect Number");
        }
        else
        {
            //System.out.println(number + " is Not Perfect Number");
        }
    }
    static void rangePerfect()
    {
        System.out.print("Enter a Number: ");
        int l = scan.nextInt();
        System.out.print("Enter Second Number: ");
        int u = scan.nextInt();
        while (l<=u)
        {
            checkPerfect(l);
            l++;
        }
    }
}