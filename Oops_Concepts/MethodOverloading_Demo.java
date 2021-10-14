package package1;

public class MethodOverloading_Demo
{
	public void getpayment(int otp,long mobile_no)
	{
		System.out.println("Payment Through Paytem");
	}
	
	public void getpayment(int cvv,String password)
	{
		System.out.println("Payment Through DebitCard");
	}
	
	public void getpayment( int otp)
	{
		System.out.println("Payment Through NetBanking");
	}
	
	
	
	public static void main(String[] args) 
	{
		MethodOverloading_Demo d1= new MethodOverloading_Demo();
		d1.getpayment(8512,2356789);
		d1.getpayment(123,8989);
		d1.getpayment(14569);
		
		

	}

}
