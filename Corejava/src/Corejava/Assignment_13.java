package Corejava;

class Supermostclass
{
	void Principal1()
	{
		System.out.println("this is 1st non static method from supermost class");
	}
	void Principal2()
	{
		System.out.println("this is 2nd non static method from supermost class");
	}
}

class Super_class extends Supermostclass
{
	static void Teacher1()
	{
		System.out.println("this is 1st static method from super class");
	}
	static void Teacher2()
	{
		System.out.println("this is 2nd static method from super class");
	}
}


public class Assignment_13 extends Super_class
{
	void Student1()
	{
		System.out.println("this is 1st non static method from sub class");
	}
	void Student2() 
	{
		System.out.println("this is 2nd non static method from sub class");
	}
	
	public static void main(String[] args) 
	{
		Teacher1();
		Teacher2();
		
		Assignment_13 a1 = new Assignment_13();
		a1.Principal1();
		a1.Principal2();
		a1.Student1();
		a1.Student2();
		
		
	}

}
