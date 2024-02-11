package KeepPractice;


class Teacher1
{
	Teacher1()
	{
		this(10,10);
		System.out.println("this is super constr 2");
	}
	
	Teacher1(int a, int b)
	{
		
		System.out.println("this is super constr 3");
	}
}


public class ThisCallingStatement extends Teacher1
{
	
	ThisCallingStatement()
	{
		this(10);
		System.out.println("this is constr 1");
	}
	
	ThisCallingStatement(int a, int b)
	{
		this();
		System.out.println("this is constr 2");
	}
	
	ThisCallingStatement(int a)
	{
		//this();
		System.out.println("this is constr 3");
	}

	public static void main(String[] args)
	{
		new ThisCallingStatement(10,10);

	}

}
