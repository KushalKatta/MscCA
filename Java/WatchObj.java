/* First Java Code : Representing Watch Object
 * Author : Kushal Katta
 * Date Created : 04 July 2017
 */

class Watch
//Class is a user defined data type (Non Primitive Data Type)

{
	//Attributes: Variables
	float price;
	String brand,color;

	//Behaviour: Methods
	boolean isOn()
	{
		return true;
	}

	boolean isOff()
	{
		return false;
	}
}

class Person
{
	//Attributes of Person Class
	String name;
	char gender;
	byte age;

	//Behaviour of Person Class
	void watchList()
	{
		//Create Object: Watch Class
		
		//Declare Variables of Watch Type
		Watch timex, fastrack; //Reference Type or User Defined Data Types
		//Memory Not Allocated yet just Declared a variable of Watch Data Type
		
		//Creating Object Now
		timex=new Watch();
		fastrack=new Watch();
		//Now Memory Allocated;

		//These variables are called instance becoz they are created as instance of obj or assigned a memory
		
		//Assign the values (using Reference Operator(.)
		timex.price=2500;
		timex.brand="Timex";
		timex.color="Black And Silver";

		fastrack.price=3000;
		fastrack.brand="Fastrack";
		fastrack.color="Black";

		//To print output on console
		//Display the list
		
		System.out.println("****My Watches List****"); //S in System is always Capital bcoz System is a class
		System.out.println();

		System.out.println("****First Watch****");
		System.out.println("Brand : " + timex.brand);
		System.out.println("Colour : "+ timex.color);
		System.out.println("Price : " + timex.price);
		
		System.out.println("****Second  Watch****");
                System.out.println("Brand : " + fastrack.brand);
                System.out.println("Colour : "+ fastrack.color);
                System.out.println("Price : " + fastrack.price);

	}
	//Watch List Method Completed
}
//Person Class Ended

//Main Class

//Java is Compiled(Whole File) and Interpreted(Line by Line Compilateion) both to convert Source Code to byte code.
//Java Virtual Machine (JVM) now converts byte code to binary code.
//To Run Java Runtime Environment(JRE) and JVM (converts byte code to)
//To Run Java Development Kit JDK and JVM both.
//
//JAR Java ARchieve file - .class files(Byte Code) are combined to a jar file. which can b given to client i.e. .java(Source Code) need not be given
//


//static allocates memory to a func. declared as static.
//so no creation of obj is needed to access class. only 1 copy is created.
//
//The Variable is to be declared as static when value is same for all objects. like institution value. ie static variables are shared and or used and or accessible to all objects.
//
//static varialbe are also called as Class Variable /Methods/Run Time/ Compile Time Variables.
//
//Static => Memory Allocation
//
//Main should be given memory before execution at the time of compilation so they are called as run time variable.


class MainClass
{
	public static void main(String []a)
	{
		//Main Method
		
		Person person;
		person=new Person();
		//Constructor used to construct method ie. creates a object and reaserve the memory for all variable of such class and allocation and its initialization(Assignment).
		//Brackets bcoz its a method named same as class name.Its a special method.
		//Call Watchlist Method
		
		person.watchList();
	}
}
