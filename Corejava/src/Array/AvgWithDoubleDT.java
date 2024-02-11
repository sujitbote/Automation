package Array;

public class AvgWithDoubleDT {

	public static void main(String[] args) 
	{
		
		double d[] = {10.34,20.43,30.23,40.244,50};
		
		double sum = 0;
		
		for(int i=0; i<=d.length-1; i++)
		{
			sum = sum + d[i];
			
		}
		System.out.println("sum of double DT array is: "+sum);
		System.out.println("avg of array is: "+sum/d.length);
		System.out.println("remainder of array div is :"+sum%d.length);

		
		
		
		

	}

}
