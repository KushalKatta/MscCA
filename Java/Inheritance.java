/*
Author: Kushal Katta
Date Created: 3 Aug 2017
Date Last Modified: 3 Aug 2017
*/
class Person
{
    String name;
    byte age;

    Person()
    {
        name = "Shubham";
        age=21;
    }
    Person(String name, byte age)
    {
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

}
class Employee extends Person
{
    float salary;
    String org, desg;
    Employee() //First Calls Person Class's Constructor if not then default constructor of parent class.
    {
        salary=50000f;
        org="SIU";
        desg="cashier";
    }
    Employee(float salary, String org, String desg)
    {
        super("Nathan",(byte) 21); //It Should be the first keyword in constructor becoz parent class's constructor should be called first
        this.salary=salary;
        this.org=org;
        this.desg=desg;
    }
    Employee(String name, byte age, float salary, String org, String desg)
    {
        super(name, age);
        this.salary=salary;
        this.org=org;
        this.desg=desg;
    }
    void display()
    {
        super.display();

        System.out.println("Salary: " + salary);
        System.out.println("Organisation: " + org);
        System.out.println("Designation: " + desg);
    }
}

class Main
{
    public static void main(String[] args) {
        Employee emp1 = new Employee(150000f, "SICSR", "Co-ordinator");
        emp1.display();

        Employee emp2 = new Employee();
        emp2.display();

        Employee emp3 = new Employee("Vipul", (byte) 22, 70000f, "SIG", "Deputy Director");
        emp3.display();
    }
}