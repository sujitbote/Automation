package TryCatchFinallyBlock;

public class ArrayIndexException {

	public static void main(String[] args) 
	{
		
		int a[] = new int[3];
		
		a[0]= 10;
		a[1]= 10;
		a[2]= 10;
		
		try
		{
			a[3]= 10;
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1);
		}
		
	}

}
