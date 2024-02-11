package KeepPractice;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrays {

	public static void main(String[] args) 
	{
		int rollno[]= {1,2,4,5};
		
		Arrays.sort(rollno);
		
		System.out.println(Arrays.toString(rollno));
		
		//Arrays.sort(rollno, Collections.reverseOrder());
		
		//System.out.println(Arrays.toString(rollno));

	}

}
