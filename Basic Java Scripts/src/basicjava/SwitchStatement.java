package basicjava;

import java.util.Scanner;

public class SwitchStatement 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter 1 for Area Of Circle");
		System.out.println("Enter 2 for Area Of Rectangle");
		System.out.println("Enter 3 for Area Of Square");
		int choices=s.nextInt();
		
		switch(choices)
		{
		case 1:
			System.out.println("-----Circle-----");
			System.out.println("Enter Radious: ");
			float r=s.nextFloat();
			float p=3.14f;
			System.out.println("Area Of Circle: "+(r*r*3.14f));
			break;
			
		case 2:
			System.out.println("\n-----Rectangle-----");
			System.out.println("Enter Height: ");
			float h=s.nextFloat();
			System.out.println("Enter Base: ");
			float b=s.nextFloat();
			System.out.println("Area Of Rectangle: "+(h*b));
			break;
			
		case 3:
			System.out.println("\n-----Square-----");
			System.out.println("Enter Square: ");
			float square=s.nextFloat();
			System.out.println("Area Of Square: "+(square*square));
			break;
			default:
			System.out.println("Incorrect Input..");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
