package Polymorphism;

class Div1
{
	public void div(int a, int b)
	{
		System.out.println("Class1: ");
		System.out.println("Answer: "+(a/b));
	}
}
class Div2
{
	public void div(int a, int b)
	{
		System.out.println("\nClass2: ");
		System.out.println("Reminder: "+(a%b));
	}
}

public class Method_Overriding 
{

	public static void main(String[] args)
	{
		Div1 d1=new Div1();
		d1.div(22, 90);
		
		Div2 d2=new Div2();
		d2.div(111, 330);
		
		
		
		
		
		
		
		
		
		

	}

}
