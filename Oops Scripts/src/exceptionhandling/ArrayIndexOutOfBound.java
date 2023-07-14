package exceptionhandling;

import java.util.Scanner;

public class ArrayIndexOutOfBound
{

	public static void main(String[] args) 
	{
		int a[]= {10, 20, 30, 40, 50};
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the index of array: ");
		int b=s.nextInt();
		
		try
		{
			System.out.println(a[b]);
		}
		catch(Exception e)
		{
			System.out.println("Exception Thrown: "+e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
