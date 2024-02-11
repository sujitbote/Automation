package KeepPractice;

public class primeNumbers {

	
	public static void main(String[] args)
	{
		System.out.println("Prime numbers are as follows:");
		
		for(int i=1; i<=1000; i++)
		{
			if(i==2)
			{
				System.out.print(i+" ");
			}
			else
			{
				if(!(i%2==0))
				{
					
					if(i>=9)
					{
						if(!(i%2==0) && !(i%3==0) && !(i%5==0) && !(i%7==0))
						{
							System.out.print(i+" ");
							
						}
					}
					else
					{
						System.out.print(i+" ");

					}
			}
			
			}
		
		}
		
	}
}

