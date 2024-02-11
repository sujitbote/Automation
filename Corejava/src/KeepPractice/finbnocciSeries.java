package KeepPractice;

public class finbnocciSeries {

	public static void main(String[] args) //0,1,1,2,3,5,8
	{
		
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0; i<10; i++)
		{
					
			int sum = a + b;//sum=1, b=1, a=1, sum=2, b=2,a=1
			System.out.println(sum);
			a=b;
			b = sum;
			
			
			
		}
		

//				int a = 0;
//				int b = 0;
//				int c = 1;
//				System.out.println("fibnocci series is as follows:");
//				for(int i=0; i<10; i++)
//				{
//					
//					a=b;
//					b=c;
//					c = a+b;
//					System.out.print(a+" ");
//					
//				}
		
		

	}

}
