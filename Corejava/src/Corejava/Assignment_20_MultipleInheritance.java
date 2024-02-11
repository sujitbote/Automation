package Corejava;

interface Mentor
{
	void Student1();
	int a=10;
	void Student2();
}

abstract class Teacher
{
	abstract void Student3();
	abstract void Student4();
	
	static int b=10;
	
	static void Student5()
	{
		System.out.println("this is 1st static concrete method in abstract method");
	}
	
	void Student6()
	{
		System.out.println("this is 2nd non static concrete method in abstract method");
	}
}

public class Assignment_20_MultipleInheritance extends Teacher implements Mentor
{
	
	static void Student7()
	{
		System.out.println("this is 1st static concrete method in main method");
	}
	
	void Student8()
	{
		System.out.println("this is 2nd non static concrete method in main method");
	}
	
	public static void main(String[] args) 
	{
		Assignment_20_MultipleInheritance a1 = new Assignment_20_MultipleInheritance();
		a1.Student1();
		System.out.println(a);
		System.out.println(b);

		a1.Student2();
		a1.Student3();
		a1.Student4();
		Student5();
		a1.Student6();
		Student7();
		a1.Student8();		
	}

	public void Student1() 
	{
		System.out.println("this is 1st abstract method in interface");		
	}

	public void Student2() 
	{
		System.out.println("this is 2nd abstract method in interface");		
	}

	void Student3() 
	{
		System.out.println("this is 1st abstract method in abstract class");		
	}

	void Student4() 
	{
		System.out.println("this is 1st abstract method in abstract class");		
	}
}
