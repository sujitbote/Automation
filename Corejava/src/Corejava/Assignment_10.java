package Corejava;

import java.util.Scanner;

public class Assignment_10 {
	
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter 1st no");
		int a = s1.nextInt();
		System.out.println("enter 1st no");
		int b = s1.nextInt();
		int sum = a + b;
		System.out.println("Sum of 2 no is = "+sum);
		int div = b/a;
		System.out.println("Div of 2 no is = "+div);
		int multi = b*a;
		System.out.println("Multi of 2 no is = "+multi);
		int sub = b-a;
		System.out.println("Sub of 2 no is = "+sub);
		s1.close();
	}

}
