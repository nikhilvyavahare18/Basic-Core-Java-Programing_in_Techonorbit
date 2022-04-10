abstract class vehical
{
	int n=10;
	abstract void start();
	void fun()
	{
		System.out.println("Concrete Method in Abstarct class");
	}
}
class bike extends vehical
{
	void start()
	{
	System.out.println(n);

	System.out.println("Start with kick");
	}
	
}
class car extends vehical
{
	void start()
	{
	System.out.println("Start with Key");
	}
	public static void main(String args[])
	{
	
	car c = new car();
	c.fun(); 
	c.start();
	bike b = new bike();
	b.start();
	
	
	}
}