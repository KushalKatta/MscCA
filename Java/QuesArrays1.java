/*
Create a boolean array and assign values to its elements and print the entire array using for loop.
*/

import java.util.Scanner;

class BoolArray
{
    
    boolean array1[];
    BoolArray()
    {
        array1=new boolean[5];
    }
    BoolArray(int size)
    {
        array1=new boolean[size];
    }
    
    boolean intToBool(String input1) throws Exception
    {
        int input = Integer.parseInt(input1);
        if (input < 0 || input > 1)
        {
            throw new Exception("input must be 0 or 1");
        }

        return input == 1;
    }
    boolean strToBool(String input) throws Exception
    {
        if(input.toUpperCase().equals("true".toUpperCase()) || input.toUpperCase().equals("t".toUpperCase()))
        {
            return true;
        }
        else if(input.toUpperCase().equals("false".toUpperCase()) || input.toUpperCase().equals("f".toUpperCase()))
            return false;
        else
            throw new Exception("Wrong Input");
    }

    boolean getBoolValue(int index)
    {
        System.out.print("Enter "+ (index+1) +" Boolean Value: ");
        String str = "";
        str = Main.scan.next();
        boolean value1=false;
        try
        {
            value1 = strToBool(str);
        }
        catch(Exception ex)
        {
            // System.out.println(ex.getMessage());
            try
            {
                value1 = intToBool(str);
            }
            catch(Exception e)
            {
                // System.out.println(e.getMessage());
                return getBoolValue(index);
            }
        }
        return value1;
    }
    void assignArray(int index)
    {
        array1[index]=getBoolValue(index);
    }
    
    void printArray()
    {
        if(array1.length>0)
        {
            System.out.println("Printing Array: ");
            for (int i=0; i<array1.length; i++)
            {
                System.out.print(array1[i]+"\t");
            }
            System.out.println();
        }
    }
}

class Main
{
    public static final Scanner scan = new Scanner(System.in);
    static int strToInt(String str)
    {
        int input=0;
        try
        {
            input=Integer.parseInt(str);
        }
        catch(Exception ex)
        {
            
            try
            {
                input=Math.round(Float.parseFloat(str));
            }
            catch(Exception e)
            {
                return getSize();
            }
        }
        return input;
    }

    static int getSize()
    {
        int size=0;
        System.out.print("Enter the Size of Boolean Array: ");
        try
        {
            size=scan.nextInt();
        }
        catch (Exception ex)
        {
            size=strToInt(scan.next());
        }
        return size;
    }
    public static void main(String[] args) {
        
        System.out.println("Implementing Boolean Array");
        System.out.println("");

        int size=0;

        size=getSize();
        
        BoolArray array1 = new BoolArray(size);
        
        for(int i=0; i<size; i++)
        {
            array1.assignArray(i);
        }
        array1.printArray();
    }
}