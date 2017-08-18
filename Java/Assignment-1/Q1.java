//Finding 1001st Prime number and the sum of even numbers of this number

/*
Author: Kushal Katta
Date Created: 1 Aug 2017
Date Last Modified: 3 Aug 2017
*/
class Q1
{
    public static void main(String []a)
    {
        //Calculating 1001st Prime Number
        int count=1;
        int no=1;
        while(count<=1001)
        {
            no++;
            boolean primeNo=true;
            for (int i=2;i<no;i++)
            {
                if (no%i==0)
                {
                    primeNo=false;
                    break;
                }
            }
            if (primeNo)
            {
                //System.out.println(no + " is a Prime Number.");
                count++;
            }
        }
        //Sum of Digits(Even Number only) of 1001st Prime Number
        int sum=0;
        int tempNo=no;
        while(tempNo!=0)
        {
            if (tempNo%2==0)
            {
                //Even Number so add to sum
                sum+=(tempNo%10);

            }
            tempNo=tempNo/10;
        }
        System.out.println(no + " is 1001st Prime Number and Its Sum of Even Number is " + sum);
    }
}