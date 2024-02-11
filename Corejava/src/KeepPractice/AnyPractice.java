package KeepPractice;

class Teacher22
{
	void Demo()
	{
		System.out.println("i am super class demo");
	}
	void Demo(int a)
	{
		System.out.println("i am super class demo with para");
	}
}

public class AnyPractice extends Teacher22
{
	void Demo (int a, int b)
	{
		
	}
	
	void Demo()
	{
		super.Demo();
		System.out.println("i am sub class demo");
	}
	
	
	public static void main(String[] args) 
	{
		
		AnyPractice a1 = new AnyPractice();
		a1.Demo();
		a1.Demo(10);
		
		
	}
	

}
