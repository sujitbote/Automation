package collection;

import java.util.Collections;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) 
	{
		
		TreeSet l1 = new TreeSet();
		
		l1.add(10);
		l1.add(20);
		//l1.add(null);
		//l1.add("abc");
		//l1.add(null);
		l1.add(20);
		//l1.add("@#$");
		l1.add(20);
		l1.add(5);
		//l1.add('a');
		
		//Collections.sort(l1);
		
		System.out.println(l1);
		
		l1.iterator().next();
		System.out.println(l1.iterator().next());
		System.out.println(l1.iterator().next());

		
		
		
	}

}
