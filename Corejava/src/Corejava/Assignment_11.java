package Corejava;

import java.util.Scanner;

public class Assignment_11 {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter value of byte");
		s1.nextByte();
		System.out.println("enter value of short");
		s1.nextShort();
		System.out.println("enter value of int");
		s1.nextInt();
		System.out.println("enter value of long");
		s1.nextLong();
		System.out.println("enter value of float");
		s1.nextFloat();
		System.out.println("enter value of double");
		s1.nextDouble();
		System.out.println("enter value of string");
		s1.next();
		s1.close();
		
	}

}
