/*
Write an Interface i1 with the method finaAverage() and 1 more interface 12 with findMinimum
Write a Class Calculator which implements both the methods
*/

import java.util.Scanner;
interface i1
{
    void findAverage();
}

interface i2
{
    void findMinimum();
}
class Calculator implements i1, i2
{
    int num1,num2;

    Calculator()
    {
        num1=5;
        num2=10;
    }

    Calculator(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void findAverage()
    {
        System.out.println("Average = " + (num1+num2)/2);
    }
    public void findMinimum()
    {
        int min;
        if(num1<num2)
            min=num1;
        else
            min=num2;
        
        System.out.println("Minimum = " + min);
    }
}

class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 2 Numbers :- ");
        System.out.println();
        System.out.print("Number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Number 2: ");
        int num2 = scan.nextInt();
        
        scan.close();

        Calculator mycalc = new Calculator(num1, num2);
        mycalc.findAverage();
        mycalc.findMinimum();
    }
}