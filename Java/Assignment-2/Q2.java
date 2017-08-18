/*
Author: Kushal Katta
Date Created: 08 Aug 2017
*/

class Employee
{
    String name, DOB;
    int id;
    Employee(){
        name="default";
        DOB="01 Jan 1970";
        id=0;
    }
    Employee(String name, String DOB, int id){
        this.name=name;
        this.DOB=DOB;
        this.id=id;
    }
    void display()
    {
        System.out.println("Name : " + name);
        System.out.println("DOB : " + DOB);
        System.out.println("ID : " + id);
    }

}
class Manager extends Employee
{
    long salary;
    Manager()
    {
        this.salary=0;
    }
    Manager(String name, String DOB, int id, long salary)
    {
        super(name,DOB,id);
        this.salary=salary;
    }
    void display()
    {
        super.display();
        System.out.println("Salary : " + salary);
    }

}
class SalesManager extends Manager
{
    float commission;
    SalesManager()
    {
        commission=0;
    }
    SalesManager(String name, String DOB, int id, long salary)
    {
        super(name,DOB,id,salary);
    }
    SalesManager(String name, String DOB, int id, long salary, float commission)
    {
        super(name,DOB,id,salary);
        this.commission=commission;
    }
    void display()
    {
        super.display();
        System.out.println("Commission : " + commission);
        System.out.println();
    }
}

class Main
{
    public static void main(String[] args) {
        SalesManager manager1 = new SalesManager();
        manager1.display();
        SalesManager manager2 = new SalesManager("Vipul Dhimate", "01 Jan 1996", 1, 250000);
        manager2.display();
        SalesManager manager3 = new SalesManager("Nathan Dpenha", "01 Jan 1996", 2, 300000, 25000f);
        manager3.display();
    }
}