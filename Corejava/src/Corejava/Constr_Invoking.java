package Corejava;
class Super1
{
	int a = 12;
	int b = 20;
	Super1()
	{
		int sum1 = a+b;
		System.out.println(sum1);
	}
}
class Super2 extends Super1
{
	Super2()
	{
		//super (int a, int b)
		int sum2 = a+b;             // we are implicitly INVOKING constructor
		System.out.println(sum2);
	}
	
	Super2(int a)
	{
		//super (int a, int b)
		int sum2 = a+b;             // we are implicitly INVOKING constructor
		System.out.println(sum2);
	}
}
public class Constr_Invoking extends Super2
{
//	Constr_Invoking()
//	{
//		//this();
//		//super (10,20); //we are explicitly INVOKING constructor here
//		int sum3 = a+b;
//		System.out.println(sum3);	
//	}
	public static void main(String[] args) 
	{
		new Constr_Invoking();
	}
}
