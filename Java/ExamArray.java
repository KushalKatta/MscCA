/*

Author Nathan Zion Dpenha

A java Program to concatenate two arrays 
and insert elements at valid index positions

*/
import java.util.*;

class ParentArray
{
	
	int size;
	int  pararray[];
	ParentArray(int n)
	{
		pararray=new int[n];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Hello, Enter the first array");
		for(int i=0;i<n;i++)
		{
			
			pararray[i]=sc.nextInt();
			
			
		}
	}
	
	
	
}

class ChildArray extends ParentArray
{
	
	int  childarray[];
	ChildArray(int y,int n)
	{
		super(y);
		childarray=new int[n];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Hello, Enter the second array array");
		for(int i=0;i<n;i++)
		{
			
			childarray[i]=sc.nextInt();
			
			
		}
	}
	
	
	void concat()
	{
		int concated[]=new int[pararray.length+childarray.length];
		System.out.println("The concated Array is!");
		
		for(int i=0;i<pararray.length;i++)
		{
			concated[i]=pararray[i];
		}
		int index=0;
		for(int i=pararray.length;i<concated.length;i++)
		{
			concated[i]=childarray[index];
			index=index+1;
		}
		
		for(int i=0;i<concated.length;i++)
		{
			System.out.print(concated[i]+" ");
		}
		
	}
	
	void insert()
	{
		
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Hello, Which position to insert (count from 0)?");
					

        int pos=sc.nextInt();
		
		if(pos>=childarray.length || pos<0)
		{
			System.out.println("Sorry buddy not possible");
		
			
		}
		else
		{childarray[pos]=sc.nextInt();
			System.out.print("  insert at child array at position "+pos+" value "+childarray[pos]);

		}
		
		show(childarray);
	}
	
	
	void show(int arr[])
	{System.out.println("The Array is!");
		
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]+" ");
		
		}
	}
	
}

class ExamArray
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first array size");
		
		int array1_size=sc.nextInt();
		
		
		System.out.println("Enter second array size");
		int array2_size=sc.nextInt();
		
		
		ChildArray obj=new ChildArray(array1_size,array2_size);
		obj.concat();
		obj.insert();
	}
	
	
}