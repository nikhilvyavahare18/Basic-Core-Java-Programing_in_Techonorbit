
class Animal
{
	void eat()
	{
		System.out.println("I am Eating");
	}
	public static void main(String args[])
	{
		System.out.println("____*****____");
		Animal buzo= new Animal();
		buzo.eat();
		buzo.run();
	}
	void run()
	{
		
		System.out.println("I am Running");
	}
}