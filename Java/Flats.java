/* Calculation of Flat Maintainence and Contribution
 * Author: Kushal Katta
 * Date Created: 11 July 2017
 */

import java.util.Scanner;
// Flat Class
class Flat
{	
	//Declaring Attributes
	float flatRent;
	String flatName;
	String flatAddress;

	char controChoice;

/*
	public Flat(float amt, String name, String location, char choice)
	{
		flatRent=amt;
		flatName=name;
		flatAddress=location;
		controChoice=choice;
	}
*/

	//Method To Calculate Flat Maintainence Amount
	void calMaintainence()
	{	
		if (flatRent<15000)
		{
			System.out.println("\nMaintainence Amount = " + flatRent * .02f + "/-");
		}
		else
		{
			System.out.println("\nMaintainence Amount = " + flatRent * .05f + "/-");			
		}

	}

	//Method to know Contribution Amount
	void displayContro()
	{
		System.out.println("\n");
		switch (controChoice)
		{
			case '1':
				System.out.println("Flag Hosting : 500/-");
				break;
			case '2':
				System.out.println("Ganpati : 1000/-");
				break;
			case '3':
				System.out.println("Janmasthami : 250/-");
				break;
			case '4':
				System.out.println("Get Together : 750/-");
				break;
			default:
				System.out.println("Please Enter Correct Input.");
				break;
		}
		System.out.println("\n");
	}	
}//End of Flat Class

class Society
{
	public Society()
	{
		Flat flat1;
		flat1=new Flat();	//20000f,"Kushal","Pune",'4');
		
		flat1.flatRent = 2000f;
		flat1.flatName = "Kushal";
		flat1.flatAddress = "Jodhpur";
		//flat1.controChoice = '2';
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your Choice: ");
		flat1.controChoice = scan.next().charAt(0);

		flat1.calMaintainence();
		flat1.displayContro();
	}
}

class Main
{
	public static void main(String[] a)
	{
		Society society1;
		society1 = new Society();
	}
}
