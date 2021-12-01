class demo
{
		
		int imployeId;
		String name;
		 static String company="capgemini";
		                                                //used to memory allocation
		
		demo(int impolyeId,String name)
		{
		
			this.imployeId=impolyeId;
			this.name=name;
		}
		void display()
		{
		System.out.println(imployeId+ " "+name+ " "+company);
		}
		
		public static void main(String args[])
		{
			demo d1= new demo(101,"nikhil");
			d1.display();
			demo d2=new demo(102,"shriram");
			d2.display();
		}
}



	
