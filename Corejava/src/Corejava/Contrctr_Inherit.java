package Corejava;

class Super11
{
	int a = 10;
	int b = 10;
	
	void Mentor()
	{
		int sum1 = a+b;
		System.out.println(sum1);
	}
}

class Super22 extends Super11
{
	void Teacher()
	{
		int sum2 = a-b;
		System.out.println(sum2);
	}
}

public class Contrctr_Inherit extends Super22 {

	public static void main(String[] args) 
	{
		Contrctr_Inherit c1 = new Contrctr_Inherit();
		c1.Mentor();
		c1.Teacher();
	}

}
