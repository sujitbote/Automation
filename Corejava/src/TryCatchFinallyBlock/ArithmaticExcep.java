package TryCatchFinallyBlock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmaticExcep {

	public static void main(String[] args) throws ArithmeticException, InputMismatchException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the age");
		
		int age = sc.nextInt();
		
		sc.close();
		
		if(age > 18)
		{
			System.out.println("you are allowed to access google.com");
		}
		else if(age < 18)
		{
			throw new InputMismatchException();
		}

		else if(age == 18)
		{
			throw new ArithmeticException();
		}
		
	}

}
