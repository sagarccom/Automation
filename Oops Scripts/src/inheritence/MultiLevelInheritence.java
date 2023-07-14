package inheritence;

class ParentClass
{
	public void cube(int x)
	{
		System.out.println("Cube: "+(Math.pow(x, 3)));
	}
}
class ChildClass1 extends ParentClass
{
	public void sI(int p, int q, int r)
	{
		System.out.println("SI: "+(p*q*r)/100);
	}
}
class ChildClass2 extends ChildClass1
{
	public void circle(int r)
	{
		System.out.println("AreaOfCircle: "+(r*r*3.14f));
	}
}


public class MultiLevelInheritence 
{

	public static void main(String[] args) 
	{
		ChildClass2 c2=new ChildClass2();
		System.out.println("Method of Parent Class: ");
		c2.cube(1);
		
		System.out.println("\nMethod of chilc class 1: ");
		c2.sI(22, 20, 50);
		
		System.out.println("\nMethod of child class 2: ");
		c2.circle(1);
		
		
		
		
		
	}

}
