package asserts;

import java.util.Scanner;

public class AssertIfElse {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();
		
		assert age >= 18 : "age is not greater than or equals to 18";

		System.out.println("you can vote");
		
		sc.close();

	}

}
