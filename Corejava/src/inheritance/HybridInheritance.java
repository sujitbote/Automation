package inheritance;

//sub>>super
//sub>>super1>>super2>>super3
//sub>>super1,super2
//sub,sub>>super1
//sub>>super1>>super2>>

class Super3
{
	void demo1()
	{
		System.out.println("this is static1");
		System.out.println("this is static11");
		System.out.println("this is static12");
	}
}

//interface Super2 extends Super3
//{
//	
//}

public class HybridInheritance extends Super3
{
	 void demo1()
	{
		//super.demo1();
		System.out.println("this is static1");
		System.out.println("this is static11");
	}

	public static void main(String[] args) 
	{

		HybridInheritance h1 = new HybridInheritance();
		h1.demo1();
		h1.demo1();
		

	}

}
