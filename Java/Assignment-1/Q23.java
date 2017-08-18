/*
Program For a certain electrical circuit with an inductance L and resistance R,
the damped frequency is calculated by:
Frequency = ((1/LC)-(R^2/4C^2))^1/2
It is desired to study the variation of this with C(capacitance).
So Program to Calculate the frequency for different values of C starting from 0.01 to 0.1 in steps of 0.01
*/

/*
Author: Kushal Katta
Date Created: 24 Jul 2017
Date Last Modified: 24 Jul 2017
*/

class Frequency{
	//data members
	double L=0.2;
	double R=0.5;

	//method to calculate frequency
	double calcFrequency(double C){
		return (Math.pow(((1/(L*C))-((Math.pow(R,2))/(Math.pow((4*C),2)))),0.5));
	}

	public static void main(String[] args) {
		//object of the class
		Frequency frequency=new Frequency();

		double i=Math.pow(10,-2);

		while(i<=Math.pow(10,-1)) {
			System.out.println("Damped Frequency for C=" + ((double)Math.round(i*100d)/100d) + " is : " + frequency.calcFrequency(((double)Math.round(i*100d)/100d)));
			i=i+Math.pow(10,-2);
		}
	}
}