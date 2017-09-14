/*
Write a java program to read username and password from user
if username is MScCA and password is admin
then
valid user
else throw
user defined exception saying Invalid User
*/

import java.util.Scanner;
class DB
{
    String userName;
    String password;

    DB(String userName, String password)
    {
        this.userName=userName;
        this.password=password;
    }

    void authenticate() throws Exception
    {
        if(userName.equals("MScCA") & password.equals("admin"))
        {
            System.out.println("Authentication Successfull.");
        }
        else
            throw new Exception("Invalid Credentials !");
    }
}

class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter User Details :- ");
        System.out.println();
        System.out.print("User Name: ");
        String userName = scan.next();
        System.out.print("Password: ");
        String password = scan.next();
        
        scan.close();

        DB record1 = new DB(userName, password);

        try
        {
            record1.authenticate();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}