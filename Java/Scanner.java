//Scanner is Console Based input

//Package is collection of classes and other packages

import java.util.Scanner;

class Calculator
{
    public static void main(String []a)
    {
        //Create an object of Scanner Class
        Scanner scan = new Scanner(System.in);
        //Read Input
        System.out.print("Enter a Number: ");
        //Reading Number
        //next is used to string
        //nextInt or nextFloat is used to take input of that type
        int number=scan.nextInt();
        //Read Subject
        System.out.println("Enter Subject Name: ");
        String name = scan.next();
        //Display the values
        System.out.println("\nName is " + name);
        System.out.println("Number is " + number);

    }
}