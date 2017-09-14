/*
Write a Java Program with a class Student with Attributes Name & Age
Write A Method void checkEligiblity() if the age is less than 18 throw an Exception "Age not Valid"
*/

import java.util.Scanner;

class Person
{
    String name;
    int age;

    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    void display()
    {
        System.out.println("Person Details: ");
        System.out.println("Person Name: " + name);
        System.out.println("Person Details: " + age);
        
        try
        {
            checkElegibility();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            System.out.println("Completed!");
        }
    }

    void checkElegibility() throws Exception
    {
        Exception myException = new Exception("Age not Valid!!");
        if(age<18)
        {
            throw myException;
        }
        else
        {
            System.out.println("Age is Valid!");
        }
    }
}

class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Person Details :- ");
        System.out.println();
        System.out.print("Name : ");
        String name = scan.next();
        System.out.print("Age : ");
        int age = scan.nextInt();
        
        scan.close();

        Person person1 = new Person(name, age);
        person1.display();
    }
}