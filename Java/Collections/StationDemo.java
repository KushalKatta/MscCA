/* Hash Map */

import java.util.*;

class Student
{
    int prn;
    String name;

    Student(int prn, String name)
    {
        this.prn = prn;
        this.name = name;
    }

    public String toString()
    {
        return "PRN: " + prn + ", Name: " + name;
    }
}

class StationDemo
{
    public static void main(String[] args) {
        ArrayList<String> stations1 = new ArrayList <String> ();
        stations1.add("Ahmedabad");
        stations1.add("Surat");
        stations1.add("Vapi");
        stations1.add("Valsad");

        ArrayList<String> stations2 = new ArrayList <String> ();
        stations2.add("Ahmedabad");
        stations2.add("Surat");
        stations2.add("Vapi");
        stations2.add("Valsad");

        HashMap <Integer, ArrayList> train_station = new HashMap <Integer, ArrayList> ();
        train_station.put(12121, stations1);
        train_station.put(14141, stations2);

        System.out.println("Train: " + train_station);

        ArrayList <Student> studentList = new ArrayList <Student> ();

        studentList.add(new Student(1, "Akash Arora"));
        studentList.add(new Student(2, "Krutarth Amin"));
        studentList.add(new Student(3, "Ankit Patel"));
        studentList.add(new Student(4, "Danush Mody"));

        System.out.println(studentList);
    }
}