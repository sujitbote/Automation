package Incapsulation;


class UpdateOTP
{
	private int OTP;

	public void set_OTP(int OTP) 
	{
		this.OTP = OTP;
	}
	
	public int get_OTP() 
	{
		return OTP;
		
	}
	
}

public class ReturnUpdatedOTP {

	public static void main(String[] args) 
	{
		
		UpdateOTP s1 = new UpdateOTP();
		
		s1.set_OTP(100);
	
		System.out.println("updated OTP is: "+s1.get_OTP());
		
		
		
	}

}
