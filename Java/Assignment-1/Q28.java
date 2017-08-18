/*
Accepting 2 digits from the user and an operator.
Performing the operation and firing the following user defined message for the following situations:
a.	If the user enters arguments not in the order of int, int fire IllegalArgumentOrder.
b.	If the user enters arguments any operator other than *, +, - and / fire IllegalOperator.
c.	If the result is –ve number then fire “Negative Number”.
d.	If the result is 0 then fire “ZeroNumber”.
*/

/*
Author: Kushal Katta
Date Created: 31 Jul 2017
Date Last Modified: 31 Jul 2017
*/


import java.util.Scanner;

class TwoNumbers{
	//data members of the class
	String num1;
	String num2;
	char operator;

	//method to accept input
	void accept(){
		//Scanner object
		Scanner scan=new Scanner(System.in);

		//accepting the 2 numbers from the user
		System.out.print("Enter the first number : ");
		num1=scan.next();
		System.out.print("Enter the second number : ");
		num2=scan.next();

		//accepting the operator from the user
		System.out.print("Enter the operator : ");
		operator=scan.next().charAt(0);

		scan.close();
	}

	//method to check the order of arguments
	boolean validOrder(){
		try{
			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2);
		}
		catch(Exception ex){
			System.out.println("IllegalArgumentOrder.");
			return false;
		}
		return true;
	}

	//method to check operator
	boolean checkOperator(){
		if (operator=='*' || operator=='+' || operator=='-' || operator=='/'){		
			return true;
		}
		System.out.println("IllegalOperator.");
		return false;
	}

	//method to calculate the result
	void calculateResult(){
		//valid integers and valid operators
		int number1=Integer.parseInt(num1);
		int number2=Integer.parseInt(num2);

		double result=0.0;

		switch(operator){
			case '+':
				result=number1+number2;
				break;
			case '-':
				result=number1-number2;
				break;
			case '*':
				result=number1*number2;
				break;
			case '/':
				result=number1/number2;
				break;
		}
		if(result==0.0)
			System.out.println("ZeroNumber.");
		else if(result<0.0)
			System.out.println("NegativeNumber.");
		else
			System.out.println("Result is : " + result);
	}

	//main method
	public static void main(String[] args) {
		//object of the class
		TwoNumbers object=new TwoNumbers();

		//accept
		object.accept();

		if(object.checkOperator() && object.validOrder()){
			object.calculateResult();
		}
	}//end main
}//end class