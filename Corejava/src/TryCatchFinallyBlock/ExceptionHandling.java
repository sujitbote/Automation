package TryCatchFinallyBlock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
	
		
		for (int i=1; i <= 3 ; i++)
		{
			
			try
			{
				System.out.println("enter integer value: ");
				
				System.out.println("integer value is: "+sc.nextInt());
				
				System.out.println("correct input,program end.");
				
				break;
				
			}
			
			catch(InputMismatchException a2)
			{
				System.out.println("wrong input, please enter integer value again");
				
				sc.next();
				
				
			}
		
		}
		
	

	}

}
