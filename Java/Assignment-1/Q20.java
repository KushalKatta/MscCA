//Accept a String and Print Encryption String (Fibonacci Series)
/*
Generated 26 Fibonacci Numbers. Assigned to each number in the series A-Z alphabets.
Accept any string from the user and display the encrypted code for that name.

Eg:- If I accept a String as “ABC” then its encrypted code is “123”.

*/

/*
Author: Kushal Katta
Date Created: 27 Jul 2017
Date Last Modified: 27 Jul 2017
*/

import java.util.Scanner;

class Q20
{
    public static void main(String []a)
    {
        //Created an object of Scanner Class and taking input from user.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String to Get Encrypted Code : ");
        String StrName = scan.nextLine();
        scan.close();

        int i=0;
        int j=1;

        //Two Arrays, One for Fibonacci Series and Another for Respective Alphabets
        char ch = 'A';
        char aArray[] = new char[26];
        long fArray[] = new long [26];

        //Filling Both Arrays with Values
        for(int k=0;k<26;k++)
        {
            i=i+j;
            j=i-j;
            fArray[k]=i;    //Fibonacci Series upto 26 Elements
            //System.out.println(k+1 + " - " + i);

            aArray[k]=ch;   //A-Z
            ch++;
        }
    
        //Printing Encryted Code
        for (int k=0; k<StrName.length(); k++)
        {
            for (int l=0; l<26; l++)
            {
                if (aArray[l] == StrName.charAt(k))
                {
                    System.out.print(fArray[l]+".");
                    break;
                }
            }
        }
        System.out.println();

        //for(int k=0;k<26;k++)
        //{
            //System.out.println(aArray[k]);
            //System.out.println(fArray[k]);
        //}
    }
}