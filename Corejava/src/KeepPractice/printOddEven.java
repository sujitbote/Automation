package KeepPractice;

public class printOddEven 
{

	public static void main(String[] args) 
	{
		
//		for(int i=0; i<10; i++)
//		{
//			if(i % 2 == 0)
//			{
//				
//				System.out.println("this is even number = "+i);
//				
//			}
//			
//			else 
//			{
//				System.out.println("this is odd number = "+i);
//			}
//		}
		
		for(int i=1; i<=100; i++)
		{
			if(i % 3 == 0 && i % 5 == 0)
			{
				System.out.println(" printed Computer & Mouse = as "+ i +" is divisible by both 3 & 5");
			}
			
			else if(i % 3 == 0)
			{
				System.out.println(" printed Computer = as "+ i +" is divisible by 3");
			}
			
			else if(i % 5 ==0)
			{
				System.out.println(" printed Mouse = as "+ i +" is divisible by 5" );
			}
			
			
		}
		
		
		
		
		

	}

}
