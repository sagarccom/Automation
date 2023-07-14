package basicjava;

import java.util.Scanner;

public class CreateArray 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int size=s.nextInt();
		
		int array[]=new int[size];
		
		System.out.println("\nEnter the values in array:  ");
		for(int i=0; i<array.length; i++)
		{
			array[i]=s.nextInt();
			
		}
		
		System.out.println("\nDisplay array: ");
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
