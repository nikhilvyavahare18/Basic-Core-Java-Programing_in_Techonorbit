class student
{
	private int age;
	
	void setAge(int age)
	{
	
		if(age>0)
		{
			this.age=age;
		}
		else
		{
			System.out.println("Invalid Age");
		}
	}
	int getAge()
	{
		return this.age;
	}
}
class clerk
{
	public static void main(String args[])
	{
		student swajit= new student();
		swajit.setAge(10);
		swajit.getAge();
		System.out.println(swajit.getAge());
	}
}