package package1;

class Engineer
{
		public void Instruments()
	{
		System.out.println("Differnts Instruments tools");
	}
}
	
		class ITEngineer extends Engineer
		{
			public void Instruments()
			{
				System.out.println("Laptop,Keybord");
			}
			
		}
		class CIVILEngineer extends Engineer
		{
			public void Instruments()
			{
				System.out.println("VAlu,Brikes");
			}
		}
		class MECHANICALEngineer extends Engineer
		{
			public void Instruments()
			{
				System.out.println("Length_machine,Welding");
			}
		}
	
public class MethodOverridding_Demo
{

	public static void main(String[] args) 
	{
		Engineer er= new ITEngineer();
		er.Instruments();
		
		Engineer er1= new CIVILEngineer();
		er1.Instruments();
		
		Engineer er2= new MECHANICALEngineer();
		er2.Instruments();

	}

}
