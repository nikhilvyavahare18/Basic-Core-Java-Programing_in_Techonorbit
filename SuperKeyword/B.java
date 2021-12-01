class A
{
	int a=50;
}
class B extends A
{
	int a=100;
	
	void show(int a)
	{
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
	}
	public static void main(String args[])
	{
	B obj= new B();
	obj.show(200);
	}
}