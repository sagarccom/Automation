package Polymorphism;

public class Method_Overloading 
{
	public int add(int a, int b)
	{
		return(a+b);
	}
	public int add(int a, int b, int c)
	{
		return(a+b+c);
	}
	public float add(float a, float b)
	{
		return(a+b);
	}
	public double add(double a, double b)
	{
		return(a+b);
	}
	public long add(long a, long b)
	{
		return(a+b);
	}
	
	
	
	
	
	
	public static void main(String[] args)
	{
		Method_Overloading m=new Method_Overloading ();
		
		System.out.println("MethodOverloading: "+m.add(11, 40));
		System.out.println("MethodOverloading: "+m.add(11, 220));
		System.out.println("MethodOverloading: "+m.add(11, 220));
		System.out.println("MethidOverloading: "+m.add(11, 20));
		System.out.println("MethodOverloading: "+m.add(11, 220, 330));
		
		
		
		
		
		

	}

}
