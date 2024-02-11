package Corejava;

class Superclass
{
	static void Student1()
	{
		System.out.println("this is 1st static method from superclass");
	}
	static void Student2()
	{
		System.out.println("this is 2nd static method from superclass");
	}
	void Teacher1()
	{
		System.out.println("this is 1st non static method from superclass");
	}
	void Teacher2()
	{
		System.out.println("this is 2nd non static method from superclass");
	}
}

public class Assignment_12 extends Superclass
{

	void Mentor1()
	{
		System.out.println("this is 1st non static method from  main method");
	}
	void Mentor2()
	{
		System.out.println("this is 2nd non static method from  main method");
	}
	
	public static void main(String[] args) 
	{
		Student1();
		Student2();		
		Assignment_12 a1 = new Assignment_12();
		a1.Teacher1();
		a1.Teacher2();
		a1.Mentor1();
		a1.Mentor2();
	}

}
