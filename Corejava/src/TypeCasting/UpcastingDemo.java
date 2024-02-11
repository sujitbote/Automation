package TypeCasting;

class WC2011
{
	void Captain1()
	{
		System.out.println("thala: MS Dhoni");
	}
}

class WC2019 extends WC2011
{
	void Captain2()
	{
		System.out.println("king kohli");
	}
}

class WC2023 extends WC2019
{
	void Captain3()
	{
		System.out.println("Hitman Rohit");
	}
}

public class UpcastingDemo extends WC2023
{
	void Captain4()
	{
		System.out.println("new captaibn TBD");
	}

	public static void main(String[] args) 
	{
		
		WC2019 w1 = new UpcastingDemo(); //upcasting from class 1 to class 3
		
		WC2023 w2 = (WC2023) w1; //downcasting from class 3 to class 2
		w2.Captain1();
	}

}
