package basic;

public class A 
{
	public void add(int a, int b)
	{
		System.out.println("Add: "+(a+b));
	}
	public void sub(int a, int b)
	{
		System.out.println("Sub: "+(a-b));
	}

	public static void main(String[] args) 
	{
		A a=new A();
		a.add(12, 30);
		a.sub(12, 60);

	}

}
