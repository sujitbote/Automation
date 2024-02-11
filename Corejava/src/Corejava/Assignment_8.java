package Corejava;

public class Assignment_8 {

	public static void main(String[] args) 
	{
		int age = 67;
		char gender = 'F';
		
		if (age>65)
		{
			if (gender == 'M')
			{
				System.out.println("take 75% of ticket amount as you are male");
			}
			
			else 
			{
				System.out.println("ticket is free as you are a female");
			}
		
		}
		
		else
		{
			System.out.println("please pay full ticket");
		}
		
	}

}
