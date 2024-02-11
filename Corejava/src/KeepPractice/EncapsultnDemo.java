package KeepPractice;

class Test1
{
	private int oldPass = 1234;//2233
	
	
	public void SetValue(int oldPass)
	{
		this.oldPass = oldPass;	
	}
	
	public int GetValue()
	{
		return oldPass;
	}
	
}


public class EncapsultnDemo extends Test1
{

	public static void main(String[] args) 
	{
		System.out.println("old password is 1234");

		EncapsultnDemo a1 = new EncapsultnDemo();
		a1.SetValue(2233);
		int newreturnedvalue = a1.GetValue();
		System.out.println("newly returned value is: "+newreturnedvalue);

	}

}
