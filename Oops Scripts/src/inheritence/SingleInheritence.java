package inheritence;

class ParentClass
{
	public void cube(int x)
	{
		System.out.println("Cube: "+(Math.pow(x, 3)));
	}
}
class ChildClass extends ParentClass
{
	public void sI(int p, int q, int r)
	{
		System.out.println("SI: "+(p*q*r)/100);
	}
}

public class SingleInheritence 
{

	public static void main(String[] args)
	{
		ChildClass c=new ChildClass();
		c.cube(2);
		c.sI(11, 220, 450);
		
		
		
		
		
		
		
		
		

	}

}
