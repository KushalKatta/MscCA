/* To write data to file until the user types 'stop'
Name : Ankit Patel
Date :17-9-17 */

import java.io.*;
import java.util.*;


class WriteStop
{
    String s="stop";
    
    void write(String filename)
    {
    Scanner input=new Scanner(System.in);
    FileOutputStream fos=null;
    byte[] arr;
        try
        {
        fos=new FileOutputStream(filename,true);
        String data="";
        boolean write=false;
        while(write!=true)
        {
        System.out.println("\n Enter data to write");
        data=input.next();
        String[] dup=data.split("\\s");
        for(int i=0;i<dup.length;i++)
        {
        if(dup[i].equals(s)==false)
        {
        arr=dup[i].getBytes();
        fos.write(arr);
        }
        else
        {
        System.out.println("\n Stop encountered");
        write=true;
        }
        }
        }
        }catch(IOException ie)
        {
            System.out.println(ie);
        }
        finally
        {
            try
            {
            fos.close();
            }catch(IOException ie)
            {
                System.out.println(ie);
            }
        }
        

    }
    
    void read(String filename)
    {
        FileInputStream fis=null;
        try
        {
            fis=new FileInputStream(filename);
            int n;
            while((n=fis.read())!=-1)
                System.out.print(""+(char)n);
        }
        catch(IOException ie)
        {
            System.out.println(ie);
        }
        finally
        {
            try
            {
                fis.close();
            }
            catch(IOException ie)
            {
                System.out.println(ie);
            }
        }
    }
    
    
public static void main(String args[])
{
    WriteStop ws=new WriteStop();
    Scanner input=new Scanner(System.in);
    String filename="";
    System.out.println("\n Enter file name");
    filename=input.next();
    ws.write(filename);
    ws.read(filename);
}
}
