/*
Author : Kushal Katta
Date Created : 12 July 2017
*/

import java.util.Scanner;

//Calender Class
class Calender
{
    public static void main(String []a)
    {
        Calender calender1 = new Calender();
        calender1.showDays();
    }
    void showDays()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Month Number: ");
        int monthNo = scan.nextInt();

        String monthName = new String();
        int NoOfDays = 0;
        switch (monthNo)
        {
            case 2:
            monthName = "February";
            NoOfDays = 28;
            break;

            case 1:
            monthName="January";
            NoOfDays = 31;
            break;
            case 3:
            monthName="March";
            NoOfDays = 31;
            break;
            case 5:
            monthName="May";
            NoOfDays = 31;
            break;
            case 7:
            monthName="July";
            NoOfDays = 31;
            break;
            case 8:
            monthName="August";
            NoOfDays = 31;
            break;
            case 10:
            monthName="October";
            NoOfDays = 31;
            break;
            case 12:
            monthName="December";
            NoOfDays = 31;
            break;

            case 4:
            monthName = "April";
            NoOfDays = 30;
            break;
            case 6:
            monthName = "June";
            NoOfDays = 30;
            break;
            case 9:
            monthName = "September";
            NoOfDays = 30;
            break;
            case 11:
            monthName = "November";
            NoOfDays = 30;
            break;

            default:
            monthName = "Invalid";
            NoOfDays=' ';
            System.out.println("Month No Invalid");
            System.exit(0);
        }
        System.out.println(NoOfDays + " Days in " + monthName + " month");
    }
}