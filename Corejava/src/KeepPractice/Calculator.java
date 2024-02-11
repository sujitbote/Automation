package KeepPractice;

import java.util.Scanner;

public class Calculator
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st no");
		int a = sc.nextInt();
		System.out.println("enter 2nd no");
		int b = sc.nextInt();
		System.out.println("enter 3rd no");
		int c = sc.nextInt();
		System.out.println("enter 4th no");
		int d = sc.nextInt();
		int sum = a+b+c+d;
		System.out.println("sum of 4 nos = " + sum);
		
	}
}