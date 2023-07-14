package basicjava;

import java.util.Scanner;

public class SumOfArray 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size of first array: ");
		int size1=s.nextInt();
		
		int a1[]=new int[size1];
		
		System.out.println("\nEnter the values in array: ");
		for(int i=0; i<a1.length; i++)
		{
			a1[i]=s.nextInt();
		}
		
		System.out.println("\nDisplay first array: ");
		for(int i=0; i<a1.length; i++)
		{
			System.out.println(a1[i]);
		}
		
		int sum1=0;
		for(int i=0; i<a1.length; i++)
		{
			sum1=sum1+a1[i];
		}
		System.out.println("Sum of first array: "+sum1);
		System.out.println("-----------------------------------------");
		
		System.out.println("Enter the size of first array: ");
		int size2=s.nextInt();
		
		int a2[]=new int[size2];
		
		System.out.println("\nEnter the values in array: ");
		for(int i=0; i<a1.length; i++)
		{
			a2[i]=s.nextInt();
		}
		
		System.out.println("\nDisplay first array: ");
		for(int i=0; i<a1.length; i++)
		{
			System.out.println(a2[i]);
		}
		
		int sum2=0;
		for(int i=0; i<a1.length; i++)
		{
			sum2=sum2+a2[i];
		}
		System.out.println("Sum of second array: "+sum2);
		System.out.println("-----------------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
