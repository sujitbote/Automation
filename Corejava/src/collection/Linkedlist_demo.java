package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist_demo {

	public static void main(String[] args)
	{
		
		LinkedList l1 = new LinkedList();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter linkedlist elements");
		System.out.println("-----------------------------------");
		
		System.out.println("enter 1st int value");
		l1.add(sc.nextInt());
		System.out.println("enter 2nd int value");
		l1.add(sc.nextInt());
		System.out.println("enter 3rd int value");
		l1.add(sc.nextInt());
		System.out.println("enter 4rt int value");
		l1.add(sc.nextInt());
	/*	l1.add(null);
		System.out.println("enter 5th string value");
		l1.add(sc.next());
		l1.add(null);
		System.out.println("enter 6th string value");
		l1.add(sc.next());
*/
		System.out.println(l1);

		l1.sort(null);
		
		System.out.println(l1);

	}

}
