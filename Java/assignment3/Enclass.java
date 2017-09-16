
import java.util.*;




class Enclass
{
	
	void fun()
	{
		Scanner scanme=new Scanner(System.in);
		
		System.out.println("Input");
		
		String a=scanme.nextLine();
		
		
		String en="";
		
		
		for(int i=0;i<a.length();i++)
		{
			
			char st=a.charAt(i);
	
			if((st<123 &&st>96)||(st>64&&st<91))
			{
				
				st=(char)((int)st+1);
				
				if(st==123)
				{
					st='a';
				}
				if(st==91)
				{
					st='A';
				}
				
				
			}
			
			en=en+st;
		}
		
		
		System.out.println(en);
		
		
		
		
		
		
	}
	
	public static void main(String args[])
	{
		Enclass enc=new Enclass();
		enc.fun();
		
	}
}
