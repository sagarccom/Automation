package basic;

public class Constructor 
{
	int x, y;
	Constructor(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public void add()
	{
		System.out.println("Addition: "+(x+y));
	}
	public void sub()
	{
		System.out.println("Subtraction: "+(x-y));
	}
	public void div()
	{
		System.out.println("Division: "+(x/y));
	}
	public void mul()
	{
		System.out.println("Multiplication: "+(x*y));
	}
	
	
	
	public static void main(String[] args) 
	{
		Constructor c=new Constructor(122, 222);
		c.add();
		c.sub();
		c.div();
		c.mul();
		

	}

}
