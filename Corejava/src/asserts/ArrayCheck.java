package asserts;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCheck {

	public static void main(String[] args) 
	{
		
		int a[] = new int[4];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		assert a.length == 4: "this is invalid condition";
		
		System.out.println("arrays length is equals to 4");
		
		
		
		
	}

}
