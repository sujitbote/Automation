package Corejava;
abstract class Test1
{
	abstract void add();
	abstract void sub();
	
	static void add1()
	{
		System.out.println("i am concreate static method in abstract class 1");
	}
	void sub1()
	{
		System.out.println("i am concrete non static method in abstract class 1");
	}
}
abstract class Test2 extends Test1
{
	abstract void multi();
	abstract void div();
	
	static void multi1()
	{
		System.out.println("i am concrete static method in abstract class 2");
	}
	void div1()
	{
		System.out.println("i am concrete non static method in abstract class 2");
	}
	
}
public class AbstractClass extends Test2
{
	void add()
	{
		System.out.println("i am 1st unimplemented overriden abstract method of abstract class 1");
	}
	void sub()
	{
		System.out.println("i am 2nd unimplemented overriden abstract method of abstract class 1");
	}
	void multi()
	{
		System.out.println("i am 1st unimplemented overriden abstract method of abstract class 2");
	}
	void div()
	{
		System.out.println("i am 2nd unimplemented overriden abstract method of abstract class 2");

	}
	
	void sub1()
	{
		super.sub1();
		System.out.println("i am overriden non static method");
	}
	
	public static void main(String[] args) 
	{
		add1();
		multi1();
		
		AbstractClass ab = new AbstractClass();
		ab.add();
		ab.sub();
		ab.sub1();
		ab.multi();
		ab.div();
		ab.div1();	
	}
}
