package exceptionhandling;

import java.util.Scanner;

public class ArithmaticalException 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a=s.nextInt();
		System.out.println("Enter second number: ");
		int b=s.nextInt();
		
		try
		{
			System.out.println("Div: "+(a/b));
		}
		catch(Exception e)
		{
			System.out.println("Exception Thrown: "+e);
		}
		finally
		{
			System.out.println("*****FAMILY BLOCK*****");
			System.out.println("Mul: "+(a*b));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
