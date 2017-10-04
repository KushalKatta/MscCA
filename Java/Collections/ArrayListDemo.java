/* Array List */

import java.util.*;

class ArrayListDemo
{
    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList <String> ();
        myArray.add("Kushal");
        myArray.add("Katta");
        myArray.add("is");
        myArray.add("a");
        myArray.add("MSc CA");
        myArray.add("Student");
        
        // System.out.println("ArrayList is : " + myArray);
        System.out.print("ArrayList is : ");

        for(String item : myArray)   //Like For Each in Python
        {
            System.out.print(item + " ");
        }

        System.out.println();

        System.out.println("1st Item in List is " + myArray.get(0));
        System.out.println("Size of ArrayList is " + myArray.size());
    }
}