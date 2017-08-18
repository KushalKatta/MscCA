/*
A book shop maintains the inventory of books that are being sold at the shop.
The list includes details such as author, title, price, publisher and stock position.
a.	A customer can search for a book using its title and author.
b.	If the book exists display details and asks for number of copies.
c.	If available the total cost is displayed.
d.	The program should also have features like:
		i.	The price of the books should be automatically updated.
		ii.	No. of successful and unsuccessful transaction should be recorded for the purpose of statistical analysis.
*/

/*
Author: Kushal Katta
Date Created: 4 Aug 2017
Date Last Modified: 4 Aug 2017
*/

import java.util.Scanner;

//begin class
class Book{
	//data members of the class
	String author, title;
	double price;
	String publisher, stock_position;

	//non-parameterised constructor
	Book(){
		this.author="default_author";
		this.title="default_title";
		this.price=0.0;
		this.publisher="default_publisher";
		this.stock_position="default_stock_position";
	}

	//parameterised constructor
	Book(String author, String title, double price, String publisher, String stock_position){
		this.author=author;
		this.title=title;
		this.price=price;
		this.publisher=publisher;
		this.stock_position=stock_position;
	}

	//display method to display the book
	void display(){
		System.out.println("Book Author : " + this.author);
		System.out.println("Book Title : " + this.title);
		System.out.println("Book Price : " + this.price);
		System.out.println("Book Publisher : " + this.publisher);
		System.out.println("Stock Position : " + this.stock_position);
	}
}//end class



//begin class
class Q25{
	//arrays to store 10 book details
	final String authors[]={"Author01","Author02","Author03","Author04","Author05","Author06","Author07","Author08","Author09","Author10"};
	final String titles[]={"Title01","Title02","Title03","Title04","Title05","Title06","Title07","Title08","Title09","Title10"};
	final double prices[]={243.42,32.63,25.32,235.25,675.34,634.24,654.54,987.24,342.31,746.32};
	final String publishers[]={"Publisher01","Publisher02","Publisher03","Publisher04","Publisher05","Publisher06","Publisher07","Publisher08","Publisher09","Publisher10"};
	final String stock_positions[]={"Stock_Position01","Stock_Position02","Stock_Position03","Stock_Position04","Stock_Position05","Stock_Position06","Stock_Position07","Stock_Position08","Stock_Position09","Stock_Position10"};

	//data members of the class
	Book books[];

	//constructor of the class
	Q25(){
		books=new Book[10];
		//object of the class
		for (int i=0; i<10; i++) {
			books[i]=new Book(authors[i],titles[i],prices[i],publishers[i],stock_positions[i]);
		}
	}

	//method to search book by author name
	void searchByAuthor(String author_search){
		int flag=0;
		for (int i=0; i<books.length; i++) {
			if(books[i].author.toLowerCase().equals(author_search.toLowerCase())){
				flag=1;
				//author found
				books[i].display();
				//ask for number of copies
				this.displayPrice(books[i]);
			}
		}
		if (flag==0)
			System.out.println("No Books found!");
	}

	//method to search book by title
	void searchByTitle(String title_search){
		int flag=0;
		for (int i=0; i<books.length; i++) {
			if(books[i].title.toLowerCase().equals(title_search.toLowerCase())){
				flag=1;
				//title found
				books[i].display();
				//ask for number of copies
				this.displayPrice(books[i]);
			}
		}
		if (flag==0)
			System.out.println("No Books found!");
	}	

	//display the total cost of the book
	void displayPrice(Book book){
		//ask for number of copies
		Scanner scan=new Scanner(System.in);	
		System.out.print("Enter the number of copies : ");
		int copies=scan.nextInt();
		scan.close();

		System.out.println("Total Cost : " + (book.price*copies));
	}	

	//update the price of the book title searched
	void updatePrice(String title_search){
		int flag=0;
		Scanner scan=new Scanner(System.in);
		for (int i=0; i<books.length; i++) {
			if(books[i].title.toLowerCase().equals(title_search.toLowerCase())){
				flag=1;
				//title found, ask for new price
				System.out.print("Enter the new price for the book : ");
				double new_price=scan.nextDouble();
				books[i].price=new_price;
				books[i].display();
			}
		}
		scan.close();

		if (flag==0)
			System.out.println("No Books found!");
	}

	//method to display all details of all books
	void displayAll(){
		for (int i=0; i<books.length; i++) {
			books[i].display();
		}
	}

	//main method
	public static void main(String[] args) {
		//Scanner object
		Scanner scan=new Scanner(System.in);

		//object of the class
		Q25 object=new Q25();

		int choice=0;
		String name="";

		while(choice!=5){
			System.out.print("\n1.Search by Author\n2.Search by Title\n3.Display All\n4.Update price of Book\n5.Exit\nEnter your choice : ");
			choice=scan.nextInt();

			switch(choice){
				case 1:
					System.out.print("Enter the Author name to search : ");
					name=scan.next();
					object.searchByAuthor(name);
					break;
				case 2:
					System.out.print("Enter the Title to search : ");
					name=scan.next();
					object.searchByTitle(name);
					break;
				case 3:
					System.out.println("Displaying details of all Books");
					object.displayAll();
					break;
				case 4:
					System.out.print("Enter the book name whose price to update : ");
					name=scan.next();
					object.updatePrice(name);
					break;
				case 5:
					System.out.println("Thank You.");
					break;
				default :
					System.out.println("Wrong Choice.");
			}
		}
		scan.close();
	}//end main
}//end class