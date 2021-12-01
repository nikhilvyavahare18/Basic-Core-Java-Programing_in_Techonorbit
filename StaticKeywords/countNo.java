class countNo
{	static int count=0;
	countNo()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String args[])
		{
		countNo c1=new countNo();
		countNo c2=new countNo();
		countNo c3=new countNo();
		}
}
