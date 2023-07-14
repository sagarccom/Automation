package basicjava;

import java.util.Scanner;

public class Area
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("*****AREA****");
		
		System.out.println("-----Circle-----");
		System.out.println("Enter Radious: ");
		float r=s.nextFloat();
		float p=3.14f;
		System.out.println("Area Of Circle: "+(r*r*3.14f));
		
		System.out.println("\n-----Rectangle-----");
		System.out.println("Enter Height: ");
		float h=s.nextFloat();
		System.out.println("Enter Base: ");
		float b=s.nextFloat();
		System.out.println("Area Of Rectangle: "+(h*b));
		
		System.out.println("\n-----Square-----");
		System.out.println("Enter Square: ");
		float square=s.nextFloat();
		System.out.println("Area Of Square: "+(square*square));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
