package CorejavaLearn;

interface super10
{
	abstract public void demo1(); //public static void main = can have any acc spec, always non static, any return type
	
}

abstract class super20 implements super10
{
	public void demo1()
	{
		System.out.println("this is interface method");
	}
	
	super20() 
	{
		System.out.println("this is constructor from super classs");
	}
	
	abstract public void demo2();
	
	static void demo3()
	{
		
	}
}

//class super4 extends super20
//{
//	
//	static void demo4()
//	{
//		
//	}
//	
//	public void demo1() 
//	{
//		System.out.println("this is interface");
//	}
//
//	public void demo2()
//	{
//		System.out.println("this is abstract");
//
//	}
	

public class InerfacePractice extends super20
{
//	InerfacePractice() 
//	{
//		super(10);
//		System.out.println("sub class constructor");
//	}

	public void demo2()
	{
		System.out.println("this is abstract method");
	}

	public static void main(String[] args) 
	{
		InerfacePractice a1 = new InerfacePractice();
		//new super20(10);
		
		a1.demo2();
		a1.demo1();
		
	}

}
