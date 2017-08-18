//Accepting a number in Hexadecimal format and converting the same in decimal format.

/*
Author: Kushal Katta
Date Created: 30 Jul 2017
Date Last Modified: 30 Jul 2017
*/

import java.util.Scanner;

class Q11A
{

    //HexaDecimal to Decimal
    static int ConvertNumber(String number, int noBase, int toBase)
    {
        String no1= number;
        int strBase=0;
        int expo=0;

        for (int k=no1.length()-1; k>=0; k--)
        {
            int tempNo=0;
            tempNo = Character.getNumericValue(no1.charAt(k));
            //System.out.println("no1="+no1+",char="+Character.getNumericValue(no1.charAt(k))+", tempNo="+tempNo+", noBase="+noBase+", k="+k);
            strBase+=(tempNo)*Math.pow(noBase,expo);
            //no1=no1.substring(0,no1.length()-2); //Remove Last Character
            expo++;
        }
        return strBase;
    }
    public static void main(String []a)
    {
        //Accept HexaDecimal Number from User
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Hexadecimal Number : ");
        String hexNumber = scan.nextLine();
        scan.close();
        
        //HexaDecimal To Decimal
        int number=ConvertNumber(hexNumber,16,10);
        
        System.out.println("Decimal of Entered HexaDecimal("+hexNumber+") is " + number);
    }
}