package Corejava;

interface Manufacturer
{
	void FourWheeler();
}
interface Supplier
{
	void TwoWheeler();
}

public class Assignment_19 implements Manufacturer,Supplier
{
	
	public void FourWheeler()
	{
		System.out.println("this is abstrct method from 1st interface");
	}
	
	public void TwoWheeler()
	{
		System.out.println("this is abstrct method from 2nd interface");
	}
	
	public static void main(String[] args) 
	{
		Assignment_19 a1 = new Assignment_19();
		a1.FourWheeler();
		a1.TwoWheeler();
	}

}
