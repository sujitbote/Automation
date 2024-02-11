package Corejava;

public class Assignment_9 
{
	 int a = 10;
	 int b = 20;
	
	void Add()
	{
		int add = a+b;
		System.out.println(add);
	}
	void Sub() 
	{
		int sub = a-b;
		System.out.println(sub);		
	}
	 void Multi()
	{
		int multi =a*b;
		System.out.println(multi);
	}
	void Div() 
	{
		int div=b/a;
		System.out.println(div);
	}
	
	public static void main(String[] args) 
	{
		Assignment_9 A1 = new Assignment_9();
		A1.Add();
		A1.Div();
		A1.Sub();
		A1.Multi();
	
	}

}
