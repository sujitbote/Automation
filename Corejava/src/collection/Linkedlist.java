package collection;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) 
	{
		
		LinkedList l1 = new LinkedList();
		
		l1.add(10);
		l1.add(20);
		//l1.add(null);
		//l1.add("abc");
		//l1.add(null);
		l1.add(50);
		//l1.add("@#$");
		l1.add(20);
		l1.add(5);
		//l1.add('a');
		
		System.out.println(l1);

		Collections.sort(l1);
		
		System.out.println(l1);
		
		
		

	}

}
