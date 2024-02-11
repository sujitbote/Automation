package TypeCasting;

public class Narrowing {

	public static void main(String[] args)
	{
		
		int a = 45000;
		
		byte b = (byte) a;
		
		System.out.println("int converted into byte value is: "+b);
		
		double weight = 861.5473;
		
		long l = (long) weight;
		
		System.out.println("double converted into long value is: "+l);

		byte bt = (byte) weight;
		
		System.out.println("double converted into byte value is: "+bt);

		

	}

}
