/*
Assume that a bank maintains two kinds of accounts for customers, one called as savings account and the other as
current account. The savings account provides compound interest and withdrawal facilities but no cheque book facility. 
The current account provides cheque book facility but no interest. 
Current account holders should also maintain a minimum balance and if the balance falls below this level,
a service charge is imposed. Create a class account that stores customer name, account no., type of account.
From this derive the classes cur-acct and sav-acct to make them more specific. Include the following tasks:
a.	Accept deposit from a customer and update the balance.
b.	Display the balance.
c.	Compute and Deposit interest.
d.	Permit withdrawal and update the balance.
e.	Check for the minimum balance, impose penalty if necessary and update balance.
*/

/*
Author: Kushal Katta
Date Created: 4 Aug 2017
Date Last Modified: 4 Aug 2017
*/

import java.util.Scanner;
//begin class
class Account{
	//data members of the class
	protected String customer_name;
	protected String account_no;
	protected String type_of_account;
	protected double balance;

	//constructor of the class
	public Account(String customer_name, String account_no, String type_of_account, double balance){
		this.customer_name=customer_name;
		this.account_no=account_no;
		this.type_of_account=type_of_account;
		this.balance=balance;
	}

	//method to display the balance
	public void displayBalance(){
		System.out.println("Balance is :  " + this.balance);
	}
}

//begin class
class CustomerAccount{
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);

		int choice=0;
		double amount=0.0;

		//objects of 2 classes
		CurrentAccount customer1=new CurrentAccount("ABC", "1001", 32584.324);
		SavingsAccount customer2=new SavingsAccount("XYZ", "1002", 382684.324);

		//displaying the menu
		System.out.println("\n\n1.Accept deposit from a customer and update the balance\n2.Display the balance\n3.Compute and Deposit interest\n4.Permit withdrawal and update the balance\n5.Check for the minimum balance, impose penalty if necessary and update balance\n6.Exit");
		System.out.print("Enter your choice : ");

		choice=sc.nextInt();

		while(choice!=6){
			switch(choice){
				case 1:
					System.out.print("Enter the amount to deposit : ");
					amount=sc.nextDouble();
					customer1.deposit(amount);
					break;
				case 2:
					customer1.displayBalance();
					customer2.displayBalance();
					break;
				case 3:
					customer2.interest();
					break;
				case 4:
					System.out.print("Enter the amount to withdraw : ");
					amount=sc.nextDouble();
					customer2.withdrawal(amount);
					break;
				case 5:
					customer1.checkMinimumBalance();
					break;
				default :
					System.out.println("Wrong choice.");
					break;
			}
			//displaying the menu
			System.out.println("1.Accept deposit from a customer and update the balance\n2.Display the balance\n3.Compute and Deposit interest\n4.Permit withdrawal and update the balance\n5.Check for the minimum balance, impose penalty if necessary and update balance\n6.Exit");
			System.out.print("Enter your choice : ");

			choice=sc.nextInt();
		}
	}
}



//begin class
class CurrentAccount extends Account{
	//data members of the class
	static double minimum_balance=8625.21;

	//constructor
	public CurrentAccount(String customer_name, String account_no, double balance){
		super(customer_name, account_no, "Current Account", balance);
	}

	//method to check for minimum balance
	void checkMinimumBalance(){
		if (balance<minimum_balance){
			//balance is below minimum balance
			System.out.println("Your current balance is below the minimum balance.");
			System.out.println("You have been imposed a penalty of " + (minimum_balance*0.05));
			this.displayBalance();
		}
		else
			System.out.println("You have more than the minimum balance in the Account.");
	}

	//method to accept a deposit and display the balance
	void deposit(double amount){
		balance=balance+amount;
		System.out.println("Sucessfully deposited " + amount + " amount.");
		this.displayBalance();
	}
}


//begin class
class SavingsAccount extends Account{
	//constructor
	public SavingsAccount(String customer_name, String account_no, double balance){
		super(customer_name, account_no, "Savings Account", balance);
	}

	//method to allow withdrawal from the account
	void withdrawal(double amount){
		if(amount>balance){
			System.out.println("Withdrawal amount is greater than balance. Please check.");
			this.displayBalance();
		}
		else{
			System.out.println("Successfully withdrawn " + amount + " amount.");
			balance=balance-amount;
		}
		this.displayBalance();
	}

	//method to compute interest
	void interest(){
		//assuming interest is 5% pa
		balance=balance+(balance*0.5);
		this.displayBalance();
	}
}