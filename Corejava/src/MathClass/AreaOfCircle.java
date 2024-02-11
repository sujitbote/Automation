package MathClass;

public class AreaOfCircle {

	public static void main(String[] args) 
	{
		
			
		
		
		//System.out.println("The area of circle is: "+ circlearea);
		
		for(int i=0; i<=10; i++)
		{
			double random = Math.random();
			double pi = Math.PI;
			double circlearea = ((pi) * (random *random));
			System.out.println("The area of circle is: "+ circlearea);
			
		}

	}

}
