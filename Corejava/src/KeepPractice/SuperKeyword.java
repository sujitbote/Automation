package KeepPractice;


class Mentor11
{
	void Student()
	{
		System.out.println("this is origional method");
	}
}

public class SuperKeyword extends Mentor11
{
	
	void Student()
	{
		super.Student();
		//System.out.println("this is overriden method");
	}
	

	public static void main(String[] args) 
	{
		SuperKeyword s1 = new SuperKeyword();
		s1.Student();
	}

}
