/*
Declare an Interface i1 with the methods add and substract.
Write a class calculator which implements this interface.
*/

/*
Author: Kushal Katta
Date Created: 6 Sep 207
*/

//Interfaces cant have constructor the all methods are abstract and members are public, static, final

interface i1
{
    int a=99;   //By Default they are static, public and final
    void add(); //By Default they are public, abstract. Not final because then we can't be overridden
    void substract();
}

interface i2 extends i1
{
    // a=88;   //Final Values can't be overridden
    int a=88;
    void multiply();
}
class Calculator
implements i1
{
    int number1=456;
    int number2=654;
    
    /*
    Hierarchy

    Public
    Protected
    Default
    Private
    */
    public void add()   //Not Static but public. It cant be made weaker(Access Privilages can't be made weaker). So When Overriding the access specifier should be public. Though in Abstract Class Privilages can be upgraded but not downgraded.
    //So When Implementing the Interfaces it is not allowed to weaker the access privilages. By Overriding the Methods the access specifier needs to be compulsorily public.
    {
        System.out.println("Sum = " + (number1+number2));     
        System.out.println((i1.a)); //Because Static. So "i1."
        System.out.println((i2.a));
    }
    public void substract()
    {
        System.out.println("Difference = " + (number1-number2));
    }
    public static void main(String[] args) {
        Calculator calci = new Calculator();    //Instance can't be created of abstract class.
        calci.add();
        calci.substract();
        //Class will become abstract if we dont override methods of interface. So Compilation error. So either override methods or declare class as abstractr

    }
}