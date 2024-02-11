package Corejava;


abstract class SuperDemo
{
	abstract void demo();
}

// this keyword - use to assign locan variable values to glabal variables having same name & datatype
// super keyword - use to call overriden method present from super class in sub class
// super calling statement - use to call constructor from super class in sub class
// this calling statement - use to call another constructor present in same class only

public class SuperKeyword extends SuperDemo
{
	void demo()
	{
		//super.demo();
		System.out.println("i am overriden method");
	}

	public static void main(String[] args) 
	{
		SuperKeyword sk = new SuperKeyword();
		sk.demo();
	}

}
