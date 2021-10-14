package package1;

public class Dog extends Animal 
{
	public void Bark()
	{
		System.out.println("Barking");
	}

	public static void main(String[] args) 
	{
		Dog d =new Dog();
		d.eat();
		d.Bark();
		d.Sleep();
	}

}
