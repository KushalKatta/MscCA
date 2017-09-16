import  java.io.*;
import java.util.*;


class Revfile
{
	
	void readReverse()
	{
		
		Scanner scanme=new Scanner(System.in);
		
		String stringtoshow="";
		
		int charet=0;
		try{
		
		FileInputStream in=new FileInputStream(scanme.nextLine()); //enter file name
		
		while((charet=in.read())!=-1)
		{
			stringtoshow=(char)charet+stringtoshow;
			
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(stringtoshow);
		
		
		
	}
	
	public static void main(String args[])
	{
		Revfile obj=new Revfile();
		obj.readReverse();
		
		
	}
	
	
}