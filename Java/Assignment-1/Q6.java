/*
Creating a class fraction
a.Two instance variables, num and den
b.Constructor with 2 parameters used to initialize the num and den
c.Method to add a number to the fraction
d.Method to subtract a number from the fraction
e.Method to print the fraction
*/

/*
Author: Kushal Katta
Date Created: 3 Aug 2017
Date Last Modified: 3 Aug 2017
*/
class Fraction
{
    //Two instance variables, num and den
    double num, den;

    //Constructor with 2 parameters used to initialize the num and den
    Fraction(int num, int den)
    {
        this.num=num;
        this.den=den;
    }
    
    //Method to add a number to the fraction
    double add(double numAdd)
    {
        numAdd*=den;
        num+=numAdd;
        return (num/den);
    }
    
    //Method to subtract a number from the fraction
    double substract(double numLess)
    {
        numLess*=den;
        num-=numLess;
        return (num/den);
    }

    //Method to print the fraction
    void print()
    {
        System.out.println("Fraction = " + (num/den));
    }
}
class Q6
{
    public static void main(String []a)
    {
        Fraction frac = new Fraction(2,4);
        System.out.println("Added To Fraction: " + frac.add(4));
        System.out.println("Substracted From Fraction: " + frac.substract(1));
        frac.print();
    }
}