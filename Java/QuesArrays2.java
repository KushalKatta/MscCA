import java.util.Scanner;

/*
Write a Java Program to read an array of size 5 from user.
Write a method void deleteElement(int element) , which deletes an element from an array.
Also write a method to print this array
*/

class userArray
{
    Scanner scan = new Scanner(System.in);
    int[] array1=new int[10];

    userArray(){}
    userArray(int[] array1)
    {
        this.array1=new int[array1.length];
        this.array1=array1;
    }
    void readArray()
    {
        for(int i=0; i<array1.length; i++)
        {
            System.out.print("Enter a Number to Insert to array: ");
            array1[i]=scan.nextInt();
        }
    }
    void deleteElement(int element)
    {
        int[] array2;

        int i;
        for(i=0; i<array1.length; i++)
        {
            if(array1[i]==element)
            {
                // array1[i]=0;
                while(i<array1.length-1)
                {
                    array1[i]=array1[i+1];
                    i+=1;
                }
                // array1[i]=0;
                break;
            }
        }
        array2=new int[i];
        for(i=0; i<array2.length;i++)
        {
            array2[i]=array1[i];
        }
        array1=new int[array2.length];
        array1=array2;
    }

    //QuesArrays3
    userArray splitArray(int position)
    {
        int i;
        
        int[] array2=new int[position];
        for(i=0; i<array2.length;i++)
        {
            array2[i]=array1[i];
        }

        int[] array3=new int[array1.length-array2.length];
        int j;
        for(i=array2.length, j=0; i<array1.length;i++,j++)
        {
            array3[j]=array1[i];
        }

        array1 = new int[array2.length];
        array1=array2;

        return new userArray(array3);
    }//QuesArrays3 Ends

    //QuesArrays4
    void addElement(int element)
    {
        int[] array2;

        int i;

        array2=new int[array1.length+1];
        for(i=0; i<array1.length;i++)
        {
            array2[i]=array1[i];
        }
        array1=new int[array2.length];
        array1=array2;

        i=array1.length-1;
        while(i>0)
        {
            array1[i]=array1[i-1];
            i-=1;
        }
        array1[0]=element;
    }//QuesArrays4 Ends
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
        else
        {
            System.out.println("Empty Array!");
        }
    }

    //QuesArrays5
    void removeRepititions()
    {
        for(int i=0; i<array1.length; i++)
        {
            for(int j=i+1; j<array1.length; j++)
            {
                if(array1[i]==array1[j])
                {
                    deleteElement(array1[j]);
                }
            }
        }
    }//QuesArrays5 Ends
}

class Main
{
    public static void main(String[] args) {
        userArray array1=new userArray();
        array1.readArray();
        array1.printArray();

        //QuesArrays2   //Deleting Element
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter a Number to Delete: ");
            int element = scan.nextInt();
            if(element<0)
            {
                // scan.close();
                break;
            }
            array1.deleteElement(element);
            array1.printArray();
        }//     QuesArrays2 Ends

        //QuesArrays3   //Split Array
        userArray array2 = new userArray();
        array2=array1.splitArray(3);
        array1.printArray();
        array2.printArray();
        //      QuesArrays3 Ends


        //QuesArrays4   //Add Element
        while(true)
        {
            System.out.print("Enter a Number to Add: ");
            int element = scan.nextInt();
            if(element<0)
            {
                break;
            }
            array1.addElement(element);
            array1.printArray();
        }//     QuesArrays4 Ends

        scan.close();

        //QuesArrays5   //Remove Repeated Elements (Remove Duplicates)
        array1.removeRepititions();
        array1.printArray();
        //      QuesArrays5 Ends
    }
}