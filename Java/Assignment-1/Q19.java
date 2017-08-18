//Guess a Number

//Reading a Four digit number from user and user get 8 chances to guess it correctly.
//The four digit number which is guessed at each time the system responds in the following manner:
//1.If all digits are present the display message “Congratulations”.
//2.In all other cases system should tell how many digits are correct or present in the original number.

/*
Author: Kushal Katta
Date Created: 28 Jul 2017
Date Last Modified: 28 Jul 2017
*/

import java.util.Scanner;

class Q19
{
    public static void main(String []a)
    {
        //Created an object of Scanner Class and taking input from user.
        Scanner scan = new Scanner(System.in);
        
        int guessNumber = 0;
        //int arrGuessNumber[] = new int[4];
        int inputGuessNumber = 0;
        //int arrInputGuessNumber[] = new int[4];

        int count = 0;

        int i=0;
        while(i<8)
        {
            System.out.print("Guess a 4 Digit Number : ");
            
            guessNumber = 1579;
            inputGuessNumber = scan.nextInt();
            
            count=0;
 
            if(inputGuessNumber>=1000 && inputGuessNumber<=9999)
            {
                for(int j=3; j>=0; j--)
                {
                    if(inputGuessNumber%10==guessNumber%10)
                    {
                        count++;    //Count of No of Digits Matched
                    }
                    inputGuessNumber/=10;
                    guessNumber/=10;

                    // System.out.println(arrInput[j]);
                    // System.out.println(arrGuessNumber[j]);
                }
                if (count==4)   //All Digits Matched
                {
                    System.out.println("Congratulations! You Guessed it Right.");
                    break;
                }
                else if(count>0)    //Some Digits But Not All Digits Matched
                {
                    System.out.println("You Guessed "+count+" Digits Right!");
                }
                else    //None of the Digits Matched
                {
                    System.out.println("No Digits Matched!");
                }
                i++;
            }
            else    //Number Entered in Wrong Format By User
            {
                System.out.println("Wrong Format Try Again!");
                continue;
            }
        }
        if(count!=4)
        {
            System.out.println("You Took " + i + " Attempt But Could Not Guess Number! Better Luck Next Time!!");
        }
        scan.close();

    }
}