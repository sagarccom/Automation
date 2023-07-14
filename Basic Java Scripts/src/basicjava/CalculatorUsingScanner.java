package basicjava;

import java.util.Scanner;

public class CalculatorUsingScanner 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int a=s.nextInt();
		
		System.out.println("Enter Second Number: ");
		int b=s.nextInt();
		
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Division: "+(a/b));
		System.out.println("Multipliation: "+(a*b));
		
		
		
		
		
		
		
	}

}
