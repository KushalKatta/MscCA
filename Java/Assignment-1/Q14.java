//Accepting the number in decimal format and converting the same in Hexadecimal format.

/*
Author: Kushal Katta
Date Created: 30 Jul 2017
Date Last Modified: 30 Jul 2017
*/

import java.util.Scanner;

class Q14
{
    //Decimal to HexaDecimal
    static String ConvertNumber(int number, int toBase)
    {
        int no1= number;
        String strBase="";
        while (no1 !=0)
        {
            int remainder = no1%toBase;
            switch (remainder)
            {
                case 10:
                {
                    strBase = "A" + strBase;
                    break;
                }
                case 11:
                {
                    strBase = "B" + strBase;
                    break;
                }
                case 12:
                {
                    strBase = "C" + strBase;
                    break;
                }
                case 13:
                {
                    strBase = "D" + strBase;
                    break;
                }
                case 14:
                {
                    strBase = "E" + strBase;
                    break;
                }
                case 15:
                {
                    strBase = "F" + strBase;
                    break;
                }
                default:
                {
                    strBase = remainder + strBase;
                    break;
                }
            }
            no1=no1/toBase;
        }
        return strBase;
    }

    public static void main(String []a)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Decimal Number : ");
        int decNumber = scan.nextInt();
        
        scan.close();

        String hexNumber = ConvertNumber(decNumber, 16);
        System.out.println("HexaDecimal of " + decNumber + "(Decimal Number) is " + hexNumber);
    }
}