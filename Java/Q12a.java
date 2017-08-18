//Write a Java program to accept a number from the user and display the same in words. 
//For example if the number accepted is 4321 then answer should be: “Four Thousand Three Hundred Twenty One”.

/*
Author: Kushal Katta
Date Created: 2 Aug 2017
Date Last Modified: 4 Aug 2017
*/

import java.util.Scanner;


class NumberToWord {
  void returnNumber(int n, String ch) {
    String one[]={ " ", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten",
        " eleven", " twelve", " thirteen", " fourteen", "fifteen", " sixteen", " seventeen", " eighteen",
        " nineteen" };

    String ten[]={ " ", " ", " twenty", " thirty", " forty", " fifty", " sixty", "seventy", " eighty",
        " ninety" };

    if (n>19) {
      System.out.print(ten[n/10] + one[n%10]);
    }
    else {
      System.out.print(one[n]);
    }
    if(n>0)
      System.out.print(ch);
  }

  public static void main(String[] args) {
    int n=0;
    Scanner scanf=new Scanner(System.in);
    System.out.print("Enter an integer number: ");
    n=scanf.nextInt();

    if(n<=0)
      System.out.println("Enter a number greater than 0.");
    else{
      NumberToWord a=new NumberToWord();
      a.returnNumber((n/1000000000), " hundred");
      a.returnNumber((n/10000000)%100, " crore");
      a.returnNumber(((n/100000)%100), " lakh");
      a.returnNumber(((n/1000)%100), " thousand");
      a.returnNumber(((n/100)%10), " hundred");
      a.returnNumber((n%100), " ");
    }
    System.out.println();
  }//end main
}//end class


//begin class
class WordToNumber {
  //method to return the word for the number
  void returnNumber(int n, String ch) {
    String one[]={ " ", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten",
        " eleven", " twelve", " thirteen", " fourteen", "fifteen", " sixteen", " seventeen", " eighteen",
        " nineteen" };

    String ten[]={ " ", " ", " twenty", " thirty", " forty", " fifty", " sixty", "seventy", " eighty",
        " ninety" };

    if (n>19) {
      System.out.print(ten[n/10] + one[n%10]);
    }
    else {
      System.out.print(one[n]);
    }
    if(n>0)
      System.out.print(ch);
  }

  //main met
  public static void main(String[] args) {
    int n=0;
    Scanner scanf=new Scanner(System.in);
    System.out.print("Enter an integer number: ");
    n=scanf.nextInt();

    if(n<=0)
      System.out.println("Enter a number greater than 0.");
    else{
      NumberToWord a=new NumberToWord();
      a.returnNumber((n/1000000000), " hundred");
      a.returnNumber((n/10000000)%100, " crore");
      a.returnNumber(((n/100000)%100), " lakh");
      a.returnNumber(((n/1000)%100), " thousand");
      a.returnNumber(((n/100)%10), " hundred");
      a.returnNumber((n%100), " ");
    }
    System.out.println();
  }//end main
}//end class