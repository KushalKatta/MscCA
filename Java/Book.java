/*
Author: Kushal Katta
Date Created: 14 Aug 2017
*/
class Book
{
    int bookId;
    String bookTitle, bookAuthor;

    Book(int bookId, String bookTitle, String bookAuthor)
    {
        this.bookId=bookId;
        this.bookTitle=bookTitle;
        this.bookAuthor=bookAuthor;
    }

    void display()
    {
        System.out.println("\nBook Details: ");
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Book Author: " + bookAuthor);
    }
}//End of Book Class

class Main
{
    public static void main(String[] args) {
        //Declaring Object of Book Class
        Book books[] = new Book[5];
        
        String arrBook[] = {"Thinking In Java", "Complete Java", "Lack Book Java", "SCJP", "Java"};
        String arrAuthor[] = {"Bruce", "James", "Blank", "Seed", "Sun Micro"};

        for (int i=0; i<5; i++)
        {
            books[i]=new Book(i+1,arrBook[i], arrAuthor[i]);
            books[i].display();
        }
    }
}