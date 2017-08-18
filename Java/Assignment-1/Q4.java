//Accepting a Number from the user and finding its primorial

/*
Author: Kushal Katta
Date Created: 28 Jul 2017
Date Last Modified: 28 Jul 2017
*/

import java.util.Scanner;
class Q4
{
    public static void main(String []a)
    {
        //Getting Input from User
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number to Calculate Primorial : ");
        int number = scan.nextInt();
        scan.close();


        int primorial=1;
        for(int i=2;i<=number;++i)
        {
            //Checking Prime Numbers
            boolean primeNo=true;
            for (int j=2;j<i;j++)
            {
                if (i%j==0)
                {
                    primeNo=false;
                    break;
                }
            }
            //Multiplying Prime Numbers
            if (primeNo)
            {
                primorial*=i;
            }
        }
        System.out.println("Primorial of "+number+" is "+primorial);
    }
}