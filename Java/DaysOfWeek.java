/*
Author : Kushal Katta
Date Created : 12 July 2017
*/

import java.util.Scanner;

//Week Class
class Week
{
    public static void main(String []a)
    {
        Week week1 = new Week();
        week1.showDays();
    }
    void showDays()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Day Number of a week: ");
        int dayNo = scan.nextInt();

        String dayName = new String();

        switch (dayNo)
        {
            case 0:
            dayName = "Sunday";
            break;
            case 1:
            dayName = "Monday";
            break;
            case 2:
            dayName = "Tuesday";
            break;
            case 3:
            dayName = "Wednesday";
            break;
            case 4:
            dayName = "Thrusday";
            break;
            case 5:
            dayName = "Friday";
            break;
            case 6:
            dayName = "Saturday";
            break;
            

            default:
            dayName = "Invalid";
        }
        System.out.println(dayNo + " represents " + dayName);
    }
}