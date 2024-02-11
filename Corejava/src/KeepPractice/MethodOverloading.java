package KeepPractice;

class Demo
{
	void Student(float  a)
	{
		System.out.println("hello world origional 1");
	}
	
	void Student()
	{
		System.out.println("hello world origional 2");
	}
	
	static void Student(int a)
	{
		System.out.println("i am new to java origional 1");
	}
	
	static void Student(int a, int b) //overloading
	{
		System.out.println("i am new to java origional 2");
	}
}

public class MethodOverloading extends Demo
{
	void Student(float  a)  //overriding
	{
		super.Student(1.0f);
		//super.Student(1.0f);
		System.out.println("hello world ovrriden 1");
	}
	
	void Student() //overriding
	{
		super.Student();
		System.out.println("hello world ovrriden 2");
	}
	
	/*static void Student(int a)
	{
		//super.Student(10); can't use super in static method
		System.out.println("i am new to java overriden 1");
	}
	
	static void Student(int a, int b) //overloading
	{
		System.out.println("i am new to java overriden 2");
	}*/
	
	public static void main(String[] args) 
	
	{
		MethodOverloading m1 = new MethodOverloading();
		m1.Student(10f);
		m1.Student();
		Student(10);
		Student(10,10);

		}
}
