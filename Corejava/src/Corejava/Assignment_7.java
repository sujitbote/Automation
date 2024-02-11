package Corejava;
public class Assignment_7 //Write a program to call constructor and call static method and non static method in one class

{
	static void StaticMethod(int a,int b)
	{
			int c = a + b;
		System.out.println("parameterised static method o/p = "+c);
	}
	
	void NonStaticMethod(int a)
	{
		int c = 10 +a;
		
		System.out.println("parameterised non static method o/p = " +c);
	}
	
	Assignment_7(int a, int b)
	{
		int c = a-b;
		System.out.println("parameterised Constructor o/p = " +c);
	}
	
	public static void main(String[] args) 
	{
		StaticMethod(10,20);
		Assignment_7 A1 = new Assignment_7(12,11);
		A1.NonStaticMethod(70);
	}

}
