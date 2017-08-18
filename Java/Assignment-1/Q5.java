/*
Program with a class called as ComplexNumber1.

//A complex number is a number that can be expressed in the form a + bi, where a and b  are real numbers and i is the imaginary unit, where i2 = -1.

Three methods in a class which will perform
1) Addition of complex numbers.
2) Multiplication of two complex numbers.
*/

/*
Author: Kushal Katta
Date Created: 3 Aug 2017
Date Last Modified: 3 Aug 2017
*/

class ComplexNumber1{

	int real;
	int imaginary;

	//Non Parameterized Constructor
	ComplexNumber1(){
		this.real=0;
		this.imaginary=0;
	}

	//Parameterized Constructor
	ComplexNumber1(int real, int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}

	//Addition of complex numbers.
	ComplexNumber1 add(ComplexNumber1 ComplexNumber12){
		ComplexNumber1 temp=new ComplexNumber1();

		temp.real=this.real+ComplexNumber12.real;
		temp.imaginary=this.imaginary+ComplexNumber12.imaginary;

		return temp;
	}

	//Multiplication of two complex numbers.
	ComplexNumber1 multiply(ComplexNumber1 ComplexNumber12){
        ComplexNumber1 temp = new ComplexNumber1();

        temp.real=(this.real*ComplexNumber12.real)-(this.imaginary*ComplexNumber12.imaginary);
        temp.imaginary=(this.real*ComplexNumber12.imaginary)+(this.imaginary*ComplexNumber12.real); 

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
		//2 Objs
		ComplexNumber1 ComplexNumber11=new ComplexNumber1(3,4);
		ComplexNumber1 ComplexNumber12=new ComplexNumber1(1,6);

		//displaying the 2 complex numbers
		System.out.print("First complex number : ");
		ComplexNumber11.display();
		System.out.print("Second complex number : ");
		ComplexNumber12.display();

		//object to store the result of addition
		ComplexNumber1 result_addition=new ComplexNumber1();
		result_addition=ComplexNumber11.add(ComplexNumber12);

		//displaying the result of addition
		System.out.print("Result of addition is : ");
		result_addition.display();

		//object to store the result of multiplication
		ComplexNumber1 result_multiplication=new ComplexNumber1();
		result_multiplication=ComplexNumber11.multiply(ComplexNumber12);


		//displaying the result of multiplication
		System.out.print("Result of multiplication is : ");
		result_multiplication.display();

	}
}