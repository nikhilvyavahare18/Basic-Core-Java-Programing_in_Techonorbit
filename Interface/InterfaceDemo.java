interface Vehical  // interface name should be small
{		int a=10;  // By defalut this are final , static , public 
		void start();
}
class Bike implements  Vehical
{
		public void start() // Greter modifires used for method because public id ByDefault
		{
			//a++;  //Final vairiable
		System.out.println(a);
		System.out.println("Start with Key..!!");
		}
}
class MainMethod
{
	public static void main(String args[])
	{
		Vehical v = new Bike(); // Refrenace of interface and Object of Child class is allowed
		v.start();
		
	}
}