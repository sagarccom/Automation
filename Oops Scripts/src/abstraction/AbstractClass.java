package abstraction;

abstract class RBI
{
	public void NeftTime()
	{
		System.out.println("NeftTime: 1O AM TO 2 PM");
	}
	abstract int rOI();
}
class HDFC extends RBI
{

	@Override
	int rOI() 
	{
		return 8;
	}
	
}
class AXIS extends HDFC
{
	@Override
	int rOI() 
	{
		return 9;
	}
}


public class AbstractClass 
{

	public static void main(String[] args) 
	{
		HDFC h=new HDFC();
		System.out.println("*****WELCOM TO HDFC BANK*****");
		System.out.println("Roi Of hdfc: "+h.rOI()+"%");
		h.NeftTime();
		
		AXIS a=new AXIS();
		System.out.println("\n*****WELCOME TO AXIS BANK*****");
		System.out.println("Roi of axis: "+a.rOI()+"%");
		a.NeftTime();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
