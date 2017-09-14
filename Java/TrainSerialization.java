/*
Serialization in Java
*/

import java.io.*;

class Train implements Serializable
{
    String trainName;
    int trainNo;

    Train()
    {
        trainName = "Default";
        trainNo = 1;
    }

    Train(String trainName, int trainNo)
    {
        this.trainName = trainName;
        this.trainNo = trainNo;
    }

    public String toString()
    {
        return "Train Object " + trainName + ":=" + trainNo;
    }
}//Train Class End

class Serialization
{
    //Check Exception
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        //  Local Variable needs to be initialized.
        //  Instance Variable need not be initialized.
        //  fos, fis, oos, ois are Static So we need not initialize it. 

        // Creating ObjectOutputStream
        FileOutputStream fos = new FileOutputStream("trainsData.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);       //Similar to Buffered Reader
        
        // Creating ObjectInputStream
        FileInputStream fis = new FileInputStream("trainsData.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        
        //  Object of Train Class
        Train train1 = new Train("Pragati Express", 12125);

        //Write an object to stream
        oos.writeObject(train1);
        System.out.println("Train Object Serialized");

        oos.close();
        fos.close();

        //Deserialize
        Train train2 = null;
        train2 = (Train) ois.readObject();  //Because readObject return object of Object class (super class of all class), so it needs to be type casted

        System.out.println(train2);         //toString
        System.out.println(train2.trainName);

    }
}

/*
Assignment - to be Submitted on Monday

Question 1
Write a Java Program to read a String from User and encrypt it.
Encryption Key - Characters will be replaced by next Character. (a->b, b->c, z->a)

Question 2 
Read the file in Reverse Order

Question 3
Read a file Name from user and count how many times word "is" has occured.

Question 4
Read a file name, words from User and keep on writing words into file till 'stop' word is entered. 

Question 5
Accept 2 file names and swap the content of those files.
*/