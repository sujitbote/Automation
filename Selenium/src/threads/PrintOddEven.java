package threads;

class Odd extends Thread
{
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println("this is even no: "+ i);
			}
		}
		
	}
}

class Even extends Thread
{
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println("this is odd no: "+ i);
			}
		}
	}
}



public class PrintOddEven 
{

	public static void main(String[] args)
	{
		
		Odd t1 = new Odd();
		Even t2 = new Even();
		
		
		t1.start();
		
		t2.start();
		
	}

}
