/*
Author: Kushal Katta
Date Created: 31 July 2017
Date Last Modified: 1 Aug 2017
*/
class Student
{
	String studentName;
	int studentAge;
	Teacher teacher;
	
	/*
	Student()
	{
		studentAge=0;
		studentName="NA";
	}
	*/
	
	Student(String studentName, int studentAge, Teacher teacher )
	{
		
		this.studentName=studentName;
		this.studentAge=studentAge;
		this.teacher=teacher;
	}
	
	void display()
	{
		System.out.println("Student Name: "+studentName);
		System.out.println("Student Age: "+studentAge);
		teacher.display();
	}
	
}


public class Teacher
{
	int teacherId;
	String teacherName;
	float salary;
	
	Teacher()
	{
		teacherId=0;
		teacherName="NA";
		salary=150000;
	}
	
	Teacher(int teacherId, String teacherName, float salary)
	{
		this.teacherId=teacherId;
		this.teacherName=teacherName;
		this.salary=salary;
	}
	
	void display()
	{
		System.out.println("Teacher ID: " + teacherId);
		System.out.println("Teacher Name: " + teacherName);
		System.out.println("Teacher Salary: " + salary);
		System.out.println();
	}
}
class Main
{
	public static void main(String []a)
	{
		Teacher teacher1=new Teacher();
		Teacher teacher2=new Teacher(101,"ABC",100000);
		Teacher teacher3=new Teacher(202,"XYZ",250000);

		Student student1 = new Student("Kushal", 19, teacher1);
		Student student2 = new Student("Mihir", 20, teacher2);
		Student student3 = new Student("Vipul", 21, teacher3);
		Student student4 = new Student("Shubham", 21, teacher1);
		Student student5 = new Student("Manan", 21, teacher2);
		Student student6 = new Student("DS", 22, teacher3);

		student1.display();
		student2.display();
		student3.display();
		student4.display();
		student5.display();
		student6.display();
	}
}
