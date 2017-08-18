/*
Program with a class called as ComplexNumber2.

//A complex number is a number that can be expressed in the form a + bi, where a and b  are real numbers and i is the imaginary unit, where i2 = -1.

Three methods in a class which will perform
1) Substraction of complex numbers.
2) Multiplication of two complex numbers.
*/

/*
Author: Kushal Katta
Date Created: 3 Aug 2017
Date Last Modified: 3 Aug 2017
*/

class ComplexNumber2{

	int real;
	int imaginary;

	//Non Parameterized Constructor
	ComplexNumber2(){
		this.real=0;
		this.imaginary=0;
	}

	//Parameterized Constructor
	ComplexNumber2(int real, int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}


	//Substraction of complex numbers.
	ComplexNumber2 subtract(ComplexNumber2 ComplexNumber22){
		ComplexNumber2 temp=new ComplexNumber2();

		temp.real=this.real - ComplexNumber22.real;
		temp.imaginary=this.imaginary - ComplexNumber22.imaginary;

		return temp;
	}

	//Multiplication of two complex numbers.
	ComplexNumber2 multiply(ComplexNumber2 ComplexNumber22){
        ComplexNumber2 temp = new ComplexNumber2();

        temp.real=(this.real*ComplexNumber22.real)-(this.imaginary*ComplexNumber22.imaginary);
        temp.imaginary=(this.real*ComplexNumber22.imaginary)+(this.imaginary*ComplexNumber22.real); 

        return temp;
	}
	//Display Complex Number
	public void display(){
		if (this.imaginary>=0)
			System.out.print(this.real + " +" + this.imaginary + "i\n");
		else
			System.out.print(this.real + " " + this.imaginary + "i\n");
	}

	public static void main(String[] args) {
		//objects of the class
		ComplexNumber2 ComplexNumber21=new ComplexNumber2(3,4);
		ComplexNumber2 ComplexNumber22=new ComplexNumber2(1,6);

		//displaying the 2 complex numbers
		System.out.print("First complex number : ");
		ComplexNumber21.display();
		System.out.print("Second complex number : ");
		ComplexNumber22.display();

		//object to store the result of subtraction
		ComplexNumber2 result_subtraction=new ComplexNumber2();
		result_subtraction=ComplexNumber21.subtract(ComplexNumber22);

		//displaying the result of subtraction
		System.out.print("Result of Subtraction is : ");
		result_subtraction.display();

		//object to store the result of multiplication
		ComplexNumber2 result_multiplication=new ComplexNumber2();
		result_multiplication=ComplexNumber21.multiply(ComplexNumber22);


		//displaying the result of multiplication
		System.out.print("Result of multiplication is : ");
		result_multiplication.display();

		
	}
}