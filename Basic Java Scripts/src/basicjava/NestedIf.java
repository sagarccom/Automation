package basicjava;

import java.util.Scanner;

public class NestedIf 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter First Mumber: ");
		int a=s.nextInt();
		
		System.out.println("Enter Second Number: ");
		int b=s.nextInt();
		
		System.out.println("Enter Third Number: ");
		int c=s.nextInt();
		
		if(a>b & a>c)
		{
			System.out.println(a+"is greatest..");
		}
		else if(b>a & b>c)
		{
			System.out.println(b+"is greatest..");
		}
		else if(c>a & c>b)
		{
			System.out.println(c+"is greatest..");
		}
		else
		{
			System.out.println("Greatest numbers are equal..");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
