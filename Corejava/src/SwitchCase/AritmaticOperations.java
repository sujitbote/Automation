package SwitchCase;

import java.util.Scanner;

public class AritmaticOperations {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st value");
		int a= sc.nextInt();
		System.out.println("enter 2nd value");
		int b = sc.nextInt();
		
		System.out.println("enter which no of case you want to execute");
		switch(sc.nextInt())
		{
			case 1:
				int add = a+b;
				System.out.println("addition is: "+add);
				break;
			
			case 2: 
				int sub = a-b;
				System.out.println("substraction is: "+sub);
				break;
				
			case 3: 
				int multi = a*b;
				System.out.println("multiplication is: "+multi);
				break;

			case 4: 
				int div = a/b;
				System.out.println("division is: "+div);
				break;
				
			default:
				System.out.println("wrong input, only 4 cases are here & that is why this default block is executed");
		}
		sc.close();
	
}
}
		
		

