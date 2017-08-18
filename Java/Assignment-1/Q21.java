/*
Displaying different choices to the user for temperature conversion as :

1. Kelvin To Celsius
2. Kelvin To Fahrenheit
3. Celsius To Kelvin
4. Fahrenheit To Kelvin
5. Celsius To Fahrenheit
6. Fahrenheit To Celsius

*/


/*
Author: Kushal Katta
Date Created: 26 Jul 2017
Date Last Modified: 28 Jul 2017
*/
import java.util.Scanner;

class Temperature
{
    float sourceTemp;
    Temperature()
    {
    }
    //Constructor to assign instance variable
    Temperature(float sourceTemp)
    {
        this.sourceTemp=sourceTemp;
    }

    //  1. Kelvin To Celsius
    float KelvinToCelsius()
    {
        return (sourceTemp-273.15f);
    }

    //  2. Kelvin To Fahrenheit
    float KelvinToFahrenheit()
    {
        return ((sourceTemp*9/5)-459.67f);
    }
    
    //  3. Celsius To Kelvin
    float CelsiusToKelvin()
    {
        return (sourceTemp+273.15f);
    }

    //  4. Fahrenheit To Kelvin
    float FahrenheitToKelvin()
    {
        return ((sourceTemp+459.67f)*5/9);
    }

    //  5. Celsius To Fahrenheit
    float CelsiusToFahrenheit()
    {
        return ((sourceTemp*9/5)+32);
    }   
    
    //  6. Fahrenheit To Celsius
    float FahrenheitToCelsius()
    {
        return ((sourceTemp-32)*5/9);
    }


}
class Q21
{
    public static void main(String[] args) {
        System.out.println("1. Kelvin To Celsius");
        System.out.println("2. Kelvin To Fahrenheit");
        System.out.println("3. Celsius To Kelvin");
        System.out.println("4. Fahrenheit To Kelvin");
        System.out.println("5. Celsius To Fahrenheit");
        System.out.println("6. Fahrenheit To Celsius");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Choice: ");
        int choice = scan.nextInt();

        Temperature temp = new Temperature();
        
        switch(choice)
        {
            case 1:
            {
                System.out.print("Enter Temperature in Kelvin: ");
                float Kelvin = scan.nextFloat();
                temp.sourceTemp=Kelvin;
                System.out.println("Kelvin("+ Kelvin +") = Celsius(" + temp.KelvinToCelsius() + ")");
                break;
            }
            case 2:
            {
                System.out.print("Enter Temperature in Kelvin: ");
                float Kelvin = scan.nextFloat();
                temp.sourceTemp=Kelvin;
                System.out.println("Kelvin("+ Kelvin +") = Fahrenheit(" + temp.KelvinToFahrenheit() + ")");
                break;
            }
            case 3:
            {
                System.out.print("Enter Temperature in Celsius: ");
                float Celsius = scan.nextFloat();
                temp=new Temperature(Celsius);
                System.out.println("Celsius("+ Celsius +") = Kelvin(" + temp.CelsiusToKelvin() + ")");
                break;
            }
            case 4:
            {
                System.out.print("Enter Temperature in Fahrenheit: ");
                float Fahrenheit = scan.nextFloat();
                temp=new Temperature(Fahrenheit);
                System.out.println("Fahrenheit("+ Fahrenheit +") = Kelvin(" + temp.FahrenheitToKelvin() + ")");
                break;
            }
            case 5:
            {
                System.out.print("Enter Temperature in Celsius: ");
                float Celsius = scan.nextFloat();
                temp=new Temperature(Celsius);
                System.out.println("Celsius("+ Celsius +") = Fahrenheit(" + temp.CelsiusToFahrenheit() + ")");
                break;
            }
            case 6:
            {
                System.out.print("Enter Temperature in Fahrenheit: ");
                float Fahrenheit = scan.nextFloat();
                temp=new Temperature(Fahrenheit);
                System.out.println("Fahrenheit("+ Fahrenheit +") = Celsius(" + temp.FahrenheitToCelsius() + ")");
                break;
            }
            default:
            {
                System.out.println("Select proper Choice.");
                break;
            }
        }
    }
}