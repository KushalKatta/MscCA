/*
Author: Kushal Katta
Date Created: 08 Aug 2017
*/

import java.util.Scanner;

class Account
{
    String customer_name;
    long account_no;
    String type_of_account;

    float balance;
    Account(String customer_name, long account_no, String type_of_account, float balance)
    {
        this.customer_name=customer_name;
        this.account_no=account_no;
        this.type_of_account=type_of_account;
        this.balance=balance;
    }
    void Deposit(float amount)
    {
        balance=balance+amount;
        System.out.println("Amount Deposited Successfully : " + amount);
        display();
    }
    void Withdrawl(float amount)
    {
        balance=balance-amount;
        System.out.println("Amount Withdrawn Successfully : " + amount);
        display();
    }
    void display()
    {
        System.out.println("Total Available Balance = " + balance);
    }
}
class CurrentAccount extends Account
{
    float minBalance=10000;
    CurrentAccount(String customer_name, long account_no, float balance)
    {
        super(customer_name, account_no, "Current A/c", balance);
    }
    void CheckMinBalance()
    {
        if (balance<minBalance)
        {
            System.out.print("Balance("+balance+") Below Minimum Balance("+minBalance+") ");
            float amount=(minBalance-balance)*0.1f;
            System.out.print("So Penalty of "+amount+"(10% of Shortfall) Charged To Your Account.\n");
            super.Withdrawl(amount);
        }
        else{
            System.out.println("Balance Maintained Properly.");
        }
    }
}
class SavingsAccount extends Account
{
    SavingsAccount(String customer_name, long account_no, float balance)
    {
        super(customer_name, account_no, "Savings A/c", balance);
    }
    void DepositInterest()
    {
        float amount=balance*0.06f;
        System.out.print("Balance("+balance+"), So Interest @ 6% p.a. on balance = "+amount+" is debited as Interest Amount.");
        super.Deposit(amount);
    }
}

//Main Class
class Main
{
    public static void main(String[] args) {
        CurrentAccount curr1 = new CurrentAccount("Kushal Katta", 123456789, 20000f);
        SavingsAccount sav1 = new SavingsAccount("Shubham Sahu", 465978213, 5000f);

        Scanner scan = new Scanner(System.in);
        
        System.out.println("1.  Current Account");
        System.out.println("2.  Savings Account");

        System.out.print("Select Account Type: ");
        int acc_type = scan.nextInt();


        int choice=0;

        if (acc_type==1)
        {
            //Current Account
            while(choice>=0)
            {
                System.out.println();
                System.out.println("1.  Deposit Amount");
                System.out.println("2.  Display Balance");
                System.out.println("3.  Compute Interest");
                System.out.println("4.  Withdraw Amount");
                System.out.println("5.  Minimum Balance Requirements");

                System.out.println("Any Negative Number To Exit");
                
                System.out.println();
                System.out.print("Select Any Choice: ");

                choice = scan.nextInt();

                switch(choice)
                {
                    case -1:
                    {
                        System.out.println("Thank You For Coming. Do Come Again.");
                        break;
                    }
                    case 1:
                    {
                        System.out.print("Enter Amount To Deposit: ");
                        curr1.Deposit(scan.nextFloat());
                        break;
                    }
                    
                    case 2:
                    {
                        curr1.display();
                        break;
                    }
                    case 3:
                    {
                        break;
                    }
                    case 4:
                    {
                        System.out.print("Enter Amount To Withdraw: ");
                        curr1.Withdrawl(scan.nextFloat());
                        break;
                    }
                    case 5:
                    {
                        curr1.CheckMinBalance();
                        break;
                    }
                    default:
                    {
                        System.out.println("Incorrect Option, Try Again!");
                        break;
                    }
                }
            }
        }
        else if(acc_type==2)
        {
            //Savings Account
            while(choice>=0)
            {
                System.out.println();
                System.out.println("1.  Deposit Amount");
                System.out.println("2.  Display Balance");
                System.out.println("3.  Compute Interest");
                System.out.println("4.  Withdraw Amount");
                System.out.println("5.  Minimum Balance Requirements");

                System.out.println("Any Negative Number To Exit");
                
                System.out.println();
                System.out.print("Select Any Choice: ");

                choice = scan.nextInt();

                switch(choice)
                {
                    case -1:
                    {
                        System.out.println("Thank You For Coming. Do Come Again.");
                        break;
                    }
                    case 1:
                    {
                        System.out.print("Enter Amount To Deposit: ");
                        sav1.Deposit(scan.nextFloat());
                        break;
                    }
                    
                    case 2:
                    {
                        sav1.display();
                        break;
                    }
                    case 3:
                    {
                        sav1.DepositInterest();
                        break;
                    }
                    case 4:
                    {
                        System.out.print("Enter Amount To Withdraw: ");
                        sav1.Withdrawl(scan.nextFloat());
                        break;
                    }
                    case 5:
                    {
                        break;
                    }
                    default:
                    {
                        System.out.println("Incorrect Option, Try Again!");
                        break;
                    }
                }
            }
        }
        else{
            //Wrong Choice
            System.out.println("Try Again!");
        }
    }
}