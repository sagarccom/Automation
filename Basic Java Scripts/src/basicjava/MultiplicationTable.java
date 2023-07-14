package basicjava;

import java.util.Scanner;

public class MultiplicationTable
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a number to print it's multiplication table: ");
		int a=s.nextInt();
		
		System.out.println("Multiplication table of: "+a);
		
		for(int i=1;i<=12; i++ )
		{
			System.out.println(a+"*"+i+"="+(a*i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
