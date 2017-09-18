import java.io.*;
import  java.util.*;

class Exchange
{
	
	void swappy()
	{
		
		Scanner scanme=new Scanner(System.in);
		
		String name1=scanme.nextLine();
		
		String name2=scanme.nextLine();
		
		
		String buf1="";
		
		String buf2="";
		
		try{
		
		FileInputStream firstfile=new FileInputStream(name1);
		
		
		FileInputStream secondfile=new FileInputStream(name2);
		
		
		int bufchar;
		
		while((bufchar=secondfile.read())!=-1)
		{
			
			buf1=buf1+((char)bufchar);
			
		}
		while((bufchar=firstfile.read())!=-1)
		{
			
			buf2=buf2+((char)bufchar);
			
		}
		
		firstfile.close();
		
		secondfile.close();
		
		
		
		FileOutputStream firstoutput=new FileOutputStream(name2);
		
		FileOutputStream secondoutput=new FileOutputStream(name1);
		
		
		byte firstreader[]=buf1.getBytes();
		
		byte secondreader[]=buf2.getBytes();
		firstoutput.write(secondreader);
		
		secondoutput.write(firstreader);
		
		firstoutput.close();
		
		secondoutput.close();
		
		
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(buf1);
		
		System.out.println(buf2);
	}
		
		public static void main(String args[])
		{
			
			Exchange obj=new Exchange();
			
			obj.swappy();
			
			
		}
		
		
		
		
	}
	
	
