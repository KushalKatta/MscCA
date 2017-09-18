import  java.io.*;
import java.util.*;


class Revfile
{
	
	void revfile()
	{
		
		Scanner scanme=new Scanner(System.in);
		
		String stringtoshow="";
		
		int charet;
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
		Revfile j=new Revfile();
		j.revfile();
		
		
	}
	
	
}
