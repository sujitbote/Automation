package Corejava;

public class assignment_6 {

	
	void NonStatic() 
	{
		System.out.println("I am non static method called inside static main method");
	}
	
	static void Test()
	{
		System.out.println("I am static method called inside static main method");
	}
	
	
	public static void main(String[] args) 
	{
		assignment_6 n1 = new assignment_6();
		n1.NonStatic();
		
		Test();

	}

}
