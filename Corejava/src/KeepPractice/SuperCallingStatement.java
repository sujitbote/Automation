package KeepPractice;

class Mentor
{
	Mentor()
	{
		System.out.println("this is constr 1");
	}
}

class Teacher extends Mentor
{
	Teacher()
	{
		//super();
		System.out.println("this is constr 2");
	}
	
	Teacher(int a, int b)
	{
		System.out.println("this is constr 3");
	}
}

public class SuperCallingStatement extends Teacher
{
	SuperCallingStatement()
	{
		super(10,10);
		
		System.out.println("sub class constr 1");
	}
	
	SuperCallingStatement(int a, int b)
	{
		super(10,10);
		System.out.println("sub class constr 2");
	}
	
	
	public static void main(String[] args) 
	{
		new SuperCallingStatement();
		new SuperCallingStatement(11,22);

		
	}

}
