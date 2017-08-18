//A class Rational Number representing the rational number(e.g. a/b). 
//Having two instance variables, num and den
//And a Constructor with 2 parameters used to initialize the num and den.
//And Two methods in the class which will perform the additon and multiplication of two Rational Numbers.

/*
Author: Kushal Katta
Date Created: 3 Aug 2017
Date Last Modified: 3 Aug 2017
*/


//A class Rational Number representing the rational number(e.g. a/b). 
class RationalNumber
{
    //two instance variables, num and den
    double num, den;

    //Constructor with 2 parameters used to initialize the num and den.
    RationalNumber(int num, int den)
    {
        this.num=num;
        this.den=den;
    }

    //Method to perform additon of two Rational Numbers.
    double add(RationalNumber numAdd)
    {
        return (num/den)+(numAdd.num/numAdd.den);
    }

    //Method to perform multiplication of two Rational Numbers.
    double multiply(RationalNumber numAdd)
    {
        return (num/den)*(numAdd.num/numAdd.den);
    }
}
class Q9
{
    public static void main(String []a)
    {
        RationalNumber rational1 = new RationalNumber(2,4);
        RationalNumber rational2 = new RationalNumber(2,4);
        System.out.println("Added To Fraction: " + rational1.add(rational2));
        System.out.println("Multiplied To Fraction: " + rational1.multiply(rational2));
    }
}