package TryCatchFinallyBlock;

import java.util.Scanner;

public class AllExceptions {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter int value 1");
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		try 
		{
			int sum = a/b;
			
			System.out.println(sum);
			
		}
		catch (ArithmeticException ex1)
		{
			
			System.out.println(ex1);
		}
		
		System.out.println("excecution completed");


	}

}
