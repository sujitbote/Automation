package threads;

class Thrad1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("ramu");
		}
	}
}

class Thrad2 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("vishal");
		}
	}
}

class Thrad3 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("sujit");
		}
	}
}

public class ThreadPractice
{
	public static void main(String[] args) 
	{
		
		Thrad1 t1 = new Thrad1();
		Thrad2 t2 = new Thrad2();
		Thrad3 t3 = new Thrad3();

		
		t1.start();
		t2.start();
		t3.start();
	}

}
