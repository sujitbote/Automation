package collection;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) 
	{
		
		HashSet l1 = new HashSet();
		
		l1.add(10);
		l1.add(20);
		l1.add(null);
		l1.add("abc");
		l1.add(null);
		l1.add(20);
		l1.add("@#$");
		l1.add(20);
		l1.add(5);
		l1.add('a');
		
		System.out.println(l1);

		//Collections.sort(l1);
	}

}
