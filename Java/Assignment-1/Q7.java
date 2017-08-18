/*
a subclass of Fraction Class, MixedFraction having
a) A int  variable for the whole number
b) A constructor with the whole number, num and den as the arguments. Num and den will be initialized using super class constructors
c) Write a method to convert the MixedFraction Number to Improper Fraction Number.
*/

/*
Author: Kushal Katta
Date Created: 3 Aug 2017
Date Last Modified: 4 Aug 2017
*/

class MixedFraction extends Fraction{

	int whole;

	//Parameterized Constructor
	MixedFraction(int whole, int num, int den){
		super(num,den);
		this.whole=whole;
	}

	//Method to convert MixedFraction number to Improper Fraction Number
	void convert(){
		num=(whole*den)+num;
		System.out.print("Improper Fraction after conversion is : ");
		super.print();
	}

	public static void main(String[] args) {
		//Creating object of the class
		MixedFraction mixedFraction=new MixedFraction(5,3,4);

		//Converting the mixed fraction into improper fraction
		mixedFraction.convert();
	}
}