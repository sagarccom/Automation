package inheritence;

class Parent1
{
	public void circle(int p, int q, int r)
	{
		System.out.println("AreaOfCircle: "+(p*q*r)/100);
	}
}
class Child1 extends Parent1
{
	public void rectangle(int h, int l)
	{
		System.out.println("AreaOfRectangle: "+(0.5*h*l));
	}
}
class Child2 extends Child1
{
	public void tringle(int h, int l)
	{
		System.out.println("AreaOfTringle: "+(h*l));
	}
}


public class HirachicalInheritence 
{

	public static void main(String[] args) 
	{
		Child1 c1=new Child1();
		System.out.println("Method of old class: ");
		c1.circle(12, 230, 230);
		c1.rectangle(11, 770);
		
		Child2 c2=new Child2();
		System.out.println("\nMethod of new class: ");
		c2.circle(11, 230, 30);
		c2.tringle(11, 220);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
