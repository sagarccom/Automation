package basic;

public class B 
{
	public int div(int a, int b)
	{
		return(a/b);
	}
	public int mul(int a, int b)
	{
		return(a*b);
	}

	public static void main(String[] args)
	{
		B b=new B();
		System.out.println("Method of new class: ");
		System.out.println("Div: "+b.div(12, 40));
		System.out.println("Mul: "+b.mul(122, 880));
		
		A a=new A();
		System.out.println("\nMethod of old class: ");
		a.add(11, 30);
		a.sub(23, 990);
	}

}
