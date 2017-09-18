/* To count the number of occurences of word 'is' that has occured
Name : Ankit Patel
Date :17-9-17           */

import java.util.*;
import java.io.*;

class CountFile
{
    int count=0;
    
    String occurence="is";
    
    void accept(String filename)throws FileNotFoundException
    {
        File f1=new File(filename);
        Scanner file=new Scanner(f1);
        while(file.hasNext())
        {
            String match=file.next();
            if(match.equals(occurence))
                count++;
        }
        System.out.println("\n The number of occurences"+count);
        
    }

public static void main(String args[])throws IOException
{
    Scanner input=new Scanner(System.in);
    CountFile file1=new CountFile();
    System.out.println("\n Enter file name");
    String filename;
    filename=input.next();
    file1.accept(filename);
}
}
