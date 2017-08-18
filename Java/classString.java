import java.util.Scanner;

class StringExample
{
    public static void main(String[] args) {
        String str1 = new String("SICSR");
        String str2;

        str2=str1;
        str2=str1.concat(" Pune");

        // //We can't change original String because strings are Immutable. So, it returns another object of String class.

        // System.out.println("String 1 : " + str1);
        // System.out.println("String 2 : " + str2);
        
        // //System.out.println(str1.chatAt(0));    //char at first index
        // //System.out.println(str1.codePointAt(0));    //ASCII of char at first index
        // //Gets Chars

        // System.out.println(str2.endsWith("Pune"));
        // System.out.println(str2.startsWith("SI"));

        System.out.println("P is at " + str2.indexOf("P")); //Index of
        //Trim removes spaces from left and right

        //Write a Java Code To Read A Student PRN from User and Check whether he is MBA IT Student or MSc Student
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a PRN of MSc or MBA Student: ");
        String str = scan.nextLine();
        scan.close();

        if (str.length()==11)
        {
            String strResult = str.substring(5,8);
            if (strResult.equals("141"))
            {
                System.out.print("MBA IT Student");
            }
            else if(strResult.equals("142"))
            {
                System.out.print("MSc Student");
            }
            
            System.out.print(" from 20"+str.substring(0,2)+"th Batch");
            
            String Inst = str.substring(2,4);
            if (Inst.equals("030"))
            {
                System.out.print(" from SICSR");
            }
            System.out.println();
        }
        else
        {
            System.out.println("Invalid PRN");
        }
    }
}